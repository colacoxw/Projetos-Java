import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class Professor extends JFrame {

	private JPanel contentPane;
	private JTextField tfRegistro;
	private JTextField tfNome;
	private JTextField textField;
	private JButton btnFechar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Professor frame = new Professor();
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
	public Professor() {
		setTitle("Cadastro De Professores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 269);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblRegistro = new JLabel("Registro:");
		lblRegistro.setBounds(49, 32, 69, 14);
		panel.add(lblRegistro);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(49, 67, 46, 14);
		panel.add(lblNome);
		
		JLabel lblTitulo = new JLabel("Titulo:");
		lblTitulo.setBounds(49, 107, 46, 14);
		panel.add(lblTitulo);
		
		JLabel lblDataDeA = new JLabel("Data de Admiss\u00E3o:");
		lblDataDeA.setBounds(49, 146, 124, 14);
		panel.add(lblDataDeA);
		
		tfRegistro = new JTextField();
		tfRegistro.setBounds(183, 29, 174, 20);
		panel.add(tfRegistro);
		tfRegistro.setColumns(10);
		
		tfNome = new JTextField();
		tfNome.setBounds(183, 64, 174, 20);
		panel.add(tfNome);
		tfNome.setColumns(10);
		
		JComboBox cbTitulo = new JComboBox();
		cbTitulo.setEditable(true);
		cbTitulo.setBounds(183, 103, 174, 22);
		panel.add(cbTitulo);
		cbTitulo.addItem("Especialista");
		cbTitulo.addItem("Mestrado");
		cbTitulo.addItem("Doutorado");
		cbTitulo.addItem("PHD");
		
		textField = new JTextField();
		textField.setBounds(183, 143, 174, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(99, 186, 89, 23);
		panel.add(btnLimpar);
		
		btnFechar = new JButton("Fechar");
		btnFechar.setBounds(208, 186, 89, 23);
		panel.add(btnFechar);
	}
}
