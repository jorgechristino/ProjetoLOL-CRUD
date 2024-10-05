package br.edu.unifei.ecot13a.projetoLOL;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data 
@Entity
public class Batalha implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5112565065923357647L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)   
	private int id;
	@OneToOne
	private Ser ser1;
	@OneToOne
	private Ser ser2;
	@OneToOne
	private Golpe golpe;
	@OneToOne
	private Local local;
	public void executaGolpe(Ser s1, Ser s2) {
		if (golpe != null)
			golpe.golpear(s1, s2);
	}
	
}
