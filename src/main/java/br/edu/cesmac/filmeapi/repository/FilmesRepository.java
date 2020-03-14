package br.edu.cesmac.filmeapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.edu.cesmac.filmeapi.domain.Filme;

public interface FilmesRepository extends JpaRepository<Filme, Long> {

}
