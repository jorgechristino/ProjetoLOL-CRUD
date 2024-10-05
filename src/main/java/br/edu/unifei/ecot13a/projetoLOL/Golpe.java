package br.edu.unifei.ecot13a.projetoLOL;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data 
@Entity
public abstract class Golpe implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4768456763213064325L;
	@Id
	private String nome;
	public abstract void golpear(Ser s1, Ser s2);
}
