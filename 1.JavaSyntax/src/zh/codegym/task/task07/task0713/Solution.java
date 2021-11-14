package zh.codegym.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
玩 Javarella
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //在此编写你的代码
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(bufferedReader.readLine()));
        }

        for (int i = 0; i < list.size(); i++) {
            Integer x = list.get(i);
            if ((x % 3 == 0) || (x % 2 == 0)) {
                if (x % 3 == 0) {
                    list2.add(x);
                }

                if (x % 2 == 0) {
                    list3.add(x);
                }
            } else {
                list4.add(x);
            }
        }


        printList(list2);
        printList(list3);
        printList(list4);


    }

    public static void printList(List<Integer> list) {
        //在此编写你的代码

        for (Integer item :
                list) {
            System.out.println(item);
        }
    }
}
