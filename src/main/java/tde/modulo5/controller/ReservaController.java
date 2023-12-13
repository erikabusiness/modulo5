package tde.modulo5.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import tde.modulo5.entities.Reserva;
import tde.modulo5.repositories.DestinoRepository;
import tde.modulo5.repositories.ReservaRepository;
import tde.modulo5.repositories.UsuarioRepository;



@Controller
@RequestMapping("/reserva")
public class ReservaController {
        
	@Autowired
	private ReservaRepository reservaRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private DestinoRepository destinoRepository;

	@GetMapping
	public ModelAndView reservas() {
		ModelAndView modelAndView = new ModelAndView("views/reserva/index.html");

		modelAndView.addObject("listaUsuarios", usuarioRepository.findAll());
		modelAndView.addObject("listaDestino", destinoRepository.findAll());
		modelAndView.addObject("reserva", reservaRepository.findAll());
		modelAndView.addObject("reserva", new Reserva());
		

		return modelAndView;
	}

	@PostMapping("/cadastrar")
	public String cadastrar(@Validated @ModelAttribute("reserva") Reserva reserva, BindingResult result, ModelMap model) {

        if (result.hasErrors()) {
            return "reserva";
        }

        model.addAttribute("Checkin", reserva.getCheckin());
        model.addAttribute("Checkout", reserva.getCheckout());
        model.addAttribute("Destino", reserva.getIdDestino());
        model.addAttribute("idReserva", reserva.getIdReserva());
        model.addAttribute("Usuario", reserva.getIdUsuario());

        reservaRepository.save(reserva);

		return "redirect:/reserva";
	}

	@GetMapping("/{id}/excluir")
	public String excluir(@PathVariable Long idReserva) {
		reservaRepository.deleteById(idReserva);

		return "redirect:/reserva";
	}
}