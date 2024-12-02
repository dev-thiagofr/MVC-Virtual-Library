package br.com.bibliotecaA3.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.bibliotecaA3.dao.LivroDao;
import br.com.bibliotecaA3.model.Livro;
import br.com.bibliotecaA3.service.LivroArvore;
import jakarta.annotation.PostConstruct;

@Controller
public class LivroController {
	
	 @Autowired
	    private LivroDao livroRepository;

	 	private LivroArvore arvoreLivros = new LivroArvore();
	    private boolean load = false;

	    private void carregarLivrosNaArvore() {
	        if (!load) {
	            List<Livro> livros = livroRepository.buscaLivros();
	            for (Livro livro : livros) {
	                arvoreLivros.add(livro);
	            }
	            load = true;
	        }
	    }

	    // Método de busca de livros
	    @GetMapping("/buscarLivro")
	    public String buscarLivro(@RequestParam String titulo, Model model) {
	        carregarLivrosNaArvore();
	        
	        if (titulo != null && !titulo.trim().isEmpty()) {
	            // Verifica se o livro existe na árvore
	            Livro livro = arvoreLivros.getLivroPorTitulo(titulo);
	            if (livro != null) {
	                // Passa o livro para o modelo
	                model.addAttribute("livro", livro);
	                return "detalheslivro";  // Página de detalhes do livro
	            } else {
	                model.addAttribute("resultado", "Livro não encontrado.");
	            }
	        }
	        
	        model.addAttribute("resultado", "Título não encontrado.");
	        return "livros";  // Página de busca de livros
	    }
	    
	    // Página para mostrar os detalhes de um livro
	    @GetMapping("/detalheLivro")
	    public String detalheLivro(@RequestParam String titulo, Model model) {
	        carregarLivrosNaArvore();
	        
	        // Procura o livro pelo título
	        Livro livro = arvoreLivros.getLivroPorTitulo(titulo);
	        if (livro != null) {
	            model.addAttribute("livro", livro);
	            return "detalheslivro";  // Retorna a página de detalhes
	        } else {
	            model.addAttribute("resultado", "Livro não encontrado.");
	            return "livros";  // Caso o livro não exista
	        }
	    }
}
