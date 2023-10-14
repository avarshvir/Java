package shapeinterfaces;
interface Shape {
    double area();
    double perimeter();
}
//Circle.java
class Circle implements Shape{
    private double radius;
    Circle(double radius){
        this.radius = radius;
    }
    public double area(){
        return Math.PI * radius * radius;
    }
    public double perimeter(){
        return 2 * Math.PI * radius;
    }
}
//Rectangle.java
class Rectangle implements Shape{
    private double length, breadth;
    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
}
class Triangle implements Shape{
    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;

    Triangle(double base, double height, double side1, double side2, double side3){
        this. base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double area() {
        return 0.5 * base * height;
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }
}
class ShapeInterface{
    public static void main(String args[]){

        //object of Circle class assigned to refernce of Shape Interface
        Shape shape = new Circle(5);
        System.out.println("Area of Circle is "+ shape.area());
        System.out.println("Perimeter of Circle is "+ shape.perimeter());


        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(5,20);
        Triangle triangle = new Triangle(2,3,4,5,6);

        System.out.println("Area of Circle is "+ circle.area());
        System.out.println("Perimeter of Circle is "+ circle.perimeter());

        System.out.println("Area of Rectangle is "+ rectangle.area());
        System.out.println("Perimeter of Rectangle is "+ rectangle.perimeter());

        System.out.println("Area of Triangle is "+ triangle.area());
        System.out.println("Perimeter of Triangle is "+ triangle.perimeter());
        
    }
}
