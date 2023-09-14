package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class PrincipalController {	
	
	//http://localhost:8080/universidad/paginas/principal
	@GetMapping ("/paginas/principal")
	public String paginaPrincipal() {
		return "vistaPrincipal";
	}


}
