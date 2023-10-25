package packagenum;
public class FloatNum{
    public float floatNum(float num){
        System.out.println(num);
        return num;
    }
    public static void main(String args[]){
        FloatNum fn = new FloatNum();
        System.out.println(fn.floatNum(5.23f));
    }
}