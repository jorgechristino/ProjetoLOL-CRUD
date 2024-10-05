package br.edu.unifei.ecot13a.projetoLOL;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data 
@Entity
@EqualsAndHashCode(callSuper = false)
public class Piltover extends Regiao {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2278654936293109089L;
	private int producaoTecnologia;
}
