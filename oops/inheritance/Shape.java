//Demonstration of multilevel inheritance 
//base class
class Shape{
    public void showShape(){
        System.out.println("This is shape");
    }

    public static void main(String args[]){
        Shape shape = new Shape();
        shape.showShape();
    }
}