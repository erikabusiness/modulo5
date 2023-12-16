package tde.modulo5.controller;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
    
   /*List<Usuario> usuarios = usuarioRepository.findAll();*/
   /* List<Destino> destinos = destinoRepository.findAll();*/

	@GetMapping
	public ModelAndView reservas() {
		ModelAndView modelAndView = new ModelAndView("reserva/index.html");
		
		modelAndView.addObject("listaUsuarios", usuarioRepository.findAll());
		modelAndView.addObject("listaDestino", destinoRepository.findAll());
		modelAndView.addObject("reserva", reservaRepository.findAll());
		modelAndView.addObject("reserva", new Reserva());
		

		return modelAndView;
	}
	
	@GetMapping("/cadastrar")
    public ModelAndView cadastrar() {
        ModelAndView modelAndView = new ModelAndView("reserva/create"); //nome da pasta/ nome do html
        
        modelAndView.addObject("reserva", new Reserva());
        modelAndView.addObject("listaUsuarios", usuarioRepository.findAll());
		modelAndView.addObject("listaDestino", destinoRepository.findAll());

        return modelAndView;
    }

	@PostMapping("/cadastrar")
	public ModelAndView cadastrar(Reserva reserva) {
		
		ModelAndView modelAndView = new ModelAndView("redirect:/reserva");
				
		reservaRepository.save(reserva);
		
		return modelAndView;
	}
	
	
	@GetMapping("/{id}/editar")
    public ModelAndView editar(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("reserva/edit");
        modelAndView.addObject(reservaRepository.getReferenceById(id));
        
        modelAndView.addObject("listaUsuarios", usuarioRepository.findAll());
		modelAndView.addObject("listaDestino", destinoRepository.findAll());

        return modelAndView;
    }
	
	@PostMapping("/{id}/editar")
    public ModelAndView editar(Reserva reserva) {
		reservaRepository.save(reserva);
        ModelAndView modelAndView = new ModelAndView("redirect:/reserva");

        return modelAndView;
    }

	@GetMapping("/{id}/excluir")
    public ModelAndView excluir(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("redirect:/reserva");

        reservaRepository.deleteById(id);

        return modelAndView;
    }
}