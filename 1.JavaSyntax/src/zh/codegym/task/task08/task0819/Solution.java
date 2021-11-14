package zh.codegym.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
包含猫的集
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        cats.remove(cats.toArray()[0]);
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //在此编写你的代码. 第 2 步
        Set<Cat> set = new HashSet<>();
        set.add(new Cat());
        set.add(new Cat());
        set.add(new Cat());
        return set;
    }

    public static void printCats(Set<Cat> cats) {
        // 第 4 步

        for (Cat cat :
                cats) {
            System.out.println(cat);
        }
    }

    // 第 1 步

    public static class  Cat {

    }
}
