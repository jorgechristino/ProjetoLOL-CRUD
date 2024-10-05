package br.edu.unifei.ecot13a.projetoLOL;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data 
@Entity
@EqualsAndHashCode(callSuper = false)
public class Noxus extends Regiao {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7668168045824798593L;
	private int guerreiros;
	
}
