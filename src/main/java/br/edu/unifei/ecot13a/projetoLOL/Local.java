package br.edu.unifei.ecot13a.projetoLOL;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data 
@Entity
public class Local implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6852357870370668876L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)   
	private int id;
	private String nome;
	
}
