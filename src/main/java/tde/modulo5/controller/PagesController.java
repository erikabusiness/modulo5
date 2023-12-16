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
	@GetMapping("/destinos")
	public String destinosPage() {
		return "destinos";
	}
	
	@GetMapping("/reserva2")
	public String reserva() {
		return "reserva2";
	}
	 
	
	
}
