package tde.modulo5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PagesController {

	@GetMapping({ "/", "/index" })
	public String home() {
		return "index";
	}
	
	@GetMapping("/promocoes")
	public String promocoes() {
		return "promocoes";
	}
	@GetMapping("/contato")
	public String contato() {
		return "contato";
	}
	
	@GetMapping("/reserva2")
	public String reserva() {
		return "reserva2";
	}
	 
	
	
}