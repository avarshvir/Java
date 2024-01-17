class Arithmetic extends Add{
    
    public Arithmetic(int a1, int b1){
        super(a1,b1);
        super.showAdd();
        System.out.println("Hi");
    }
    public static void main(String args[]){
        Arithmetic arith = new Arithmetic(3,5);
    }
}