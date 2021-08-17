package com.ngtlearning.project;

	import java.awt.BorderLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.*;

	public class EncryptDecryptUI {
		static Cryptography cryptography;
		static JFrame frame;
		public static void main(String[] args) {
			//Create a new JFrame
			frame = new JFrame("Encrypt and Decrypt");
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.setResizable(false);
		    
		    // Create three JPanel, each will represent one row
			JPanel a = new JPanel();
			JPanel b = new JPanel();
			JPanel c = new JPanel();
			
			// Add a Label, TextField and a Button to first row. 
			final JLabel keyLabel = new JLabel("Enter shared encrytion key:");
			final JTextField key = new JTextField();
			key.setColumns(20);
			JButton keyButton = new JButton("Activate Key");
			a.add(keyLabel, BorderLayout.WEST);
			a.add(key, BorderLayout.CENTER);
			a.add(keyButton, BorderLayout.EAST);
			// Add a action listener for JButton
			keyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
			try{
				cryptography = new Cryptography(Long.valueOf(key.getText()));
				if(Long.valueOf(key.getText())<=0){
					cryptography= null;
					throw new Exception();
				}
				}catch(Exception e){
					JOptionPane.showMessageDialog(frame,
					    "Please enter a valid number key less than "
					    +(Long.MAX_VALUE-1L)+" and more than 0",
					    "Invalid Input",
					    JOptionPane.ERROR_MESSAGE);
				}
					
				}
			});
			
			// Add a Label, TextField and a Button to second row.
			final JLabel textLabel = new JLabel("Enter text to encrypt:");
			final JTextField text = new JTextField();
			text.setColumns(40);
			JButton textButton = new JButton("Encrypt");
			textButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent ae) {
					if(cryptography == null){
						JOptionPane.showMessageDialog(frame,
							    "Please enter and activate key first",
							    "Activate Key",
							    JOptionPane.ERROR_MESSAGE);
					}else{
						showOutput(cryptography.encrypt(text.getText()));
					}	
				}
			});
			b.add(textLabel, BorderLayout.WEST);
			b.add(text, BorderLayout.CENTER);
			b.add(textButton, BorderLayout.EAST);
			
			// Add a Label, TextField and a Button to third row.
			final JLabel decryptLabel = new JLabel("Enter encrypted text:");
			final JTextField textToDecrypt = new JTextField();
			textToDecrypt.setColumns(40);
			JButton decryptButton = new JButton("Decrypt");
			decryptButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent ae) {
					if(cryptography == null){
						JOptionPane.showMessageDialog(frame,
							    "Please enter and activate key first",
							    "Activate Key",
							    JOptionPane.ERROR_MESSAGE);
					}else{
						showOutput(cryptography.decrypt(textToDecrypt.getText()));
					}
					
				}
			});
			
			c.add(decryptLabel, BorderLayout.WEST);
			c.add(textToDecrypt, BorderLayout.CENTER);
			c.add(decryptButton, BorderLayout.EAST);
			
			// Add three JPanel(rows) to the frame.
			frame.getContentPane().add(a, BorderLayout.NORTH);
			frame.getContentPane().add(b, BorderLayout.CENTER);
			frame.getContentPane().add(c, BorderLayout.SOUTH);
			
	        frame.pack();
	        frame.setVisible(true);  
			}

		public static void showOutput(String s){
			
			JTextArea textArea = new JTextArea(10, 10);
			
			textArea.setText(s);
			
			textArea.setWrapStyleWord(true);
			textArea.setLineWrap(true);
			textArea.setCaretPosition(0);
			textArea.setEditable(false);
			
			JOptionPane.showMessageDialog(frame,new JScrollPane(textArea));
		}
		
	}