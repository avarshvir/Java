class ExceptionalHandling{
    public static void main(String ... args){
        try{
            int result = divide(10,0);
            System.out.println("Result "+result);
        }catch(ArithmeticException e){
            System.out.println("error: "+e.getMessage());
        }
        System.out.println("Program continue after excepion");
    }
    public static int divide(int a, int b){
        if(b == 0){
            throw new ArithmeticException("Division by zero is not allowed");
        }
            return a/b;
    }
}