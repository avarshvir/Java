package packagepractice;
public class PackagePractice{
    private int privateMember = 10;
    public int publicMember = 20;
    protected int protectedMember = 30;
    public static void main(String args[]){
        PackagePractice pp = new PackagePractice();
        System.out.println("private : "+pp.privateMember);
        System.out.println("protected : "+pp.protectedMember);
        System.out.println("public : "+pp.publicMember);
    }
}