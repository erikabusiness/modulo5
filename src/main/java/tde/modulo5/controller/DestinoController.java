package tde.modulo5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import tde.modulo5.entities.Destino;
import tde.modulo5.repositories.DestinoRepository;


@Controller
@RequestMapping("/destinos")
public class DestinoController {

	@Autowired
	private DestinoRepository destinoRepository;

	@GetMapping
	public ModelAndView destino() {
		ModelAndView modelAndView = new ModelAndView("destinos.html");
		modelAndView.addObject("destino", destinoRepository.findAll());

		modelAndView.addObject("destino", new Destino());

		return modelAndView;
	}

	@PostMapping("/cadastrar")
	public String cadastrar(Destino destino) {
		destinoRepository.save(destino);

		return "redirect:/destinos";
	}

	@GetMapping("/{id}/excluir")
	public String excluir(@PathVariable Long idDestino) {
		destinoRepository.deleteById(idDestino);

		return "redirect:/destinos";
	}

}

