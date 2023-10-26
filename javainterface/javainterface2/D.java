package javainterface2;
class D extends C{
    
    public static void main(String args[]){
        A a = new C();
        a.printA();
        
        B b = new C();
        b.printB();


        D d = new D();
        d.printA();
        C d1 = new D();
        d1.printB();
        C c = new C();
        c.printA();
        c.printB();
    }
}