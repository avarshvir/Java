package animalinterface;
class AnimalInterface{
    public static void main(String args[]){
        Dog d = new Dog();
        d.makeSound();
        Cat c = new Cat();
        c.makeSound();
        Animal a = new Dog();
        a.makeSound();
        //Dog a2 = new Animal();
    }
}