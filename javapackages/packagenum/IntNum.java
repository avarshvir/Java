package packagenum;
public class IntNum{
    public int intNum(int num){
        System.out.println(num);
        return num;
    }
    public static void main(String args[]){
        IntNum in = new IntNum();
        System.out.println(in.intNum(5));
    }
}