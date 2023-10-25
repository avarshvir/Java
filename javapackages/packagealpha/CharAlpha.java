package packagealpha;
public class CharAlpha{
    public char charA(){
        System.out.println("A");
        return 'A';
    }
    public char charB(){
        System.out.println("B");
        return 'B';
    }
    public static void main(String args[]){
        CharAlpha ca = new CharAlpha();
        System.out.println(ca.charA());
        System.out.println(ca.charB());
    }
}