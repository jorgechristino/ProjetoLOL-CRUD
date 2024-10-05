package br.edu.unifei.ecot13a.projetoLOL;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data 
@Entity
public class Ser implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -109982340702134629L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)   
	private int id;
	private String nome;
	private String alcunha;
	private int idade;
	private String especie;
	@OneToOne
	private Status status;
	@OneToOne
	private Regiao regiao;
	@OneToOne
	private Arma arma;

	public void setArma(Arma arma) {
		this.arma = arma;
		if(this.getStatus() != null) {
			this.status.setDanoFisico(this.status.getDanoFisico() + arma.danoAdicionalFisico());
			this.status.setDanoMagico(this.status.getDanoMagico() + arma.danoAdicionalMagico());
		}
	}
	
}

