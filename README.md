# kdTree
Assignment in progress

Implement a kd-Tree to determine all points in the unit square that are within a given rectangle. This assignment was created for Coursera's "Algorithms I" hosted by Princeton University. The official assignment specification can be found here: http://coursera.cs.princeton.edu/algs4/assignments/kdtree.html

Given many points in the unit square, it can be difficult to determine which points belong to a certain rectangle or not. Determining this has many practical applications including classifying astronomical objects to computer animations to neural networks to image retrieval.


The following API was implemented:

   public class PointSET {
   public         PointSET()                               // construct an empty set of points 
   public           boolean isEmpty()                      // is the set empty? 
   public               int size()                         // number of points in the set 
   public              void insert(Point2D p)              // add the point to the set (if it is not already in the set)
   public           boolean contains(Point2D p)            // does the set contain point p? 
   public              void draw()                         // draw all points to standard draw 
   public Iterable<Point2D> range(RectHV rect)             // all points that are inside the rectangle 
   public           Point2D nearest(Point2D p)             // a nearest neighbor in the set to point p; null if the set is empty 

   public static void main(String[] args)                  // unit testing of the methods (optional) 
}

The same API was used for both the brute-force implementation and algorithmic implementation for range search.


This project is still in progress
