package de.sjas.random.swingTest;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JLabel;

/** Standalone GUI program that shows paint, repaint, and update */
public class SwingTest2Main extends JLabel {

	private static final long serialVersionUID = 1L;

	/** "main program" method - construct and show */
	public static void main(String[] av) {
		final JFrame f = new JFrame("PaintMethods demo");
		f.getContentPane().add("Center", new SwingTest2Main("Testing 1 2 3"));
		f.pack();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public SwingTest2Main(String s) {
		super(s);
	}

	@Override
	public void paint(Graphics g) {
		System.out.println("Paint");
		super.paint(g);
	}

	@Override
	public void repaint() {
		System.out.println("repaint");
		super.repaint();
	}

	@Override
	public void update(Graphics g) {
		System.out.println("update");
		super.update(g);
	}
}
