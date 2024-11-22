package br.com.bibliotecaA3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.bibliotecaA3.dao.UsuarioDao;
import br.com.bibliotecaA3.model.Usuario;
import jakarta.servlet.http.HttpSession;

@RestController
public class AlterarController {
	
	@Autowired
	private UsuarioDao userrepo;
	

}
