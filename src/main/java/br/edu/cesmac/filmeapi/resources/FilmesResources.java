package br.edu.cesmac.filmeapi.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.edu.cesmac.filmeapi.domain.Ator;
import br.edu.cesmac.filmeapi.domain.Filme;
import br.edu.cesmac.filmeapi.repository.FilmesRepository;

@RestController
@RequestMapping("/filmes")
public class FilmesResources {
	
	@Autowired
	private FilmesRepository filmesRepository;
	
	@GetMapping
	public List<Filme> Listar() {
		return filmesRepository.findAll();
	}
	
	@PostMapping
	public ResponseEntity <Void> Salvar (@RequestBody Filme filme) {
		filmesRepository.save(filme);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(filme.getIdFilme()).toUri();
				return ResponseEntity.created(uri).build();
	}
	
	@PutMapping
	public void Atualizar (@RequestBody Filme filme) {
		filmesRepository.save(filme);
	}
	
	@DeleteMapping
	public void Deletar (@RequestBody Filme filme) {
		filmesRepository.delete(filme);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Filme> BuscaPorId(@PathVariable("id") Long idFilme){
		return filmesRepository.findById(idFilme).map(filme -> 
		ResponseEntity.ok(filme)).orElse(ResponseEntity.notFound().build());
	}
}
