import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComponent;
import javax.swing.Timer;

/**
 * ForestFireJComp - a JComponent that holds the simulation Eric McCreath 2015,2017
 */


public class ForestFireJComp extends JComponent implements ActionListener {
    int width, height;
    Timer timer;
    static final int steptime = 1000/30; // in ms
    double currenttime;
    Forest forest;
    
    
	public ForestFireJComp(int w, int h) {
		width = w;
		height = h;
		
		timer = new Timer(steptime,this);
		timer.start();
		currenttime = 0.0;
		forest = new Forest(width, height,40);
		this.setPreferredSize(new Dimension(w,h));
	}
	
	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.white);
		g2.fillRect(0, 0, width, height);
		g2.setColor(Color.blue);
		forest.draw(g2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		forest.step();
		currenttime += steptime / 1000.0;
		repaint();
	}
	

}
