package br.edu.cesmac.filmeapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.cesmac.filmeapi.domain.Ator;

public interface AtoresRepository extends JpaRepository<Ator, Long> {

}
