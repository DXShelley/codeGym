package zh.codegym.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
共享的姓氏和名字
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Smith", "Christopher");
        map.put("Johnson", "Daniel");
        map.put("Williams", "Daniel");
        map.put("Jones", "Christopher");
        map.put("Brown", "Christopher");
        map.put("Johnson", "Jason");
        map.put("Johnson", "Jason");
        map.put("Williams", "Christopher");
        map.put("Williams", "Christopher");
        map.put("Williams", "Jason");

        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
