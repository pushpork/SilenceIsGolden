package pushpork.silence;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Silence extends JPanel {
	// constants
	public static final int WIDTH = 320;
	public static final int HEIGHT = 200;
	public static final String TITLE = "Silence Is Golden";
	
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
	}
   
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		JFrame frame = new JFrame(TITLE);
		frame.add(new Silence());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(WIDTH, HEIGHT);
		frame.setLocationRelativeTo(null);
        frame.setVisible(true);
	}
}
