package br.edu.unifei.ecot13a.projetoLOL;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data 
@Entity
public class Status implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3429386387365284946L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)   
	private int id;
	private int danoFisico;
	private int danoMagico;
	private int resistenciaMagica;
	private int armadura;
	private int vida;
	
}
