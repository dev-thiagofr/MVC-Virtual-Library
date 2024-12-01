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
	        
	        String result = "";
	        
	        if (titulo != null && !titulo.trim().isEmpty()) {
	            // Verifica se o livro existe na árvore
	            boolean existe = arvoreLivros.exists(titulo);
	            result = existe ? "Titulo: " + titulo : "Livro não encontrado.";
	            
	        }

	        model.addAttribute("resultado", result);
	        return "livros";  
	    }
}
