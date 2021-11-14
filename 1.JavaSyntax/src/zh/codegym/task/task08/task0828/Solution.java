package zh.codegym.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
月份编号
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //在此编写你的代码

        HashMap<String,String> months = new HashMap<>();
        months.put("January","1");
        months.put("Feburary","2");
        months.put("March","3");
        months.put("April","4");
        months.put("May","5");
        months.put("June","6");
        months.put("July","7");
        months.put("August","8");
        months.put("September","9");
        months.put("October","10");
        months.put("November","11");
        months.put("December","12");



        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String month = bufferedReader.readLine();
        if(months.containsKey(month)) {
            System.out.println(month + " 是第 " + months.get(month) + " 个月");
        } else {
            System.out.println(month + " isn't a month");
        }
    }
}
