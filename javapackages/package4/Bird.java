package package4;
import package3.*;

class Bird{
    Bird(){
        System.out.println("I am Bird");
    }
    public static void main(String args[]){
        Animal a = new Animal();
        Bird bird = new Bird();
        a.lion();
        a.tiger();
        
        //tiger();
    }
}