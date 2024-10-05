package br.edu.unifei.ecot13a.projetoLOL;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data 
@Entity
@EqualsAndHashCode(callSuper = false)
public class Zaun extends Regiao {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4923471171847847453L;
	private int poluicao;
	
}
