package br.edu.unifei.ecot13a.projetoLOL;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data 
@Entity
@EqualsAndHashCode(callSuper = false)
public class Magico extends Dano {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8236495523194303076L;
	private int danoMagico;
	public int danoAdicionalFisico() {
		return 0;
	}
	public int danoAdicionalMagico() {
		return danoMagico;
	}
	
}
