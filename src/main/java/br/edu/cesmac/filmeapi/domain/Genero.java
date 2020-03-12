package br.edu.cesmac.filmeapi.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Genero {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long IdGenero;
	public String Nome;
	public String Descricao;

	public Genero() {
	}

	public Genero(Long idGenero, String nome, String descricao) {
		
		this.IdGenero = idGenero;
		this.Nome = nome;
		this.Descricao = descricao;
	}

	public Long getIdGenero() {
		return IdGenero;
	}

	public void setIdGenero(Long idGenero) {
		this.IdGenero = idGenero;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		this.Nome = nome;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		this.Descricao = descricao;
	}

}
