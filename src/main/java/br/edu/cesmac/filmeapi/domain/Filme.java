package br.edu.cesmac.filmeapi.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Filme {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	public Long IdFilme;
	public String Titulo;
	public String DataLancamento;
	public String Sinopse;
	@ManyToMany
	public Genero Genero;
	
	public Filme () {
	}
	
	public Filme(long idFilme, String titulo,String dataLancamento,String sinopse,Genero genero) {
		
		this.IdFilme = idFilme;
		this.Titulo = titulo;
		this.DataLancamento = dataLancamento;
		this.Sinopse = sinopse;
		this.Genero = genero;
	}

	public Long getIdFIlme() {
		return IdFilme;
	}

	public void setTitulo(long IdFilme) {
		IdFilme = IdFilme;
	}
	
	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getDataLancamento() {
		return DataLancamento;
	}

	public void setDataLancamento(String dataLancamento) {
		DataLancamento = dataLancamento;
	}

	public String getSinopse() {
		return Sinopse;
	}

	public void setSinopse(String sinopse) {
		Sinopse = sinopse;
	}

	public Genero getGenero() {
		return Genero;
	}

	public void setGenero(Genero genero) {
		Genero = genero;
	}
	
	
	

}
