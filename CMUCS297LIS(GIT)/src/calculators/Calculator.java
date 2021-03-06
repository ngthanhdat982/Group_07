package calculators;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(55, 25, 129, 36);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(253, 25, 129, 36);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("+\r\n");
		btnNewButton.setActionCommand("New Button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty() || textField_1.getText().isEmpty())
					JOptionPane.showMessageDialog(btnNewButton, "Textboxes is empty","Alert",JOptionPane.WARNING_MESSAGE);
				else
				{
					double a = Double.parseDouble(textField.getText());
					double b = Double.parseDouble(textField_1.getText());
					double c = a+b ;
					textField_2.setText(Double.toString(c));
				}
			}
		});
		btnNewButton.setBounds(55, 95, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty() || textField_1.getText().isEmpty())
					JOptionPane.showMessageDialog(btnNewButton, "Textboxes is empty","Alert",JOptionPane.WARNING_MESSAGE);
				else
				{
					double a = Double.parseDouble(textField.getText());
					double b = Double.parseDouble(textField_1.getText());
					double c = a-b ;
					textField_2.setText(Double.toString(c));
				}
			}
		});
		btnNewButton_1.setBounds(55, 129, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("X");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty() || textField_1.getText().isEmpty())
					JOptionPane.showMessageDialog(btnNewButton, "Textboxes is empty","Alert",JOptionPane.WARNING_MESSAGE);
				else
				{
					double a = Double.parseDouble(textField.getText());
					double b = Double.parseDouble(textField_1.getText());
					double c = 1.0*(a*b) ;
					textField_2.setText(Double.toString(c));
				}
			}
		});
		btnNewButton_2.setBounds(55, 161, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty() || textField_1.getText().isEmpty())
					JOptionPane.showMessageDialog(btnNewButton, "Textboxes is empty","Alert",JOptionPane.WARNING_MESSAGE);
				else
				{
					double a = Double.parseDouble(textField.getText());
					double b = Double.parseDouble(textField_1.getText());
					double c = a/b ;
					textField_2.setText(Double.toString(c));
				}
			}
		});
		btnNewButton_3.setBounds(55, 195, 89, 23);
		contentPane.add(btnNewButton_3);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(253, 129, 129, 55);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
	}
}
