package br.com.residencia.cinema.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Genero")
public class Genero {

	@Id
	@Column(name = "idgenero")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idGenero;
	
	@Column(name = "descricao",length = 100)
	private String descricao;

	public Integer getIdGenero() {
		return idGenero;
	}

	public void setIdGenero(Integer idGenero) {
		this.idGenero = idGenero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
