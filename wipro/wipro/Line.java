package wipro;

interface Drawable {
    void drawingColor(String color);
    void thickness(int thickness);
}

// Fillable interface
interface Fillable {
    void fillingColor(String color);
    void size(int size);
}

// Line class implements only Drawable
class Line implements Drawable {
    @Override
    public void drawingColor(String color) {
        System.out.println("Line drawing color: " + color);
    }

    @Override
    public void thickness(int thickness) {
        System.out.println("Line thickness: " + thickness);
    }
}

// Circle class implements both Drawable and Fillable
class Circle implements Drawable, Fillable {
    @Override
    public void drawingColor(String color) {
        System.out.println("Circle drawing color: " + color);
    }

    @Override
    public void thickness(int thickness) {
        System.out.println("Circle thickness: " + thickness);
    }

    @Override
    public void fillingColor(String color) {
        System.out.println("Circle filling color: " + color);
    }

    @Override
    public void size(int size) {
        System.out.println("Circle size (radius): " + size);
    }
}
class Square implements Drawable, Fillable {
    @Override
    public void drawingColor(String color) {
        System.out.println("Square drawing color: " + color);
    }

    @Override
    public void thickness(int thickness) {
        System.out.println("Square thickness: " + thickness);
    }

    @Override
    public void fillingColor(String color) {
        System.out.println("Square filling color: " + color);
    }

    @Override
    public void size(int size) {
        System.out.println("Square size (side length): " + size);
    }
}
