import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Cadastro extends JFrame {

	private JPanel contentPane;
	private JTextField tfID;
	private JTextField tfNomeEmpresa;
	private JTextField tfEndereco;
	private JTextField tfMunicipio;
	private JTextField tfCep;
	private JTextField tfTelefone;
	private JTextField tfCelular;
	private JTextField tfCPF;
	private JTextField tfCNPJ;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro frame = new Cadastro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Cadastro() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alunos\\Downloads\\1621331619025.jpg"));
		setTitle("Cadastro de Clientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 458, 386);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblPesquisar = new JLabel("Pesquisar: ");
		lblPesquisar.setBounds(10, 11, 72, 14);
		panel.add(lblPesquisar);
		
		JComboBox cbPesquisar = new JComboBox();
		cbPesquisar.setEditable(true);
		cbPesquisar.setBounds(100, 7, 286, 22);
		panel.add(cbPesquisar);
		cbPesquisar.addItem("TESTE 1");
		
		
		
		JLabel lblID = new JLabel("ID: ");
		lblID.setBounds(10, 36, 46, 14);
		panel.add(lblID);
		
		tfID = new JTextField();
		tfID.setEditable(false);
		tfID.setEnabled(false);
		tfID.setText("1");
		tfID.setBounds(100, 33, 46, 20);
		panel.add(tfID);
		tfID.setColumns(10);
		
		JLabel lblNomeOuEmpresa = new JLabel("Nome/Empresa:");
		lblNomeOuEmpresa.setBounds(10, 61, 80, 14);
		panel.add(lblNomeOuEmpresa);
		
		
		tfNomeEmpresa = new JTextField();
		tfNomeEmpresa.setHorizontalAlignment(SwingConstants.CENTER);
		tfNomeEmpresa.setBounds(100, 58, 286, 20);
		panel.add(tfNomeEmpresa);
		tfNomeEmpresa.setColumns(10);
		
		JLabel lblEndereco = new JLabel("Endere\u00E7o:");
		lblEndereco.setBounds(10, 86, 57, 14);
		panel.add(lblEndereco);
		
		tfEndereco = new JTextField();
		tfEndereco.setColumns(10);
		tfEndereco.setBounds(100, 83, 286, 20);
		panel.add(tfEndereco);
		
		JLabel lblMunicipio = new JLabel("Municipio:");
		lblMunicipio.setBounds(10, 111, 57, 14);
		panel.add(lblMunicipio);
		
		tfMunicipio = new JTextField();
		tfMunicipio.setColumns(10);
		tfMunicipio.setBounds(100, 108, 286, 20);
		panel.add(tfMunicipio);
		
		JLabel lblCep = new JLabel("Cep:");
		lblCep.setBounds(10, 136, 57, 14);
		panel.add(lblCep);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(10, 161, 57, 14);
		panel.add(lblTelefone);
		
		JLabel lblCelular = new JLabel("Celular:");
		lblCelular.setBounds(10, 186, 57, 14);
		panel.add(lblCelular);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(10, 211, 57, 14);
		panel.add(lblCpf);
		
		JLabel lblCnpj = new JLabel("CNPJ:");
		lblCnpj.setBounds(10, 236, 57, 14);
		panel.add(lblCnpj);
		
		JLabel lblGenero = new JLabel("G\u00EAnero: ");
		lblGenero.setBounds(10, 261, 57, 14);
		panel.add(lblGenero);
		
		tfCep = new JTextField();
		tfCep.setColumns(10);
		tfCep.setBounds(100, 133, 286, 20);
		panel.add(tfCep);
		
		tfTelefone = new JTextField();
		tfTelefone.setColumns(10);
		tfTelefone.setBounds(100, 158, 286, 20);
		panel.add(tfTelefone);
		
		tfCelular = new JTextField();
		tfCelular.setColumns(10);
		tfCelular.setBounds(100, 183, 286, 20);
		panel.add(tfCelular);
		
		tfCPF = new JTextField();
		tfCPF.setColumns(10);
		tfCPF.setBounds(100, 208, 286, 20);
		panel.add(tfCPF);
		
		tfCNPJ = new JTextField();
		tfCNPJ.setColumns(10);
		tfCNPJ.setBounds(100, 233, 286, 20);
		panel.add(tfCNPJ);
		
		JButton btnPesquisar = new JButton("");
		btnPesquisar.setIcon(new ImageIcon("C:\\Users\\Alunos\\Downloads\\kisspng-magnifying-glass-magnifier-blue-magnifying-glass-material-5a6e305d98c791.3285511915171707816258 (1) (1) (1).jpg"));
		btnPesquisar.setBounds(399, 6, 23, 23);
		panel.add(btnPesquisar);
		
		JRadioButton rdbtnMasculino = new JRadioButton("M");
		buttonGroup.add(rdbtnMasculino);
		rdbtnMasculino.setBounds(98, 257, 48, 23);
		panel.add(rdbtnMasculino);
		
		JRadioButton rdbtnFeminino = new JRadioButton("F");
		buttonGroup.add(rdbtnFeminino);
		rdbtnFeminino.setBounds(150, 257, 39, 23);
		panel.add(rdbtnFeminino);
		
		JButton btnSalvar = new JButton("");
		btnSalvar.setIcon(new ImageIcon("C:\\Users\\Alunos\\Downloads\\diquete (2).jpg"));
		btnSalvar.setBounds(157, 303, 23, 23);
		panel.add(btnSalvar);
		
		JButton btnEditar = new JButton("");
		btnEditar.setIcon(new ImageIcon("C:\\Users\\Alunos\\Downloads\\editar (1).png"));
		btnEditar.setBounds(190, 303, 23, 23);
		panel.add(btnEditar);
		
		JButton btnApagar = new JButton("");
		btnApagar.setIcon(new ImageIcon("C:\\Users\\Alunos\\Downloads\\boracha (1).jpg"));
		btnApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnApagar.setBounds(223, 303, 23, 23);
		panel.add(btnApagar);
		
		JButton btnExcluir = new JButton("");
		btnExcluir.setIcon(new ImageIcon("C:\\Users\\Alunos\\Downloads\\excluir (1).jpg"));
		btnExcluir.setBounds(256, 303, 23, 23);
		panel.add(btnExcluir);
	}
}
