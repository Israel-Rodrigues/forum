package br.com.foursys.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Classe Hello para dar sorte no Spring Boot
 * 
 * @author Israel Oliveira Rodrigues
 * @since 17/05/2021
 * @version 1.0
 *
 */
@Controller
public class HelloController {
	
	@RequestMapping("/") // Anotação para mapeamento da requisição do navegador
	@ResponseBody //Anotação que controla o conteúdo e não procura uma página com o contexto retornado
	public String hello() {
		return "Hello World!";
	}

}
