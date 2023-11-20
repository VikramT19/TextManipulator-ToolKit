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
	
	JTextField input;
	JButton words, characters;
	JLabel enter;
	
	WCC(){
		super("Vikram's word & character counter");
		
		input = new JTextField(30);
		enter = new JLabel("Enter a sentence: ");
		
		words = new JButton("Words");
		
		characters = new JButton("Characters");
		
		
		words.addActionListener(this);
		characters.addActionListener(this);
		
		setLayout(new FlowLayout());
		add(enter);
		add(input);
	
		add(words);
		add(characters);
		
		setSize(500,125);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String text = input.getText();
		
		if(e.getSource() == words) {
			String words[] = text.split(" ");
			JOptionPane.showMessageDialog(this,"Numbers of words: " + words.length);
		}
		
		if(e.getSource() == characters) {
			String words[] = text.split(" ");
			JOptionPane.showMessageDialog(this,"Numbers of characters (Including spaces): " + text.length());
			
		}
	}
		
		 public static void main(String[] args) {
			 
			 new WCC();			 
			 
		 }

}
