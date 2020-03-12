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
import br.edu.cesmac.filmeapi.domain.Genero;
import br.edu.cesmac.filmeapi.repository.AtoresRepository;
import br.edu.cesmac.filmeapi.repository.GenerosRepository;

@RestController
@RequestMapping("/atores")
public class AtoresResources {
	@Autowired
	private AtoresRepository atoresRepository;

	@GetMapping
	public List<Ator> Listar() {
		return atoresRepository.findAll();
	}
	
	@PostMapping
	public ResponseEntity <Void> Salvar (@RequestBody Ator ator) {
		atoresRepository.save(ator);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(ator.getIdAtor()).toUri();
				return ResponseEntity.created(uri).build();
	}
	
	@PutMapping
	public void Atualizar (@RequestBody Ator ator) {
		atoresRepository.save(ator);
	}
	
	@DeleteMapping
	public void Deletar (@RequestBody Ator ator) {
		atoresRepository.delete(ator);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Ator> BuscaPorId(@PathVariable("id") Long idAtor){
		return atoresRepository.findById(idAtor).map(ator -> 
		ResponseEntity.ok(ator)).orElse(ResponseEntity.notFound().build());
	}
	
}
