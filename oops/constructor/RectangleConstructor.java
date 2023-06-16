class RectangleConstructor{
    RectangleConstructor(){
        System.out.println("Default Constructor ");
        int length = 0;
        int breadth = 0;
        System.out.println("Area : "+ length*breadth);
    }
    RectangleConstructor(int length, int breadth){
        System.out.println("Area : "+ length*breadth);
    }
    RectangleConstructor(int size){
            System.out.println("Area : "+ size*size);
    }
    public static void main(String args[]){
        RectangleConstructor rectangleConstructor = new RectangleConstructor();
        RectangleConstructor rectangleConstructor2 = new RectangleConstructor(2,4);
        RectangleConstructor rectangleConstructor3 = new RectangleConstructor(2);
        
    }

}