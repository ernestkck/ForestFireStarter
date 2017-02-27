
public abstract class Item {

	double x, y;

	public Item(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	double distance(Item o) {
		double dx = x - o.x;
		double dy = y - o.y;
		return Math.sqrt(dx*dx + dy*dy);
	}
	
	abstract public void step(Forest f);
	
}
