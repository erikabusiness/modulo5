package tde.modulo5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tde.modulo5.entities.Destino;


@Repository
public interface DestinoRepository extends JpaRepository<Destino, Long> {

}