package zh.codegym.task.task07.task0716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
R 或 L
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String m1 = "rose";
        String m2 = "lyre";
        String m3 = "love";

        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add(m1); //0
        list.add(m2); //1
        list.add(m3); //2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {

        String m4 = "r";
        String m5 = "l";

        ArrayList<String> result = new ArrayList<String>();
        for (String s : list) {
            boolean r = s.indexOf(m4) >= 0;
            boolean l = s.indexOf(m5) >= 0;

            if (r && !l) {
                continue; //skip s
            }

            if (!r && l) {
                result.add(s);
            }

            result.add(s);
        }
        return result;
    }
}
