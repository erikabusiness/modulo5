package tde.modulo5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import tde.modulo5.entities.Usuario;
import tde.modulo5.repositories.UsuarioRepository;


@Controller
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;

//	@GetMapping
//	public ModelAndView usuario() {
//		ModelAndView modelAndView = new ModelAndView("usuario2.html");
//		modelAndView.addObject("usuarios", usuarioRepository.findAll());
//
//		modelAndView.addObject("usuario", new Usuario());
//
//		return modelAndView;
//	}
	
	@GetMapping
    public ModelAndView listar() {
        ModelAndView modelAndView = new ModelAndView("usuario/index.html");

        List<Usuario> usuarios = usuarioRepository.findAll();
        modelAndView.addObject("usuarios", usuarios);

        return modelAndView;
    }

	@PostMapping("/cadastrar")
	public String cadastrar(Usuario usuario) {
		usuarioRepository.save(usuario);

		return "redirect:/usuario";
	}

	@GetMapping("/{id}/excluir")
	public String excluir(@PathVariable Long idUsuario) {
		usuarioRepository.deleteById(idUsuario);

		return "redirect:/usuario";
	}

}
