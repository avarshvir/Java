class GrandParent{
    public void showGrandParent(){
        System.out.println("This is GrandParent class");
    }
}
class Parent extends GrandParent{
    public void showParent(){
        System.out.println("This is Parent Class");
    }
}
class MultiLevelInheritance extends Parent{
    public void showChild(){
        System.out.println("This is child class");
    }
    public static void main(String args[]){
        MultiLevelInheritance child = new MultiLevelInheritance();
        child.showGrandParent();
        child.showParent();
        child.showChild();
    }
}