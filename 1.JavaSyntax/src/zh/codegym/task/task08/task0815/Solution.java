package zh.codegym.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
人口普查
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Smith", "Christopher");
        map.put("Johnson", "Daniel");
        map.put("Williams", "Jason");
        map.put("Jones", "Christopher");
        map.put("Brown", "Daniel");
        map.put("Davis", "Jason");
        map.put("Miller", "Christopher");
        map.put("Wilson", "Daniel");
        map.put("Anderson", "Jason");
        map.put("Jackson", "Christopher");
        return map;
    }

    public static int getSameFirstNameCount(HashMap<String, String> map, String name) {
        int count = 0;
        for (String nameTmp : map.values()) {
            if (nameTmp.equals(name)) {
                count++;
            }
        }
        return count;
    }

    public static int getSameLastNameCount(HashMap<String, String> map, String lastName) {
        int count = 0;
        for (String lastNameTmp : map.keySet()) {
            if (lastNameTmp.equals(lastName)) {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {

        HashMap<String, String> map = createMap();
        System.out.println(getSameFirstNameCount(map, "Jason"));
        System.out.println(getSameLastNameCount(map,"Smith"));

    }
}
