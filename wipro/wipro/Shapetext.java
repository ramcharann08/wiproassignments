package wipro;

public class Shapetext {
	public static void main(String[] args) {
        Shape shape = new Shape();

        double squareSide = 5.0;
        double rectangleLength = 7.0;
        double rectangleBreadth = 4.0;

        // Area and perimeter for square
        System.out.println("Area of square with side " + squareSide + " = " + shape.area(squareSide));
        System.out.println("Perimeter of square with side " + squareSide + " = " + shape.perimeter(squareSide));

        // Area and perimeter for rectangle
        System.out.println("Area of rectangle with length " + rectangleLength + " and breadth " + rectangleBreadth + " = "
                + shape.area(rectangleLength, rectangleBreadth));
        System.out.println("Perimeter of rectangle with length " + rectangleLength + " and breadth " + rectangleBreadth + " = "
                + shape.perimeter(rectangleLength, rectangleBreadth));
    }
}

