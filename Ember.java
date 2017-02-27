import java.awt.Graphics2D;
import java.util.Random;

import javax.swing.ImageIcon;


public class Ember extends Item {

	/*
	 * Tree - model an tree within a forest. Eric McCreath 2017
	 */
	
	
	 static final ImageIcon ember = new ImageIcon(ForestFireSimulate.class.getResource("ember.png"));
	 static final Integer emberWidth = ember.getIconWidth();
	 static final Integer emberHeight = ember.getIconHeight();
	
	
	static int startStepsToLive = 100;
	static double wind = 1.0;
	static Random r = new Random();
	int stepsToLive;
	
	public Ember(double x, double y) {
		super(x,y);
		stepsToLive = startStepsToLive;
	}
	
	public void draw(Graphics2D g2) {
		g2.drawImage(ember.getImage(),(int) x, (int) y, null);
	}

	
	/* step - move the ember one step in time. 
	 * this should remove the ember from the forest after 100 steps.
	 * add the wind value to x.
	 * add some random number (use the Random class) to the x and y position.
	 */
	
	@Override
	public void step(Forest f) {
		// add your code here
	}

}
