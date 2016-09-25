package JavaTest;

import java.util.Hashtable;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;

/**
 * Created by Administrator on 2016/9/25.
 */
public class E34 {
    public static void main(String[] args) {
        Hashtable<Integer,String> hash1 = new Hashtable<>();
        Hashtable<Integer,String> hash2 = new Hashtable<>();
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 10000 ; i++) {
            hash1.put(i, ((Math.random()*20/1)));
        }
        System.out.println(System.currentTimeMillis()-start1);
        long start2 = System.currentTimeMillis();
        for (int j = 0; j < 10000; j++) {
            hash2.put(j, (new Random(20)).toString());
        }
        System.out.println(System.currentTimeMillis()-start2);
    }
}
