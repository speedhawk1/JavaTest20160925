package JavaTest;

/**
 * Created by Administrator on 2016/9/25.
 */
public class StringChangeTest {
    private static final String ABCD = "abcd";
    public static void main(String[] args){
        StringBuffer stringBuffer = new StringBuffer("");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            stringBuffer.append(ABCD);
        }
        System.out.println(System.currentTimeMillis()-start);
        System.out.println(stringBuffer.length());
    }
}
