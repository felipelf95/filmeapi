package br.edu.cesmac.filmeapi.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ator {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	public Long IdAtor;
	public String Nome;
	public String DataNascimento;
	public String Sexo;
	public String Biografia;
	
	public Ator () {
	}
	
	public Ator(Long idAtor, String nome, String dataNascimento, String sexo, String biografia) {
		
		this.IdAtor = idAtor;
		this.Nome = nome;
		this.DataNascimento = dataNascimento;
		this.Sexo = sexo;
		this.Biografia = biografia;
	}


	public Long getIdAtor() {
		return IdAtor;
	}
	public void setIdAtor(Long idAtor) {
		IdAtor = idAtor;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getDataNascimento() {
		return DataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		DataNascimento = dataNascimento;
	}
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	public String getBiografia() {
		return Biografia;
	}
	public void setBiografia(String biografia) {
		Biografia = biografia;
	}
	
}
