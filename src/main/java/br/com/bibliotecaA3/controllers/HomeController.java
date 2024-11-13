package br.com.bibliotecaA3.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class HomeController {
	
	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		return mv;
	}
	
	
	@GetMapping("/livros")
	public ModelAndView livros() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("livros");
		return mv;
	}
	
	@GetMapping("/drama")
	public ModelAndView drama() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("drama");
		return mv;
	}

	@GetMapping("/livroaqalsa")
	public ModelAndView proximoLivro() {
		ModelAndView mv= new ModelAndView();
		mv.setViewName("livroaqalsa");
		return mv;
	}
	
	@GetMapping("/devolver")
	public ModelAndView devolvendo() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("devolucao");
		return mv;
	}

}
