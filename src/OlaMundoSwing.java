import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;

public class OlaMundoSwing extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OlaMundoSwing frame = new OlaMundoSwing();
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
	public OlaMundoSwing() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Aqui vai aparecer a mensagem");
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		contentPane.add(lblNewLabel, BorderLayout.WEST);
		
		JButton btnNewButton = new JButton("Clique em mim!");
		btnNewButton.setBackground(SystemColor.control);
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			lblNewLabel.setText("Olá,Patrick!");
			}
		});
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
	}

}
