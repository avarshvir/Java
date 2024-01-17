class TryCatchDemo{
    public static void main(String args[]){
        int a = 10;
        int b = 0;
        try{
            //System.out.println("In try block"+ c);
            int c = a/b;
            System.out.println("In try block"+ c);
        }catch(ArithmeticException ae){
            System.out.println("error : "+ae.getMessage());
        }finally{
            System.out.println("In final block");
        }
    }
}