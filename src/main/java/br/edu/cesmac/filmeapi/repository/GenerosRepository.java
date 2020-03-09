package br.edu.cesmac.filmeapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.edu.cesmac.filmeapi.domain.Genero;

@Repository
public interface GenerosRepository extends JpaRepository<Genero, Long> {

}
