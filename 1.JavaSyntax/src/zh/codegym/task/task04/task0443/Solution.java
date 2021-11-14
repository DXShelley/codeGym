package zh.codegym.task.task04.task0443;


/* 
名字就是名字
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        String name = bis.readLine();
        String y = bis.readLine();
        String m = bis.readLine();
        String d = bis.readLine();

        System.out.println("我的名字叫" + name + "。");
        System.out.println("我出生于 " + m + "/" + d + "/" + y);
    }
}
