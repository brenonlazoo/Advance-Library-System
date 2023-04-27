import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class logIn extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					logIn ligInFrame = new logIn();
					ligInFrame.setVisible(true);
					ligInFrame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public logIn() {
		setResizable(false);
		setTitle("Library Management");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel libraryManagementLabel = new JLabel("Library Management - JavaTpoint");
		libraryManagementLabel.setForeground(new Color(128, 128, 128));
		libraryManagementLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		libraryManagementLabel.setBounds(69, 23, 317, 49);
		panel.add(libraryManagementLabel);
		
		JButton adminLogInButton = new JButton("Admin Log-in");
		adminLogInButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminLogIn adLogIn = new adminLogIn(); 
				adLogIn.setVisible(true);
				dispose();
				
			}
		});
		adminLogInButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		adminLogInButton.setBounds(151, 83, 122, 49);
		panel.add(adminLogInButton);
		
		JButton librarianLogInButton = new JButton("Librarian Log-in");
		librarianLogInButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				librarianLogIn libLogIn = new librarianLogIn();
				libLogIn.setVisible(true);
				dispose();
			}
		});
		librarianLogInButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		librarianLogInButton.setBounds(151, 152, 122, 49);
		panel.add(librarianLogInButton);
	}
}
