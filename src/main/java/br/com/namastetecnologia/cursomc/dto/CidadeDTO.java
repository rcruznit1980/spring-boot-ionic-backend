package br.com.namastetecnologia.cursomc.dto;

import java.io.Serializable;

import br.com.namastetecnologia.cursomc.domain.Cidade;
import br.com.namastetecnologia.cursomc.domain.Estado;

public class CidadeDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nome;

	public CidadeDTO() {

	}

	public CidadeDTO(Cidade obj) {
		
		id = obj.getId();
		nome = obj.getNome();
	}
	
	public CidadeDTO(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
}
