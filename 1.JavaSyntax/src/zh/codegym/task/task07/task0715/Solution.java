package zh.codegym.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
又见“我是山姆”
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String m1 = "山姆";
        String m2 = "我";
        String m3 = "是";
        String m4 = "火腿";

        ArrayList<String> list = new ArrayList<>();
        list.add(m1); //0
        list.add(m2); //1
        list.add(m3); //2

        list.add(1, m4);
        list.add(3, m4);
        list.add(5, m4);

        for (String s : list) {
            System.out.println(s);
        }
    }
}
