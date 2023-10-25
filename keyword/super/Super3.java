class Super3 extends Super1{
    Super3(){
        System.out.println("I am default constructor of sub 3 class");
    }
    Super3(int a){
        System.out.println("I am parameterized constructor of sub 3 class "+ a);
    }
    void super4(){
        super();
        System.out.println("I am method of sub 3 class without argument");
    }
    int super1(int a){
        System.out.println("I am method of sub 3 class with argument "+ a);
        return 0;
    }
    public static void main(String args[]){
        Super1 s = new Super3();
        Super1 s1 = new Super3(5);
        //s.super4();

        Super3 s6 = new Super3();
        s6.super4();
        
    }
    
}