package br.edu.unifei.ecot13a.projetoLOL;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data 
@Entity
@EqualsAndHashCode(callSuper = false)
public class GolpeMagico extends Golpe {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2446880623467546404L;

	@Override
	public void golpear(Ser s1, Ser s2) {
		int dm = s1.getStatus().getDanoMagico();
		int resm = s2.getStatus().getResistenciaMagica();
		if(dm > resm)
			s2.getStatus().setVida(s2.getStatus().getVida() - dm + resm);
	}
	
}
