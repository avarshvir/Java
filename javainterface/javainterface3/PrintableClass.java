package javainterface3;
class PrintableClass implements Printable{
    public void printP(){
        System.out.println("Hi there!");
    }
    public static void main(String args[]){
        PrintableClass pc = new PrintableClass();
        pc.printP();
        Printable p = new PrintableClass();
        p.printP();
    }
}
