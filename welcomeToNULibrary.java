import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class welcomeToNULibrary extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					welcomeToNULibrary messageFrame = new welcomeToNULibrary();
					messageFrame.setVisible(true);
					messageFrame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public welcomeToNULibrary() {
		setResizable(false);
		setTitle("Welcome");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 242);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 203);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel messageLabel = new JLabel("Welcome to NU Library System.");
		messageLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		messageLabel.setBounds(56, 76, 331, 34);
		panel.add(messageLabel);
		
		JButton backButton = new JButton("Back");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logIn logIn = new logIn();
				logIn.setVisible(true);
				dispose();
			}
		});
		backButton.setBounds(170, 141, 89, 23);
		panel.add(backButton);
	}
}
