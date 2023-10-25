package package3;
public class Animal{
    public Animal(){
        System.out.println("I am Animal");
    }
    public void lion(){
        System.out.println("I am Lion Animal");
    }
    public static void tiger(){
        System.out.println("I am Tiger Animal");
    }
    public static void main(String args[]){
        Animal animal = new Animal();
        animal.lion();
        animal.tiger();
        tiger();
    }
}