package zh.codegym.task.task07.task0718;

import sun.security.krb5.internal.crypto.Aes128;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
检查顺序
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //在此编写你的代码

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(bufferedReader.readLine());
        }
        int length = list.get(0).length();
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).length() > list.get(i + 1).length()) {
                System.out.println(i + 1);
            }
        }
        ;

    }
}

