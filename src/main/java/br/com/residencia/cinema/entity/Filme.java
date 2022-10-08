package br.com.residencia.cinema.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	
	@ManyToOne
	@JoinColumn(name = "iddiretor",referencedColumnName = "iddiretor")
	private Diretor diretor;
	 
	@ManyToOne
	@JoinColumn(name = "idgenero", referencedColumnName = "idgenero")
	private Genero genero;

	public Integer getIdFilme() {
		return idFilme;
	}

	public void setIdFilme(Integer idFilme) {
		this.idFilme = idFilme;
	}

	public String getNomeBr() {
		return nomeBr;
	}

	public void setNomeBr(String nomeBr) {
		this.nomeBr = nomeBr;
	}

	public String getNomeEn() {
		return nomeEn;
	}

	public void setNomeEn(String nomeEn) {
		this.nomeEn = nomeEn;
	}

	public Timestamp getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(Timestamp anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public String getSipnose() {
		return sipnose;
	}

	public void setSipnose(String sipnose) {
		this.sipnose = sipnose;
	}

	public Diretor getDiretor() {
		return diretor;
	}

	public void setDiretor(Diretor diretor) {
		this.diretor = diretor;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	
}
