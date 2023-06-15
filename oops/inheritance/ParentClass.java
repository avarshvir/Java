// single inheritance example 1 
// ParentClass is base class and ChildClass is derived class
class ParentClass{
    
    public void showParentClass(){
        System.out.println("This is parent class");
    }

    public static void main(String args[]){
        ParentClass parentClass = new ParentClass();
        parentClass.showParentClass();
    }

}