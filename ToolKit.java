// Imports
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class ToolKit extends JFrame implements ActionListener {

    // Declare Swing components
    private JTextField input; // Input from user
    private JButton words, characters, palindrome, reversal, vowels, consonants, average; // All buttons with functionalities 
    private JLabel enter; // Label to indicate where to enter string of words

    // Constructor
    ToolKit() {
        // Call the superclass constructor with a custom title
        super("Vikram's Text Manipulator Tool Kit");
        
        // Initialize all Swing components
        input = new JTextField(30);
        enter = new JLabel("Enter a string of words: ");
        words = new JButton("Words");
        characters = new JButton("Characters");
        palindrome = new JButton("Palindrome");
        reversal = new JButton("Reversal");
        vowels = new JButton("Number of Vowels");
        consonants = new JButton("Number of Consonants");
        average = new JButton("Average");

        // Add action listeners to the buttons 
        words.addActionListener(this);
        characters.addActionListener(this);
        palindrome.addActionListener(this);
        reversal.addActionListener(this);
        vowels.addActionListener(this);
        consonants.addActionListener(this);
        average.addActionListener(this);

        // Set layout for the JFrame
        setLayout(new FlowLayout());

        // Adding the components to the JFrame
        add(enter);
        add(input);
        add(words);
        add(characters);
        add(palindrome);
        add(reversal);
        add(vowels);
        add(consonants);
        add(average);

        // Setting JFrame properties
        setSize(500, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // ActionListener implementation for button clicks
    @Override
    public void actionPerformed(ActionEvent e) {
        String text = input.getText(); // Get the input from the JTextField

        // If "words" button gets clicked
        if (e.getSource() == words) {
            String[] words = text.split("\\s+");
            JOptionPane.showMessageDialog(this, "Number of words: " + words.length);
        }

        // If "characters" button gets clicked
        if (e.getSource() == characters) {
            JOptionPane.showMessageDialog(this, "Number of characters (Including spaces): " + text.length());
        }

        // If "palindrome" button gets clicked
        if (e.getSource() == palindrome) {
            String reverseStr = new StringBuilder(text).reverse().toString();
            String result = text.equalsIgnoreCase(reverseStr) ? "This string is a Palindrome" : "This string is not a Palindrome";
            JOptionPane.showMessageDialog(this, result);
        }

        // If "reversal" button gets clicked
        if (e.getSource() == reversal) {
            String reverse = new StringBuilder(text).reverse().toString();
            JOptionPane.showMessageDialog(this, "The reversal of this string is: " + reverse);
        }

        // If "vowels" button gets clicked
        if (e.getSource() == vowels) {
            int count = 0;
            for (char ch : text.toLowerCase().toCharArray()) {
                if ("aeiou".indexOf(ch) != -1 || ch == ' ') {
                    count++;
                }
            }
            JOptionPane.showMessageDialog(this, "This string has " + count + " vowels.");
        }

        // If "consonants" button gets clicked
        if (e.getSource() == consonants) {
            int count = 0;
            for (char ch : text.toLowerCase().toCharArray()) {
                if ("aeiou".indexOf(ch) == -1 && ch >= 'a' && ch <= 'z') {
                    count++;
                }
            }
            JOptionPane.showMessageDialog(this, "This string has " + count + " consonants.");
        }

        // If "average" button gets clicked
        if (e.getSource() == average) {
            String[] words = text.split("\\s+");
            double average = words.length > 0 ? (double) text.length() / words.length : 0;
            JOptionPane.showMessageDialog(this, "Average is: " + average);
        }
    }

    // Main method to create an instance of the class
    public static void main(String[] args) {
        new ToolKit();
    }
}
