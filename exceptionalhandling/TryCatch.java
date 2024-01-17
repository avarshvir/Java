class TryCatch{
    public static void main(String ... args){
        int a = 10;
        int b = 5;
        try{
            int c = a/b;
            System.out.println("In Try Block");
        }catch(ArithmeticException ae){
            System.out.println("Divide by zero : "+ae.getMessage());
        }
        System.out.println("Program Continues....");
    }
}