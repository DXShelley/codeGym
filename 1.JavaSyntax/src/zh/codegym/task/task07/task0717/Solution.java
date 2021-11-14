package zh.codegym.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
复制单词
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // 从控制台读取字符串并在此声明 ArrayList
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(bufferedReader.readLine());
        }

        ArrayList<String> result = doubleValues(list);

        // 显示结果
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //在此编写你的代码
        for (int i = 0; i < list.size(); i++) {
            list.add(i + 1, list.get(i));
            i++;
        }
        return list;
    }
}
