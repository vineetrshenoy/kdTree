import java.util.TreeSet;
public class PointSET {

	private TreeSet<Point2D> tree;
	private int treeSize;
	
	public PointSET(){
		tree = new TreeSet<Point2D>();
		treeSize = 0;
	}
	
	public boolean isEmpty(){
		return treeSize == 0;
	}
	
	public int size(){
		return treeSize;
	}
	public void insert(Point2D p){
		if (p == null)
			throw new NullPointerException();
		tree.add(p);
	}
	public boolean contains(Point2D p){
		if (p == null)
			throw new NullPointerException();
		return tree.contains(p);
	}
	public void draw(){
		for (Point2D p: tree){
			p.draw();
		}
	}
	public Iterable<Point2D> range(RectHV rect){
		if (rect == null)
			throw new NullPointerException();
		Stack<Point2D> stack = new Stack<Point2D>();
		for (Point2D p: tree){
			if (rect.contains(p))
				stack.push(p);
		}
		return stack;
	}
	
	public Point2D nearest(Point2D p){
		if (p == null)
			throw new NullPointerException();
		if (this.isEmpty())
			return null;
		Point2D nearPoint = tree.first();
		double nearDistance = p.distanceSquaredTo(nearPoint);
		for (Point2D x: tree){
			double thisDistance = p.distanceSquaredTo(x);
			if (thisDistance < nearDistance){
				nearDistance = thisDistance;
				nearPoint = x;
			}
		}
		return nearPoint;
			
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
