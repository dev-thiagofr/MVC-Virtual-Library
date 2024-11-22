package br.com.bibliotecaA3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.bibliotecaA3.dao.UsuarioDao;
import br.com.bibliotecaA3.model.Usuario;


@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioDao usuariorepositorio;
	
	@GetMapping("/cadastro")
	public ModelAndView cadastrar(Usuario usuario) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("cadastro");
		mv.addObject("usuario",new Usuario());
		return mv;
	}
	@PostMapping("/cadastro")
	public ModelAndView cadastrando(Usuario usuario) {
		ModelAndView mv= new ModelAndView();
		mv.setViewName("redirect:/login");
		usuariorepositorio.save(usuario);
		
		return mv;
		
	}
	
	
}	
