package senai.almoxarife.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class TelaInicioForm extends JFrame {

	private JPanel contentPane;
	private JMenuItem itemUsuario;
	private JMenuItem itemMaterial;
	private JMenuItem itemSetor;
	private JMenuItem itemAlmoxarifado;
	private JMenuItem itemListUsurios;

	
	/**
	 * Create the frame.
	 */
	public TelaInicioForm() {

		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(d.width/4, d.height/4, 620, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		//Menu de tarefas
		JMenuBar menuBarMain = new JMenuBar();
		setJMenuBar(menuBarMain);
		
		//menu Cadastro
		JMenu menuCadastro = new JMenu("Cadastro");
		menuBarMain.add(menuCadastro);
		
		//item menu Cadastro Almoxarifado
		itemAlmoxarifado = new JMenuItem("Almoxarifado");
		itemAlmoxarifado.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				CadastroAlmoxatife cadAlmo = new CadastroAlmoxatife();
				cadAlmo.setVisible(true);
			}
		});
		menuCadastro.add(itemAlmoxarifado);
		
		//item menu Cadastro Material
		itemMaterial = new JMenuItem("Material");
		itemMaterial.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				CadastroMaterial cadMateri = new CadastroMaterial();
				cadMateri.setVisible(true);				
			}
		});
		menuCadastro.add(itemMaterial);
		
		//item menu Cadastro Setor
		itemSetor = new JMenuItem("Setor");
		itemSetor.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				CadastroSetor cadSetor = new CadastroSetor();
				cadSetor.setVisible(true);
			}
		});
		menuCadastro.add(itemSetor);
		
		//item menu Cadastro Ususario  
		itemUsuario = new JMenuItem("Usu\u00E1rio");
		itemUsuario.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				CadastroUser cadUser = new CadastroUser();
				cadUser.setVisible(true);
			}
		});
		menuCadastro.add(itemUsuario);
		
		/*-----------------||Menu Listagem||-------------------*/
		JMenu mnListagem = new JMenu("Listagem");
		menuBarMain.add(mnListagem);
		
		itemListUsurios = new JMenuItem("Usu\u00E1rios");
		mnListagem.add(itemListUsurios);
		
		/*-----------------||Menu de Relatorio||-------------------*/
		JMenu mnRelatrio = new JMenu("Relat\u00F3rio");
		menuBarMain.add(mnRelatrio);

	}
	

}
