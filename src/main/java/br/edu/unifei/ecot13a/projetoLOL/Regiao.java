package br.edu.unifei.ecot13a.projetoLOL;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data 
@Entity
public abstract class Regiao implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3656441698782370356L;
	@Id
	private String nome;
	private String regime;
	private String nivelTecnologia;
	@OneToMany
	private List<Local> locais = new ArrayList<Local>();
	
}
