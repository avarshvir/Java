//Demonstration of super key
class RectangleSuper extends ShapeSuper{
    RectangleSuper(int length, int breadth){
       // super();
        int area = length*breadth;
        System.out.println("Area of Rectangle is : "+ area);
    }
    
    public static void main(String args[]){
        RectangleSuper rectangleSuper = new RectangleSuper(5,6);
    }
}