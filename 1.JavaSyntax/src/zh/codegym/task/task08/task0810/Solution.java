package zh.codegym.task.task08.task0810;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* 
执行 10000 次 get 调用所需的时间
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getGetTimeInMs(fill(new ArrayList())));
        System.out.println(getGetTimeInMs(fill(new LinkedList())));
    }

    public static List fill(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(new Object());
        }
        return list;
    }

    public static long getGetTimeInMs(List list) {
        // 在此编写你的代码

        LocalDateTime startDate = LocalDateTime.now();

        get10000(list);

        // 在此编写你的代码
        LocalDateTime endDate = LocalDateTime.now();

        return ChronoUnit.MILLIS.between(startDate,endDate);
    }

    public static void get10000(List list) {
        if (list.isEmpty()) {
            return;
        }
        int x = list.size() / 2;

        for (int i = 0; i < 10000; i++) {
            list.get(x);
        }
    }
}
