package br.edu.unifei.ecot13a.projetoLOL;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data 
@Entity
@EqualsAndHashCode(callSuper = false)
public class Ionia extends Regiao {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9035619367060780487L;
	private int soldados;

}
