class Super1{
    Super1(){
        System.out.println("I am default constructor of super class");
    }
    Super1(int a){
        System.out.println("I am parameterized constructor of super class "+ a);
    }
    void super1(){
        System.out.println("I am method of super class without argument");
    }
    int super1(int a){
        System.out.println("I am method of super class with argument "+ a);
        return 0;
    }
    public static void main(String args[]){
        Super1 s = new Super1();
        Super1 s1 = new Super1(5);
        s.super1();
        s.super1(10);
        
    }
    
}