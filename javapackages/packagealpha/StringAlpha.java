package packagealpha;
public class StringAlpha{
    public String stringABC(){
        System.out.println("Ab");
        return "ABC";
    }
    public String stringXYZ(){
        System.out.println("XYZ");
        return "XYZ";
    }
    public static void main(String args[]){
        StringAlpha sa = new StringAlpha();
        sa.stringABC();
        sa.stringXYZ();
        //System.out.println(sa.StringABC());
        //System.out.println(sa.StringXYZ());
    }
}