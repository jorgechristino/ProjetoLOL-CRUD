package br.edu.unifei.ecot13a.projetoLOL.form;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.edu.unifei.ecot13a.projetoLOL.Arma;
import br.edu.unifei.ecot13a.projetoLOL.Regiao;
import br.edu.unifei.ecot13a.projetoLOL.Ser;
import java.awt.Color;

public class SerFormInsere extends JFrame {
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetoLOL");
	private EntityManager em = emf.createEntityManager();
	private Ser s;

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtAlcunha;
	private JTextField txtEspecie;
	
	List<Arma> armas = em.createQuery("FROM Arma a").getResultList();
	List<Regiao> regioes = em.createQuery("FROM Regiao r").getResultList();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SerFormInsere frame = new SerFormInsere();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SerFormInsere() {
		setResizable(false);
		setTitle("Projeto League of Legends");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 715, 580);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
				
		JLabel lblTitulo = new JLabel("INSERIR NOVO SER");
		lblTitulo.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblTitulo.setBounds(25, 25, 190, 14);
		contentPane.add(lblTitulo);
		
		JLabel lblNome = new JLabel("NOME");
		lblNome.setForeground(new Color(155, 155, 155));
		lblNome.setFont(new Font("Arial", Font.BOLD, 12));
		lblNome.setBounds(25, 60, 65, 14);
		contentPane.add(lblNome);
		
		JLabel lblIdade = new JLabel("IDADE");
		lblIdade.setForeground(new Color(155, 155, 155));
		lblIdade.setFont(new Font("Arial", Font.BOLD, 12));
		lblIdade.setBounds(25, 200, 65, 14);
		contentPane.add(lblIdade);
		
		JLabel lblAlcunha = new JLabel("ALCUNHA");
		lblAlcunha.setForeground(new Color(155, 155, 155));
		lblAlcunha.setFont(new Font("Arial", Font.BOLD, 12));
		lblAlcunha.setBounds(25, 130, 65, 14);
		contentPane.add(lblAlcunha);
		
		JLabel lblEspecie = new JLabel("ESPÉCIE");
		lblEspecie.setForeground(new Color(155, 155, 155));
		lblEspecie.setFont(new Font("Arial", Font.BOLD, 12));
		lblEspecie.setBounds(25, 410, 65, 14);
		contentPane.add(lblEspecie);
		
		JLabel lblArma = new JLabel("ARMA");
		lblArma.setForeground(new Color(155, 155, 155));
		lblArma.setFont(new Font("Arial", Font.BOLD, 12));
		lblArma.setBounds(25, 270, 65, 14);
		contentPane.add(lblArma);
		
		JLabel lblRegiao = new JLabel("REGIÃO");
		lblRegiao.setForeground(new Color(155, 155, 155));
		lblRegiao.setFont(new Font("Arial", Font.BOLD, 12));
		lblRegiao.setBounds(25, 340, 65, 14);
		contentPane.add(lblRegiao);
		
		txtNome = new JTextField();
		txtNome.setForeground(new Color(0, 0, 0));
		txtNome.setBackground(new Color(255, 255, 255));
		txtNome.setFont(new Font("Arial", Font.BOLD, 12));
		txtNome.setBounds(25, 80, 212, 28);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtAlcunha = new JTextField();
		txtAlcunha.setBackground(new Color(255, 255, 255));
		txtAlcunha.setFont(new Font("Arial", Font.BOLD, 12));
		txtAlcunha.setBounds(25, 150, 212, 28);
		contentPane.add(txtAlcunha);
		txtAlcunha.setColumns(10);
		
		final JSpinner spnIdade = new JSpinner();
		spnIdade.setBackground(new Color(255, 255, 255));
		spnIdade.setFont(new Font("Arial", Font.BOLD, 12));
		spnIdade.setBounds(25, 220, 212, 28);
		contentPane.add(spnIdade);
		
		final JComboBox<String> cbArma = new JComboBox<String>();
		cbArma.setBackground(new Color(255, 255, 255));
		cbArma.setFont(new Font("Arial", Font.BOLD, 12));
		for(Arma a : armas) {
			cbArma.addItem(a.getNome());
		}
		cbArma.setBounds(25, 290, 212, 28);
		contentPane.add(cbArma);
		
		final JComboBox<String> cbRegiao = new JComboBox<String>();
		cbRegiao.setBackground(new Color(255, 255, 255));
		cbRegiao.setFont(new Font("Arial", Font.BOLD, 12));
		for(Regiao r : regioes) {
			cbRegiao.addItem(r.getNome());
		}
		cbRegiao.setBounds(25, 360, 212, 28);
		contentPane.add(cbRegiao);
		
		txtEspecie = new JTextField();
		txtEspecie.setBackground(new Color(255, 255, 255));
		txtEspecie.setFont(new Font("Arial", Font.BOLD, 12));
		txtEspecie.setBounds(25, 430, 212, 28);
		contentPane.add(txtEspecie);
		       
		JButton btnInserir = new JButton("INSERIR");
		btnInserir.setBackground(new Color(212, 52, 60));
		btnInserir.setForeground(new Color(255, 255, 255));
		btnInserir.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                	s = new Ser();
    				s.setNome(txtNome.getText());
    				s.setAlcunha(txtAlcunha.getText());
    				s.setIdade((Integer)spnIdade.getValue());
    				s.setEspecie(txtEspecie.getText());
    				s.setArma(armas.get(cbArma.getSelectedIndex()));
    				s.setRegiao(regioes.get(cbRegiao.getSelectedIndex()));
    				
    				em.getTransaction().begin();
    				em.persist(s);
    				em.getTransaction().commit();
    				JOptionPane.showMessageDialog(null, "Ser inserido!", "Inserção", JOptionPane.INFORMATION_MESSAGE);
    				txtNome.setText("");
    				txtAlcunha.setText("");
    				spnIdade.setValue(0);
    				txtEspecie.setText("");
    				cbArma.setSelectedIndex(0);
    				cbRegiao.setSelectedIndex(0);
			}
		});
		btnInserir.setBounds(25, 490, 212, 30);
		contentPane.add(btnInserir);
					
		JButton btnAbreAltera = new JButton("ALTERAR SERES");
		btnAbreAltera.setBackground(new Color(255, 255, 255));
		btnAbreAltera.setFont(new Font("Arial", Font.BOLD, 12));
		btnAbreAltera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SerFormAltera formAltera = new SerFormAltera();
                formAltera.setVisible(true);
                formAltera.setLocationRelativeTo(null);
                dispose();
			}
		});
		btnAbreAltera.setBounds(360, 490, 150, 30);
		contentPane.add(btnAbreAltera);
		
		JButton btnAbreExcluir = new JButton("EXCLUIR SERES");
		btnAbreExcluir.setBackground(new Color(255, 255, 255));
		btnAbreExcluir.setFont(new Font("Arial", Font.BOLD, 12));
		btnAbreExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SerFormExcluir formExcluir = new SerFormExcluir();
                formExcluir.setVisible(true);
                formExcluir.setLocationRelativeTo(null);
                dispose();
			}
		});
		btnAbreExcluir.setBounds(520, 490, 150, 30);
		contentPane.add(btnAbreExcluir);
		
		JLabel lblImagem = new JLabel();
		lblImagem.setBounds(253, -34, 635, 590);
        ImageIcon imagem = new ImageIcon("src/main/resources/leagueoflegends.jpg");
        lblImagem.setIcon(imagem);
        contentPane.add(lblImagem);
			
	}
}
