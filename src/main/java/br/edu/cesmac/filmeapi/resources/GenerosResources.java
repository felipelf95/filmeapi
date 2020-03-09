package br.edu.cesmac.filmeapi.resources;

import br.edu.cesmac.filmeapi.domain.Genero;
import br.edu.cesmac.filmeapi.repository.GenerosRepository;

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

@RestController
@RequestMapping("/generos")
public class GenerosResources {

	@Autowired
	private GenerosRepository generosRepository;

	@GetMapping
	public List<Genero> Listar() {
		return generosRepository.findAll();
	}
	
	@PostMapping
	public ResponseEntity <Void> Salvar (@RequestBody Genero genero) {
		generosRepository.save(genero);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(genero.getIdGenero()).toUri();
				return ResponseEntity.created(uri).build();
	}
	
	@PutMapping
	public void Atualizar (@RequestBody Genero genero) {
		generosRepository.save(genero);
	}
	
	@DeleteMapping
	public void Deletar (@RequestBody Genero genero) {
		generosRepository.delete(genero);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Genero> BuscaPorId(@PathVariable("id") Long idGenero){
		return generosRepository.findById(idGenero).map(genero -> 
		ResponseEntity.ok(genero)).orElse(ResponseEntity.notFound().build());
	}
	
	
	
	
	
	
}
