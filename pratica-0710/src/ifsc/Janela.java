package ifsc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField txtNota3;
	private JTextField txtNota2;
	private JTextField txtNota1;
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
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
	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 220, 227);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNome = new JTextField();
		txtNome.setBounds(76, 10, 86, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtNota1 = new JTextField();
		txtNota1.setBounds(76, 41, 86, 20);
		contentPane.add(txtNota1);
		txtNota1.setColumns(10);
		
		txtNota2 = new JTextField();
		txtNota2.setBounds(76, 72, 86, 20);
		contentPane.add(txtNota2);
		txtNota2.setColumns(10);
		
		txtNota3 = new JTextField();
		txtNota3.setBounds(76, 103, 86, 20);
		contentPane.add(txtNota3);
		txtNota3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome: ");
		lblNewLabel.setBounds(20, 13, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nota 1:");
		lblNewLabel_1.setBounds(20, 44, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nota 2:");
		lblNewLabel_2.setBounds(20, 75, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nota 3: ");
		lblNewLabel_3.setBounds(20, 106, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String nome = txtNome.getText();
			
			String nota1 = txtNota1.getText();
			String nota2 = txtNota2.getText();
			String nota3 = txtNota3.getText();
			 
			if (!nota1.isEmpty() && !nota2.isEmpty() && !nota3.isEmpty()) {
				
				Integer n1 = Integer.valueOf(nota1);
				Integer n2 = Integer.valueOf(nota2);
				Integer n3 = Integer.valueOf(nota3);
				
				Integer media = (n1 + n2 + n3) / 3;
				
				JOptionPane.showMessageDialog(null, "A média das notas do/a " + nome + " foi de: " + media);
			}			
					
	
				
			}
		});
		btnCalcular.setBounds(49, 150, 101, 28);
		contentPane.add(btnCalcular);
	}
}
