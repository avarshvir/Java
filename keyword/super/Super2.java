class Super2 extends Super1{
    Super2(){
        System.out.println("I am default constructor of sub class");
    }
    Super2(int a){
        super(a);
        System.out.println("I am parameterized constructor of sub class "+ a);
    }
    @Override
    void super1(){
       // super();
        System.out.println("I am method of sub class without argument");
    }
    @Override
    int super1(int a){
        //super(a);
        System.out.println("I am method of sub class with argument "+ a);
        return 0;
    }
    public static void main(String args[]){
        /*Super1 s = new Super1();
        Super1 s1 = new Super1(5);
        s.super1();
        s.super1(10);*/

        Super1 s2 = new Super2(5);
        Super1 s3 = new Super2();
        //s2.super1();
       // s2.super2(10);
        Super2 s4 = new Super2();
        s4.super1();
        
        
    }
    
}