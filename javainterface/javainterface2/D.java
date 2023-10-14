package javainterface2;
class D {
    
    public static void main(String args[]){
        A a = new C();
        a.printA();
        
        B b = new C();
        b.printB();


        D d = new D();
        C c = new C();
        c.printA();
        c.printB();
    }
}