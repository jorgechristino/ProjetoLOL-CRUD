package br.edu.unifei.ecot13a.projetoLOL;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data 
@Entity
@EqualsAndHashCode(callSuper = false)
public class GolpeFisico extends Golpe {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3183930131784798778L;

	@Override
	public void golpear(Ser s1, Ser s2) {
		int df = s1.getStatus().getDanoFisico();
		int arm = s2.getStatus().getArmadura();
		if(df > arm)
			s2.getStatus().setVida(s2.getStatus().getVida() - df + arm);
	}
	
}
