package br.edu.unifei.ecot13a.projetoLOL.form;

import java.awt.Color;
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

public class SerFormAltera extends JFrame {
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
					SerFormAltera frame = new SerFormAltera();
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
	public SerFormAltera() {
		setResizable(false);
		setTitle("Projeto League of Legends");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 715, 580);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("ALTERAR SER");
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
		txtNome.setEnabled(false);
		txtNome.setForeground(new Color(0, 0, 0));
		txtNome.setBackground(new Color(255, 255, 255));
		txtNome.setFont(new Font("Arial", Font.BOLD, 12));
		txtNome.setBounds(25, 80, 212, 28);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtAlcunha = new JTextField();
		txtAlcunha.setEnabled(false);
		txtAlcunha.setBackground(new Color(255, 255, 255));
		txtAlcunha.setFont(new Font("Arial", Font.BOLD, 12));
		txtAlcunha.setBounds(25, 150, 212, 28);
		contentPane.add(txtAlcunha);
		txtAlcunha.setColumns(10);
		
		final JSpinner spnIdade = new JSpinner();
		spnIdade.setEnabled(false);
		spnIdade.setBackground(new Color(255, 255, 255));
		spnIdade.setFont(new Font("Arial", Font.BOLD, 12));
		spnIdade.setBounds(25, 220, 212, 28);
		contentPane.add(spnIdade);
		
		final JComboBox<String> cbArma = new JComboBox<String>();
		cbArma.setEnabled(false);
		cbArma.setBackground(new Color(255, 255, 255));
		cbArma.setFont(new Font("Arial", Font.BOLD, 12));
		for(Arma a : armas) {
			cbArma.addItem(a.getNome());
		}
		cbArma.setBounds(25, 290, 212, 28);
		contentPane.add(cbArma);
		
		final JComboBox<String> cbRegiao = new JComboBox<String>();
		cbRegiao.setEnabled(false);
		cbRegiao.setBackground(new Color(255, 255, 255));
		cbRegiao.setFont(new Font("Arial", Font.BOLD, 12));
		for(Regiao r : regioes) {
			cbRegiao.addItem(r.getNome());
		}
		cbRegiao.setBounds(25, 360, 212, 28);
		contentPane.add(cbRegiao);
		
		txtEspecie = new JTextField();
		txtEspecie.setEnabled(false);
		txtEspecie.setBackground(new Color(255, 255, 255));
		txtEspecie.setFont(new Font("Arial", Font.BOLD, 12));
		txtEspecie.setBounds(25, 430, 212, 28);
		contentPane.add(txtEspecie);
		
		JLabel lblId = new JLabel("ID");
		lblId.setForeground(new Color(0, 0, 0));
		lblId.setFont(new Font("Arial", Font.BOLD, 12));
		lblId.setBounds(360, 60, 46, 14);
		contentPane.add(lblId);
		
		final JSpinner spnId = new JSpinner();
		spnId.setBackground(new Color(255, 255, 255));
		spnId.setBounds(360, 80, 150, 28);
		contentPane.add(spnId);
		
		final JButton btnAlterar = new JButton("ALTERAR");
		btnAlterar.setEnabled(false);
		btnAlterar.setForeground(new Color(255, 255, 255));
		btnAlterar.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
    				s.setNome(txtNome.getText());
    				s.setAlcunha(txtAlcunha.getText());
    				s.setIdade((Integer)spnIdade.getValue());
    				s.setEspecie(txtEspecie.getText());
    				s.setArma(armas.get(cbArma.getSelectedIndex()));
    				s.setRegiao(regioes.get(cbRegiao.getSelectedIndex()));
    				
    				btnAlterar.setEnabled(false);
    				btnAlterar.setBackground(new Color(240, 240, 240));
    				spnId.setEnabled(true);
    				em.getTransaction().begin();
    				em.merge(s);
    				em.getTransaction().commit();	
    				JOptionPane.showMessageDialog(null, "Ser atualizado!", "Atualização", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnAlterar.setBounds(25, 490, 212, 30);
		contentPane.add(btnAlterar);
		
		JButton btnBuscar = new JButton("BUSCAR");
		btnBuscar.setForeground(new Color(255, 255, 255));
		btnBuscar.setBackground(new Color(212, 52, 60));
		btnBuscar.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s = em.find(Ser.class,(Integer)spnId.getValue());
				if(s != null) {
					spnId.setEnabled(false);
					txtNome.setEnabled(true);
					txtNome.setText(s.getNome());
					txtAlcunha.setEnabled(true);
					txtAlcunha.setText(s.getAlcunha());
					spnIdade.setEnabled(true);
					spnIdade.setValue(s.getIdade());
					txtEspecie.setEnabled(true);
					txtEspecie.setText(s.getEspecie());
					cbArma.setEnabled(true);
					if(s.getArma() != null) cbArma.setSelectedItem(s.getArma().getNome());
					cbRegiao.setEnabled(true);
					cbRegiao.setSelectedItem(s.getRegiao().getNome());
					
					btnAlterar.setEnabled(true);
					btnAlterar.setBackground(new Color(212, 52, 60));
				}else {
					JOptionPane.showMessageDialog(null, "Ser procurado não existe", "Mensagem", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnBuscar.setBounds(520, 80, 150, 28);
		contentPane.add(btnBuscar);
		
		JButton btnAbreInserir = new JButton("INSERIR SERES");
		btnAbreInserir.setBackground(new Color(255, 255, 255));
		btnAbreInserir.setFont(new Font("Arial", Font.BOLD, 12));
		btnAbreInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SerFormInsere formInsere = new SerFormInsere();
                formInsere.setVisible(true);
                formInsere.setLocationRelativeTo(null);
                dispose();
			}
		});
		btnAbreInserir.setBounds(360, 490, 150, 30);
		contentPane.add(btnAbreInserir);
		
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
