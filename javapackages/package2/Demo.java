package package2;
import package1.*;
class Demo{
    public static void main(String ... args){
        A a2 = new A();
        a2.a();
        CreatePackage cp = new CreatePackage();
        cp.msg();
    }
}