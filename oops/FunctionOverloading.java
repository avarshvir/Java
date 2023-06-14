class FunctionOverloading{
    float pi = 3.14f;
    //square
    public int area(int a){
        return a*a;
    }
    //rectangle
    public int area(int a, int b){
        return a*b;
    }
    //circle
    public float area(float a){
        return pi*a*a;
    }
    
    public static void main(String args[]){
        FunctionOverloading fo = new FunctionOverloading();
        System.out.println("Area of Square : "+ fo.area(5));
        System.out.println("Area of Rectangle : "+ fo.area(5,6));
        System.out.println("Area of Circle : "+ fo.area(5.0f));

    }
}