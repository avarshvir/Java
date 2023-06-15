// single inheritance example 1 
// ParentClass is base class and ChildClass is derived class
class ChildClass extends ParentClass{

   public void showChildClass(){
        System.out.println("This is child class");
    }

    public static void main(String args[]){
        ChildClass childClass = new ChildClass();
        
        //calling ChildClass method by object of child class
        childClass.showChildClass();

        //calling ParentClass method by object of parent class
        childClass.showParentClass();
    }
}