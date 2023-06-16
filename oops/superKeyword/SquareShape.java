class SquareShape extends RectangleSuper{
    SquareShape(int size){
        super(size,size);
        int area = size * size;
        System.out.println("Area of Square is : "+ area);
    }
    public static void main(String args[]){
        SquareShape squareShape = new SquareShape(5);
        //SquareShape squareShape = new SquareShape(5);
    
    }
}