package packagealphanum;
import packagealpha.*;
import packagenum.*;
//import packagealpha.StringAlpha;
class AlphaNum{
    public static void main(String args[]){
        CharAlpha ca = new CharAlpha();
        ca.charB();
        ca.charA();
        StringAlpha sa = new StringAlpha();
        sa.stringABC();
        IntNum in = new IntNum();
        in.intNum(4);
        FloatNum fn = new FloatNum();
        fn.floatNum(4.34f);
    }
}