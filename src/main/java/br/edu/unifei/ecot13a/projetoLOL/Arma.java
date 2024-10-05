package br.edu.unifei.ecot13a.projetoLOL;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data 
@Entity
public abstract class Arma implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7809617088824509997L;
	@Id
	private String nome;
	private String tipo;
	@OneToOne
	private Dano dano;
	public Arma() {}
	public Arma(Dano d) {
		dano = d;
	}
	public int danoAdicionalFisico() {
		return dano.danoAdicionalFisico();
	}
	public int danoAdicionalMagico() {
		return dano.danoAdicionalMagico();
	}
	
}
