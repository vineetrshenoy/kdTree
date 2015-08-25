import java.util.TreeSet;
public class KdTree {

	private TreeSet<Node> tree;
	private int N;
	
	private static class Node {
		   private Point2D p;      // the point
		   private RectHV rect;    // the axis-aligned rectangle corresponding to this node
		   private Node left;        // the left/bottom subtree
		   private Node right;        // the right/top subtree
		}
	
	public KdTree(){
		tree = new TreeSet<Node>();
		N = 0;
	}
	
	public boolean isEmpty(){
		return N == 0;
	}
	
	public int size(){
		return N;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
