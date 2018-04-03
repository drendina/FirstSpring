package it.sopra.prova.dto;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class Book {
	
	// new comment 2
	
	@Size(min = 1, message = "Il campo nome non può essere vuoto")
	@Pattern(regexp = "[A-Za-z0-9 _]+", message = "Il campo nome può essere composto solo da lettere")
	private String nome;

	@NotNull
	@Size(min = 1, message = "Il campo autore non può essere vuoto")
	@Pattern(regexp = "[A-Za-z ']+", message = "Il campo autore può essere composto solo da lettere")
	private String autore;

	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@NotNull(message = "Il campo Data di Uscita non può essere vuoto")
	private Date dataDiUscita;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public Date getDataDiUscita() {
		return dataDiUscita;
	}

	public void setDataDiUscita(Date dataDiUscita) {
		this.dataDiUscita = dataDiUscita;
	}

}
