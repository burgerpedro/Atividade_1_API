package br.com.residencia.cinema.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Filme")
public class Filme {
	
	@Id
	@Column(name = "idfilme")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idFilme;
	
	@Column(name = "nomebr",length = 100)
	private String nomeBr;
	
	@Column(name ="nomeen",length = 100)
	private String nomeEn;
	
	@Column(name = "anolacamento")
	private Timestamp anoLancamento;
	
	@Column(name = "sipnose",length = 200)
	private String sipnose;
	
	
	private Diretor diretor;
	 
	
	private Genero genero;
}
