package animalabstraction;
abstract class Animal{
    abstract void makeSound();
}
class Dog extends Animal{
    void makeSound(){
        System.out.println("Sound of dog is : Bow Bow");
    }
}
class Cat extends Animal{
    void makeSound(){
        System.out.println("Sound of cat is : Meow Meow");
    }
}
class AnimalAbstraction{
    public static void main(String args[]){
        Animal a = new Cat();
        a.makeSound();
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.makeSound();
        cat.makeSound();
     //   Dog d = new Cat();       ----> not work because Cat is not subclass of animal
     //   d.makeSound();
    }
}