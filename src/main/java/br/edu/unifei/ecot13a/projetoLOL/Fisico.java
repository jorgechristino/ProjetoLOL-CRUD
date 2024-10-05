package br.edu.unifei.ecot13a.projetoLOL;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data 
@Entity
@EqualsAndHashCode(callSuper = false)
public class Fisico extends Dano {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4913212905661269843L;
	private int danoFisico;
	public int danoAdicionalFisico() {
		return danoFisico;
	}
	public int danoAdicionalMagico() {
		return 0;
	}
	
}
