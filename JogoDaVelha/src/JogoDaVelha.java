import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class JogoDaVelha extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JogoDaVelha frame = new JogoDaVelha();
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
	public JogoDaVelha() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alunos\\Downloads\\9425be43ba92c2b4454ca7bf602efad8.png"));
		setTitle("Jogo Da Velha");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 512, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JRadioButton rdbtnP2 = new JRadioButton("Player 2");
		buttonGroup.add(rdbtnP2);
		rdbtnP2.setBounds(232, 382, 109, 23);
		panel.add(rdbtnP2);
		
		JRadioButton rdbtnP1 = new JRadioButton("Player 1");
		buttonGroup.add(rdbtnP1);
		rdbtnP1.setBounds(121, 382, 109, 23);
		panel.add(rdbtnP1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnP1.isSelected()) {
					btnNewButton.setIcon(new ImageIcon("C:\\Users\\Alunos\\Downloads\\1621331619025.jpg"));
				} else if (rdbtnP2.isSelected()) {
					btnNewButton.setIcon(new ImageIcon("C:\\Users\\Alunos\\Downloads\\17094004875552.jpg"));

				}
			}
		});
		btnNewButton.setBounds(38, 11, 127, 116);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnP1.isSelected()) {
					btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Alunos\\Downloads\\1621331619025.jpg"));
				} else if (rdbtnP2.isSelected()) {
					btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Alunos\\Downloads\\17094004875552.jpg"));

				}
			}
		});
		btnNewButton_1.setBounds(176, 11, 127, 116);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnP1.isSelected()) {
					btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Alunos\\Downloads\\1621331619025.jpg"));
				} else if (rdbtnP2.isSelected()) {
					btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Alunos\\Downloads\\17094004875552.jpg"));

				}
			}
		});
		btnNewButton_2.setBounds(319, 11, 127, 116);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnP1.isSelected()) {
					btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\Alunos\\Downloads\\1621331619025.jpg"));
				} else if (rdbtnP2.isSelected()) {
					btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\Alunos\\Downloads\\17094004875552.jpg"));

				}
			}
		});
		btnNewButton_3.setBounds(38, 132, 127, 116);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnP1.isSelected()) {
					btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\Alunos\\Downloads\\1621331619025.jpg"));
				} else if (rdbtnP2.isSelected()) {
					btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\Alunos\\Downloads\\17094004875552.jpg"));

				}
			}
		});
		btnNewButton_4.setBounds(176, 132, 127, 116);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnP1.isSelected()) {
					btnNewButton_5.setIcon(new ImageIcon("C:\\Users\\Alunos\\Downloads\\1621331619025.jpg"));
				} else if (rdbtnP2.isSelected()) {
					btnNewButton_5.setIcon(new ImageIcon("C:\\Users\\Alunos\\Downloads\\17094004875552.jpg"));

				}
			}
		});
		btnNewButton_5.setBounds(319, 132, 127, 116);
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnP1.isSelected()) {
					btnNewButton_6.setIcon(new ImageIcon("C:\\Users\\Alunos\\Downloads\\1621331619025.jpg"));
				} else if (rdbtnP2.isSelected()) {
					btnNewButton_6.setIcon(new ImageIcon("C:\\Users\\Alunos\\Downloads\\17094004875552.jpg"));

				}
			}
		});
		btnNewButton_6.setBounds(38, 259, 127, 116);
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnP1.isSelected()) {
					btnNewButton_7.setIcon(new ImageIcon("C:\\Users\\Alunos\\Downloads\\1621331619025.jpg"));
				} else if (rdbtnP2.isSelected()) {
					btnNewButton_7.setIcon(new ImageIcon("C:\\Users\\Alunos\\Downloads\\17094004875552.jpg"));

				}
			}
		});
		btnNewButton_7.setBounds(176, 259, 127, 116);
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnP1.isSelected()) {
					btnNewButton_8.setIcon(new ImageIcon("C:\\Users\\Alunos\\Downloads\\1621331619025.jpg"));
				} else if (rdbtnP2.isSelected()) {
					btnNewButton_8.setIcon(new ImageIcon("C:\\Users\\Alunos\\Downloads\\17094004875552.jpg"));

				}
			}
		});
		btnNewButton_8.setBounds(319, 259, 127, 116);
		panel.add(btnNewButton_8);
	}
}
