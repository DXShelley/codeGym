package zh.codegym.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
N 个数字中的最小值
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // 此处找出最小值

        int min = array.get(0);

        for (int i = 0; i < array.size(); i++) {
            if(min > array.get(i)) {
                min = array.get(i);
            }
        }
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        // 此处创建并初始化列表
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        ArrayList<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(bufferedReader.readLine()));
        }
        return list;
    }
}
