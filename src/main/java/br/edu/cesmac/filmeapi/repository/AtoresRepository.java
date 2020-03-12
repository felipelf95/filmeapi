package br.edu.cesmac.filmeapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.cesmac.filmeapi.domain.Ator;
import br.edu.cesmac.filmeapi.domain.Genero;

public interface AtoresRepository extends JpaRepository<Ator, Long> {

}
