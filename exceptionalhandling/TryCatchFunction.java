class TryCatchFunction{
    public static int divide(int a, int b){
        if(b == 0){
            throw new ArithmeticException("error");
        }
        return a/b;
    }
    public static void main(String args[]){
        try{
            divide(10,0);
        }catch(ArithmeticException ae){
            System.out.println(ae.getMessage());
        }
    }
}