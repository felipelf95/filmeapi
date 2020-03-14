package br.edu.cesmac.filmeapi.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Filme {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	public long IdFilme;
	public String Titulo;
	public String DataLancamento;
	public String Sinopse;
	@ManyToOne
	public Genero genero;
	
	public Filme () {
		
	}

	public Filme(long idFilme, String titulo, String dataLancamento, String sinopse, Genero genero) {
		
		this.IdFilme = idFilme;
		this.Titulo = titulo;
		this.DataLancamento = dataLancamento;
		this.Sinopse = sinopse;
		this.genero = genero;
	}

	public long getIdFilme() {
		return IdFilme;
	}

	public void setIdFilme(long idFilme) {
		this.IdFilme = idFilme;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		this.Titulo = titulo;
	}

	public String getDataLancamento() {
		return DataLancamento;
	}

	public void setDataLancamento(String dataLancamento) {
		this.DataLancamento = dataLancamento;
	}

	public String getSinopse() {
		return Sinopse;
	}

	public void setSinopse(String sinopse) {
		this.Sinopse = sinopse;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	

	
	
	
	

}
