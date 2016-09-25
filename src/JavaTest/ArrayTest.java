package JavaTest;
import sun.text.resources.cldr.ia.FormatData_ia;
import sun.text.resources.cldr.ja.FormatData_ja;

import java.util.Iterator;

import static java.lang.System.out;

/**
 * Created by Administrator on 2016/9/25.
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[] ints = new int[10];
        out.println(ints.length);
        for (int i = 0; i < ints.length; i++) {
            ints[i] = i + 1;
            out.println(ints[i]);
        }
        /*foreach Test*/
        int[] ar = {1, 2, 3, 4, 5};
        for (int i : ar) {
            out.print(i);
        }
        int[][] _2Dints = new int[4][5];
        for (int i = 0; i < _2Dints.length; i++) {
            for (int j = 0; j < _2Dints[i].length; j++) {
                _2Dints[i][j] = i + j;
            }
        }
    }
}


