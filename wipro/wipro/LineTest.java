package wipro;

public class LineTest {
    public static void main(String[] args) {
        Line line = new Line();
        Circle circle = new Circle();
        Square square = new Square();

        System.out.println("Line:");
        line.drawingColor("Black");
        line.thickness(2);

        System.out.println("\nCircle:");
        circle.drawingColor("Blue");
        circle.thickness(3);
        circle.fillingColor("Yellow");
        circle.size(10);

        System.out.println("\nSquare:");
        square.drawingColor("Red");
        square.thickness(4);
        square.fillingColor("Green");
        square.size(6);
    }
}
