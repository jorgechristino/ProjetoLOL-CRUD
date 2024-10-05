package br.edu.unifei.ecot13a.projetoLOL;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data 
@Entity
public abstract class Dano implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 58440606715606713L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)   
	private int codigo;
	public abstract int danoAdicionalFisico();
	public abstract int danoAdicionalMagico();
}
