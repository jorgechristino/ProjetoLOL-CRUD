package br.edu.unifei.ecot13a.projetoLOL;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data 
@Entity
@EqualsAndHashCode(callSuper = false)
public class ArmaSimples extends Arma {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3163648411457207537L;
	private int durabilidade;
	public ArmaSimples() {}
	public ArmaSimples(Dano d) {
		super(d);
	}
	
}
