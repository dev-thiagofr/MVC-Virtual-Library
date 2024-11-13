package br.com.bibliotecaA3.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.bibliotecaA3.dao.UsuarioDao;
import br.com.bibliotecaA3.model.Usuario;
import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {
	
	@Autowired
	private UsuarioDao usuariorepositorio;
	
	@Autowired
	private HttpSession httpSession;
	
	@GetMapping("/login")
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		return mv;
	}
	
	@PostMapping("/perfil")
	public String logando(Model model,Usuario usuarioParam ){
		Usuario teste= this.usuariorepositorio.loginVerifica(usuarioParam.getEmail(),usuarioParam.getSenha());
		if(teste!=null) {
			httpSession.setAttribute("usuarioLogado", teste);
			return "redirect:/perfil";
		}
		else {
			model.addAttribute("erro","Email ou senha inválida tente novamente!");
			return "redirect:/login";
		}
		 
	}
	@GetMapping("/perfil")
	public ModelAndView perfil( Model model ) {

		Usuario teste2 = (Usuario) httpSession.getAttribute("usuarioLogado");
		if(teste2!=null) {
			model.addAttribute("usuarioPerfil", teste2);
			ModelAndView mv=new ModelAndView();
			mv.setViewName("perfil");
			return mv;
		}
		else {
			return login();
		}
	}
	
	@GetMapping("/alterarDados")
	public ModelAndView alterarDadosPag(Model model){
		Usuario teste3 = (Usuario) httpSession.getAttribute("usuarioLogado");
		model.addAttribute("usuarioLogado", teste3);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("alterardados");
		return mv;

	}
	
	@PostMapping("/alterando")
	public ModelAndView alterando(@ModelAttribute("teste3") Usuario usuario) {
		if(usuario!=null){
		usuariorepositorio.save(usuario);
		}
		ModelAndView mv= new ModelAndView();
		mv.setViewName("/login");
		return mv;
		
	}
	
}
