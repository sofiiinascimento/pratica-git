package tela;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JComboBox<String> comboBox;
	private String textoTotal;
	private JTextArea textArea;

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
		setBounds(100, 100, 400, 244);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("ADICIONAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String valorSelecionado = (String) comboBox.getSelectedItem();
				if (textoTotal == null) {
					textoTotal = valorSelecionado;
				} else {
					textoTotal = textoTotal + "," + valorSelecionado;
				}
				textArea.setText(textoTotal);
			}
		});
		btnNewButton.setBounds(259, 31, 100, 22);
		contentPane.add(btnNewButton);

		JLabel lblNewLabel = new JLabel("Opções:");
		lblNewLabel.setBounds(35, 28, 64, 29);
		contentPane.add(lblNewLabel);

		comboBox = new JComboBox<>();
		comboBox.setBounds(97, 31, 152, 22);
		comboBox.addItem("Brasil");
		comboBox.addItem("Portugal");
		comboBox.addItem("França");
		comboBox.addItem("Argentina");
		comboBox.addItem("Canadá");
		comboBox.addItem("Japão");
		contentPane.add(comboBox);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 73, 336, 108);
		contentPane.add(scrollPane);

		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}
}
