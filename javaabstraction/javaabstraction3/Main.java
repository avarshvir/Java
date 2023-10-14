package javaabstraction3;
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String c,p,a,m;
        long pr;
        System.out.println("Enter Category");
        c = sc.nextLine();
        System.out.println("Enter Product Name");
        p = sc.nextLine();
        System.out.println("Enter Manufaturer");
        m = sc.nextLine();
        System.out.println("Enter Author");
        a = sc.nextLine();
        System.out.println("Enter Price");
        pr = sc.nextInt();

        Books book = new Books(c,p,pr,m,a);
        System.out.println("manufacturer : " +book.getManufacturer());
        
        
        
    }
}