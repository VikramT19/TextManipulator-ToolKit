/* Class that takes input from user and counts the number
 * of words and characters (including spaces) and outputs it.
 * 
 * This class is using Swing.
 */

// Imports
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

// Main class

public class WCC extends JFrame implements ActionListener {

	// Declare Swing components
	JTextField input;
	JButton words, characters;
	JLabel enter;

	// Constructor
	WCC(){
		// Call the superclass constructor with a custom title
		super("Vikram's word & character counter");
		// Initialize all Swing components
		input = new JTextField(30);
		enter = new JLabel("Enter a sentence: ");
		words = new JButton("Words");
		characters = new JButton("Characters");

		// Add action listeners to the buttons 
		words.addActionListener(this);
		characters.addActionListener(this);

		// Set layout for the JFrame
		setLayout(new FlowLayout());

		// Adding the components to the JFrame
		add(enter);
		add(input);
		add(words);
		add(characters);

		// Setting JFrame properties
		setSize(500,125);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	// ActionListener implementation for button clicks
	@Override
	public void actionPerformed(ActionEvent e) {
		String text = input.getText(); // Get the input from the JTextField

		// If "words" button gets clicked
		if(e.getSource() == words) {
			String words[] = text.split(" ");
			JOptionPane.showMessageDialog(this,"Numbers of words: " + words.length);
		}
		
		// If "characters" button gets clicked
		if(e.getSource() == characters) {
			String words[] = text.split(" ");
			JOptionPane.showMessageDialog(this,"Numbers of characters (Including spaces): " + text.length());
			
		}
	}
		// Main method to create an instance of the class
		 public static void main(String[] args) {
			 new WCC();			 
		 }
}
