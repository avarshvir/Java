package shapeinterface;
public class ShapeInterface{
    public static void main(String args[]){
        Circle c = new Circle(5);
        System.out.println("area of circle "+c.area());
        Rectangle r = new Rectangle(4,5);
        System.out.println("area of Rectangle "+r.area());
        System.out.println("perimeter of Rectangle "+r.perimeter());
        
    }
}