package multipleinterface;
interface Drawable{
    void draw();
    void fillColor(String color);
}
interface Resizable{
    void resize(int percentage);
}
class Shape implements Drawable, Resizable{
    private String color;
    private int size;

    public Shape(String color, int size){
        this.color = color;
        this.size = size;
    }

    public void draw(){
        System.out.println("Drawing a shape with color: " + color);
    }

    public void fillColor(String fillColor){
        this.color = fillColor;
        System.out.println("Filling shape with color: " + fillColor);
    }
    public void resize(int percentage){
        this.size = this.size * (100 + percentage) / 100;
        System.out.println("Resizing shape to " + size + " units");
    }
}
public class MultipleInterface {
    public static void main(String[] args) {
        Shape shape = new Shape("Red", 100);

        shape.draw();
        shape.fillColor("Blue");
        shape.resize(50);
    }
}
/*
// Define the Drawable interface
interface Drawable {
    void draw();
    void fillColor(String color);
}

// Define the Resizable interface
interface Resizable {
    void resize(int percent);
}

// Create a class Shape that implements both interfaces
class Shape implements Drawable, Resizable {
    private String color;
    private int size;

    public Shape(String color, int size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a shape with color: " + color);
    }

    @Override
    public void fillColor(String fillColor) {
        this.color = fillColor;
        System.out.println("Filling shape with color: " + fillColor);
    }

    @Override
    public void resize(int percent) {
        this.size = this.size * (100 + percent) / 100;
        System.out.println("Resizing shape to " + size + " units");
    }
}

public class MultipleInterface {
    public static void main(String[] args) {
        Shape shape = new Shape("Red", 100);

        shape.draw();
        shape.fillColor("Blue");
        shape.resize(50);
    }
}*/
