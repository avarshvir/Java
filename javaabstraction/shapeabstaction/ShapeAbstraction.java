package shapeabstraction;
abstract class Shape{
    abstract double calculateArea();
}
class Circle extends Shape{
    private double radius;
    Circle(double radius){
        this.radius = radius;
    }
    double calculateArea(){
        return (3.14*radius*radius);
    }
}
class Rectangle extends Shape{
    private double length, breadth;
    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    double calculateArea(){
        return length*breadth;
    }
}
class ShapeAbstraction{
    public static void main(String []args){
        Circle circle = new Circle(5);
        System.out.println("Circle : "+ circle.calculateArea());

        Rectangle rectangle = new Rectangle(4,5);
        System.out.println("Area of Rectangle is "+ rectangle.calculateArea());
    }
}