import java.awt.Graphics2D;
import java.util.Random;

/*
 * Forest - model a forest of trees and embers. Eric McCreath 2017
 */

public class Forest {
	Embers embers;
	Trees trees;
	static Random r = new Random();

	public Forest(double w, double h, int ntrees) {
		embers = new Embers();
		trees = new Trees();
		for (int i = 0; i < ntrees; i++) {
			Tree t = new Tree(r.nextDouble() * w, r.nextDouble() * h);
			if (i==0) t.startFire();
			trees.add(t);
		}
	}

	public void draw(Graphics2D g2) {
		trees.draw(g2);
		embers.draw(g2);
	}

	public void step() {
		trees.step(this);
		embers.step(this);
	}
}
