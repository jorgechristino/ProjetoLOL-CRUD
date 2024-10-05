package br.edu.unifei.ecot13a.projetoLOL;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetoLOL");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Random r = new Random();
		int i;
		
		//Regioes
		Piltover piltover = new Piltover();
		piltover.setNome("Piltover");
		piltover.setRegime("Oligarquia Aristocratica");
		piltover.setNivelTecnologia("Alto");
		piltover.setProducaoTecnologia(500);
		em.persist(piltover);
		
		Zaun zaun = new Zaun();
		zaun.setNome("Zaun");
		zaun.setRegime("Oligarquia Industrial");
		zaun.setNivelTecnologia("Alto");
		zaun.setPoluicao(75);
		em.persist(zaun);
		
		Noxus noxus = new Noxus();
		noxus.setNome("Noxus");
		noxus.setRegime("Imperio Expansionista");
		noxus.setNivelTecnologia("Mediano");
		noxus.setGuerreiros(1650);
		em.persist(noxus);

		Local placidio = new Local();
		placidio.setNome("Placidio de Navori");
		Local monasterio = new Local();
		monasterio.setNome("Monasterio Kinkou");
		em.persist(placidio);
		em.persist(monasterio);
		
		Ionia ionia = new Ionia();
		ionia.setNome("Ionia");
		ionia.setRegime("Provincias Regionais");
		ionia.setNivelTecnologia("Baixo");
		ionia.getLocais().add(placidio);
		ionia.getLocais().add(monasterio);
		ionia.setSoldados(3000);
		em.persist(ionia);

		//Arma - Rifle
		Fisico f1 = new Fisico();
		f1.setDanoFisico(8);
		em.persist(f1);
		ArmaTecnologica pacificadora = new ArmaTecnologica(f1);
		pacificadora.setNome("Pacificadora");
		pacificadora.setTipo("Rifle");
		pacificadora.setTecnologia("Hextech");
		em.persist(pacificadora);
		
		//Arma - Caduceu
		Magico m1 = new Magico();
		m1.setDanoMagico(8);
		em.persist(m1);
		ArmaTecnologica caduceu = new ArmaTecnologica(m1);
		caduceu.setNome("Caduceu Magico");
		caduceu.setTipo("Caduceu");
		caduceu.setTecnologia("Quimtech");
		em.persist(caduceu);
		
		//Arma - Arco
		Fisico f2 = new Fisico();
		f2.setDanoFisico(7);
		em.persist(f2);
		ArmaSimples arco = new ArmaSimples(f2);
		arco.setNome("Arco Darkin");
		arco.setTipo("Arco");
		arco.setDurabilidade(1000);
		em.persist(arco);
		
		//Arma - Katana
		Fisico f3 = new Fisico();
		f3.setDanoFisico(15);
		em.persist(f3);
		ArmaSimples katana = new ArmaSimples(f3);
		katana.setNome("Katana Manamune");
		katana.setTipo("Katana");
		katana.setDurabilidade(800);
		em.persist(katana);
		
		//Arma - Adaga
		Fisico f4 = new Fisico();
		f4.setDanoFisico(10);
		em.persist(f4);
		ArmaSimples adaga = new ArmaSimples(f4);
		adaga.setNome("Adaga");
		adaga.setTipo("Adaga");
		adaga.setDurabilidade(100);
		em.persist(adaga);
		
		//Seres
		Ser caitlyn = new Ser();
		caitlyn.setNome("Caitlyn");
		caitlyn.setAlcunha("Xerife de Piltover");
		caitlyn.setIdade(24);
		caitlyn.setEspecie("Humano");
		caitlyn.setRegiao(piltover);
		Status s1 = new Status();
		s1.setDanoFisico(72);
		s1.setDanoMagico(20);
		s1.setResistenciaMagica(15);
		s1.setArmadura(20);
		s1.setVida(150);
		em.persist(s1);
		caitlyn.setStatus(s1);
		caitlyn.setArma(pacificadora);
		em.persist(caitlyn);
		
		Ser renata = new Ser();
		renata.setNome("Renata Glasc");
		renata.setAlcunha("A Baronesa da Quimica");
		renata.setIdade(50);
		renata.setEspecie("Humano");
		renata.setRegiao(zaun);
		Status s2 = new Status();
		s2.setDanoFisico(5);
		s2.setDanoMagico(52);
		s2.setResistenciaMagica(35);
		s2.setArmadura(28);
		s2.setVida(170);
		em.persist(s2);
		renata.setStatus(s2);
		renata.setArma(caduceu);
		em.persist(renata);
		
		Ser katarina = new Ser();
		katarina.setNome("Katarina");
		katarina.setAlcunha("A Lâmina Sinistra");
		katarina.setIdade(28);
		katarina.setEspecie("Humano");
		katarina.setRegiao(noxus);
		em.persist(katarina);
		
		Ser varus = new Ser();
		varus.setNome("Varus");
		varus.setAlcunha("A flecha da Vinganca");
		varus.setIdade(3528);
		varus.setEspecie("Darkin");
		varus.setRegiao(ionia);
		Status s3 = new Status();
		s3.setDanoFisico(62);
		s3.setDanoMagico(25);
		s3.setResistenciaMagica(18);
		s3.setArmadura(27);
		s3.setVida(180);
		em.persist(s3);
		varus.setStatus(s3);
		varus.setArma(arco);
		em.persist(varus);
		
		//Mostrar todas Regioes e seus atributos
		List<Regiao> regioes = new ArrayList<Regiao>();
		regioes.add(piltover);
		regioes.add(zaun);
		regioes.add(noxus);
		regioes.add(ionia);
		System.out.println("--REGIOES--");
		for(Regiao c :  regioes) {
			i = 1;
			System.out.println("Nome: " + c.getClass().getSimpleName());
			System.out.println("Regime: " + c.getRegime());
			System.out.println("Nivel Tecnologico: " + c.getNivelTecnologia());
			if(c.getLocais() != null)
				for(Local l : c.getLocais()) {
					System.out.println("Local " + i +": " + l.getNome());
					i++;
				}
			System.out.println(" ");
		}
		
		//Mostrar todos seres e seus atributos
		List<Ser> seres = new ArrayList<Ser>();
		seres.add(caitlyn);
		seres.add(renata);
		seres.add(katarina);
		seres.add(varus);
		System.out.println("--SERES--");
		for(Ser s :  seres) {
			System.out.println("Nome: " + s.getNome());
			System.out.println("Alcunha: " + s.getAlcunha());
			System.out.println("Idade: " + s.getIdade());
			System.out.println("Espécie: " + s.getEspecie());
			System.out.println("Regiao: " + s.getRegiao().getNome());
			if(s.getArma() != null)
				System.out.println("Arma: " + s.getArma().getNome());
			if(s.getStatus() != null) {
				System.out.println("--Status--");
				System.out.println("Dano Fisico: " + s.getStatus().getDanoFisico());
				System.out.println("Dano Magico: " + s.getStatus().getDanoMagico());
				System.out.println("Resistencia Magica: " + s.getStatus().getResistenciaMagica());
				System.out.println("Armadura: " + s.getStatus().getArmadura());
				System.out.println("Vida: " + s.getStatus().getVida());
			}
			System.out.println(" ");
		}
		
		//Simulacao de uma Batalha
		Batalha batalha = new Batalha();
		batalha.setSer1(caitlyn);
		batalha.setSer2(varus);
		batalha.setLocal(placidio);
		//Golpes
		GolpeFisico gf = new GolpeFisico();
		gf.setNome("Golpe Físico");
		em.persist(gf);
		GolpeMagico gm = new GolpeMagico();
		gm.setNome("Golpe Mágico");
		em.persist(gm);
		System.out.println("--BATALHA-- \n" + batalha.getSer1().getNome() + " vs " + batalha.getSer2().getNome());
		System.out.println("Local: " + batalha.getLocal().getNome());
		System.out.println(" ");
		while((batalha.getSer1().getStatus().getVida() > 0) && (batalha.getSer2().getStatus().getVida() > 0)) {
			if(r.nextBoolean()) {
				batalha.setGolpe(gf);
			}else {
				batalha.setGolpe(gm);
			}
			switch (r.nextInt(2)) {
				case 0:
					batalha.executaGolpe(batalha.getSer1(), batalha.getSer2());
					System.out.println(batalha.getSer1().getNome() + " atacou " + batalha.getSer2().getNome() +
							" com " + batalha.getGolpe().getClass().getSimpleName());
					break;
				case 1:
					batalha.executaGolpe(batalha.getSer2(), batalha.getSer1());
					System.out.println(batalha.getSer2().getNome() + " atacou " + batalha.getSer1().getNome() +
							" com " + batalha.getGolpe().getClass().getSimpleName());
					break;
			}
			System.out.println(batalha.getSer1().getNome() + " - Vida = " + batalha.getSer1().getStatus().getVida());
			System.out.println(batalha.getSer2().getNome() + " - Vida = " + batalha.getSer2().getStatus().getVida());
			System.out.println(" ");
		}
		
		//Mostrando o vencedor
		if(batalha.getSer1().getStatus().getVida() <= 0) {
			System.out.println("Vencedor: " + batalha.getSer2().getNome());
		}
		else {
			System.out.println("Vencedor: " + batalha.getSer1().getNome());
		}
		em.persist(batalha);

		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
