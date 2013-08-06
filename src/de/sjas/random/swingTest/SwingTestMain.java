package de.sjas.random.swingTest;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * Swing test class
 * 
 * @author sjas
 */
public class SwingTestMain extends JFrame {

	private static final long serialVersionUID = 5379540753756812763L;

	// by initializing the 
	public SwingTestMain() {
		this.setTitle("this is the window title");
		this.setSize(new Dimension(800, 600));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setContentPane(new JPanel());
		getContentPane().setLayout(new BorderLayout());

		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setText("text area text");

		getContentPane().add(textArea);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new SwingTestMain();
	}

}
