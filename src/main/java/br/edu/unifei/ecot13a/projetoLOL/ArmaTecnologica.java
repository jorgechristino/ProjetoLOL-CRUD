package br.edu.unifei.ecot13a.projetoLOL;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data 
@Entity
@EqualsAndHashCode(callSuper = false)
public class ArmaTecnologica extends Arma {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1795319342115559670L;
	private String tecnologia;
	public ArmaTecnologica() {}
	public ArmaTecnologica(Dano d) {
		super(d);
	}
	
}
