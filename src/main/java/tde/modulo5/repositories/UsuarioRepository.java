package tde.modulo5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tde.modulo5.entities.Usuario;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}