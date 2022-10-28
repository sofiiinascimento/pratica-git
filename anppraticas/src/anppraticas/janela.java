package anppraticas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class janela extends JFrame {

	private JPanel contentPane;
	private JTextField areaCpf;
	private JTextField areaNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					janela frame = new janela();
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
	public janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox<String> areaPronome = new JComboBox();
		areaPronome.setBounds(107, 11, 115, 22);
		
		areaPronome.addItem("Sr");
		areaPronome.addItem("Sra");
		areaPronome.addItem("Srta");
		
		contentPane.add(areaPronome);
		
		areaNome = new JTextField();
		areaNome.setBounds(107, 57, 188, 20);
		contentPane.add(areaNome);
		areaNome.setColumns(10);
		
		areaCpf = new JTextField();
		areaCpf.setBounds(107, 88, 115, 20);
		contentPane.add(areaCpf);
		areaCpf.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Pronome");
		lblNewLabel.setBounds(31, 6, 66, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(31, 60, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("CPF");
		lblNewLabel_2.setBounds(31, 91, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(52, 119, 372, 132);
		contentPane.add(scrollPane);
		
		JTextArea txtTexto = new JTextArea();
		scrollPane.setViewportView(txtTexto);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = areaNome.getText();
				String cpf = areaCpf.getText();
				
				if(!nome.isEmpty() && !cpf.isEmpty()) {
					
					
					String select=(String) areaPronome.getSelectedItem();
					txtTexto.setText(txtTexto.getText()+select+"." + nome + "    Portador do CPF:" + cpf + "\n");
					
					
					areaCpf.setText("");
					areaNome.setText("");
					
					
				}
			}
		});
		btnAdicionar.setBounds(311, 56, 89, 23);
		contentPane.add(btnAdicionar);
	}
}
