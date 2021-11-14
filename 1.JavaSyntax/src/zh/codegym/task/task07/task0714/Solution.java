package zh.codegym.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
以相反顺序显示词语
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码

        ArrayList<String> stringArrayList = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            stringArrayList.add(bufferedReader.readLine());
        }

        stringArrayList.remove(2);

        for (int i = 0; i < stringArrayList.size(); i++) {
            System.out.println(stringArrayList.get(stringArrayList.size() - i - 1));
        }

    }
}


