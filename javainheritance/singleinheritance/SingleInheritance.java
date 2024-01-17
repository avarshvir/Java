class Animal{
    public void show(){
        System.out.println("This is Animal Class");
    }
    public void eat(){
        System.out.println("Animal is Eating");
    }
}
class Dog extends Animal{
    public void bark(){
        System.out.println("Dog is Barking");
    }
    //@overridden
    public void eat(){
        System.out.println("This is overridden");
    }
}
class SingleInheritance{
    public static void main(String args[]){
        Dog dog = new Dog();
        dog.show();
        dog.bark();
        dog.eat();

        Animal animal = new Animal();
        animal.show();
        animal.eat();
        //animal.bark();

        Animal animal2 = new Dog();
        animal2.eat();
       //animal2.bark();      // this will not work
    }
}