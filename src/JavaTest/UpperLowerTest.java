package JavaTest;
import static java.lang.System.out;
/**
 * Created by Administrator on 2016/9/25.
 */
public class UpperLowerTest {
    public String upper(String s){
        return s.toUpperCase();
    }
    public String lower(String s){
        return s.toLowerCase();

    }
    public static void main(String[] args){
            String s1 = "tests";
            UpperLowerTest ult =new UpperLowerTest();
        out.println(ult.upper(s1));
        out.println(ult.lower(ult.upper(s1)));

    }

}


