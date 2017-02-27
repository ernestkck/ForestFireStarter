import java.awt.Graphics2D;

import javax.swing.ImageIcon;


public class Tree extends Item {
	/*
	 * Tree - model a tree within a forest. Eric McCreath 2017
	 */
	 static final ImageIcon treenofire = new ImageIcon(ForestFireSimulate.class.getResource("treenofire.png"));
	 static final ImageIcon treesomefire = new ImageIcon(ForestFireSimulate.class.getResource("treesomefire.png"));
	 static final ImageIcon treelotsfire = new ImageIcon(ForestFireSimulate.class.getResource("treelotsfire.png"));
	 static final ImageIcon treeburnt = new ImageIcon(ForestFireSimulate.class.getResource("treeburnt.png"));
	 static final Integer treenofireWidth = treenofire.getIconWidth();
	 static final Integer treenofireHeight = treenofire.getIconHeight();
	
	
	TreeState state;
	int timeinstate;
	 
	public Tree(double x, double y) {
		super(x,y);
		state = TreeState.NOFIRE;
		timeinstate = 0;
	}
	
	
	
	/* step - This step the tree one step in time.   
	 * If the current state is NOFIRE and an ember is "near" 
	 * then the tree should change state to SOMEFIRE.  It should stay in this state for 50 steps.
	 * If the current state is SOMEFIRE the it should emit one ember per step.
	 * If the current state is LOTSFIRE the it should emit two embers per step. It should stay in LOTSFIRE for 100 step.
	 * BURTOUT tree just stay BURTOUT and don't emit embers.  
	 */
	@Override
	public void step(Forest f) {
		// add your code here
	}

	public void draw(Graphics2D g2) {
		if (state == TreeState.NOFIRE) g2.drawImage(treenofire.getImage(),(int) x, (int) y, null);
		else if (state == TreeState.SOMEFIRE) g2.drawImage(treesomefire.getImage(),(int) x, (int) y, null);
		else if (state == TreeState.LOTSFIRE) g2.drawImage(treelotsfire.getImage(),(int) x, (int) y, null);
		else if (state == TreeState.BURNOUT) g2.drawImage(treeburnt.getImage(),(int) x, (int) y, null);
	}

	public void startFire() {
		// TODO Auto-generated method stub
		state = TreeState.SOMEFIRE;
	}

	

	

}
