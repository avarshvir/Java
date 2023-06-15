//Demonstration of multilevel inheritance 
//derived class from rectangle class
class Square extends Rectangle{
    public void showSquare(){
        System.out.println("Square is a rectangle");
    }
    public static void main(String args[]){
        Square square = new Square();

        square.showSquare();
        square.showShape();
        square.showRectangle();
    }
}