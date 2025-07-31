package wipro;

public class Shape {
	 public double area(double side) {
	        return side * side;
	    }

	    // Calculate area of rectangle (length and breadth)
	    public double area(double length, double breadth) {
	        return length * breadth;
	    }

	    // Calculate perimeter of square (one side)
	    public double perimeter(double side) {
	        return 4 * side;
	    }

	    // Calculate perimeter of rectangle (length and breadth)
	    public double perimeter(double length, double breadth) {
	        return 2 * (length + breadth);
	    }
	}

