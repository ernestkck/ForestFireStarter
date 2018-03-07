import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class ForestFireSimulate implements Runnable {

	/**
	 * ForestFireSimulate - a simple program to simulate a forestfire Eric McCreath 2015,2017
	 */

	JFrame jframe;
	
	static GraphicsDevice device = GraphicsEnvironment
	        .getLocalGraphicsEnvironment().getScreenDevices()[0];

	public ForestFireSimulate() {
		SwingUtilities.invokeLater(this);
	}

	public static void main(String[] args) {
		new ForestFireSimulate();
	}

	public void run() {
		jframe = new JFrame("AnimateBalls");
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int w = 600;
		int h = 500;
		jframe.getContentPane().add(new ForestFireJComp(w,h));

		jframe.setVisible(true);
		jframe.pack();
		
		// exit the application after a period of time. 
		Timer timer = new Timer(1000 * 30,new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				System.exit(0);
			}
		});
		timer.start();
	}
}
