//Demonstration of multilevel inheritance 
//derived class from shape class and base class for square class
class Rectangle extends Shape{
    public void showRectangle(){
        System.out.println("This is rectangular shape");
    }

    public static void main(String args[]){
        Rectangle rectangle = new Rectangle();
        rectangle.showRectangle();
    }
}