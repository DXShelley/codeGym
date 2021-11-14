package zh.codegym.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/* 
大于 10？你不适合我们
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        // 在此编写你的代码

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < 20; i++) {
            set.add(i * 2);
        }

        return  set;
    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        // 在此编写你的代码

        HashSet<Integer> back = new HashSet<>();
        for (Integer ii :
                set) {
            if (ii <= 10) {
                back.add(ii);
            }


        }

        return back;

    }
    public static void main(String[] args) {

    }
}
