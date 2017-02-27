import java.awt.Graphics2D;
import java.util.ArrayList;


public class Embers extends ArrayList<Ember> {

	/*
	 * Embers - all the embers in the forest.  Eric McCreath 2017
	 */
	
	
	public boolean near(Tree tree, double d) {
		for (Ember e : this) {
			if (tree.distance(e) < d) return true;
		}
		return false;
	}

	public void draw(Graphics2D g2) {
		for (Ember e : this) e.draw(g2);
	}
	
	public void step(Forest forest) {
		Ember[] es = this.toArray(new Ember[this.size()]);
		for (Ember t : es) t.step(forest);
	}

}
