import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.*;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Cronometro extends JPanel {
	private JLabel currentTimeLabel;
	private JButton startButton;
	private JButton stopButton;
	private JButton resetButton;
	private long countMis, countSec, countMin, countHour;
	private DecimalFormat format = new DecimalFormat("00");
	Timer timer = new Timer(10, new TestActionListener());
	
	public Cronometro() {
		JPanel panel = new JPanel(new GridLayout(1,3,5,10));
		JPanel panel2 = new JPanel();
		
		currentTimeLabel = new JLabel(" ");
		TestActionListener actionListener = new TestActionListener();
		currentTimeLabel.setForeground(Color.blue);
		currentTimeLabel.setFont(new Font("SAN_SERIF", Font.BOLD, 50));
		
		startButton = new JButton("Start");
		stopButton = new JButton("Stop");
		resetButton = new JButton("Reset");
		
		startButton.setBorder(BorderFactory.createRaisedBevelBorder());
		stopButton.setBorder(BorderFactory.createRaisedBevelBorder());
		resetButton.setBorder(BorderFactory.createRaisedBevelBorder());
		
		startButton.setFont(new java.awt.Font("Times New Roman",1,30));
		stopButton.setFont(new java.awt.Font("Times New Roman",1,30));
		resetButton.setFont(new java.awt.Font("Times New Roman",1,30));
		
		startButton.setBackground(Color.green);
		stopButton.setBackground(Color.red);
		resetButton.setBackground(Color.orange);
		
		startButton.addActionListener(actionListener);
		stopButton.addActionListener(actionListener);
		resetButton.addActionListener(actionListener);
		
		this.setLayout(new BorderLayout());
		
		panel2.setBackground(Color.gray);
		panel2.setBorder(BorderFactory.createLoweredBevelBorder());
		panel2.add(currentTimeLabel);
		panel.add(stopButton);
		panel.add(startButton);
		panel.add(resetButton);
		
		this.add(panel2,BorderLayout.NORTH);
		this.add(panel,BorderLayout.CENTER);
		
	}
	
	class TestActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource()==startButton) {
				timer.start();
				startButton.setEnabled(false);
				
				
			}else if (e.getSource()==stopButton) {
				timer.stop();
				startButton.setEnabled(true);
				
				
			}else if (e.getSource()==resetButton) {
				countHour = 0;
				countMin = 0;
				countMis = 0;
				countSec = 0;
			
			}else {
				countMis++;
				if(countMis>99) {
					countSec++;
					countMis++;
					if(countSec>59) {
						countMin++;
						countSec = 0;
						if(countMin>59) {
							countHour++;
							countMin = 0;
						}
					}
				}
				
			}
		}
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		currentTimeLabel.setText(format.format(countHour)+":"
				+format.format(countMin)+":"+format.format(countSec)+format.format(countMis));
		repaint();
	}
	
	
	public static void main(String [] args) {	
		
		
		JFrame frame = new JFrame("Cronometro");
		Cronometro cronometro = new Cronometro();
		frame.setSize(480,280);
		frame.getContentPane().add(cronometro);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
	}
}






















