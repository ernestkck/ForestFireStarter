import java.awt.Graphics2D;
import java.util.ArrayList;


public class Trees extends ArrayList<Tree>{

	
	/*
	 * Trees - all the trees in the forest.  Eric McCreath 2017
	 */
	
	public void draw(Graphics2D g) {
		for (Tree t : this) t.draw(g);
	}

	public void step(Forest forest) {
		for (Tree t : this) t.step(forest);
	}
}
