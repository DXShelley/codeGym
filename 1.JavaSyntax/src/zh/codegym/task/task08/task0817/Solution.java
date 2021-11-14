package zh.codegym.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
我们不需要重复的内容
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Stallone", "Sylvester");
        map.put("Stallone2", "Bruce");
        map.put("Stallone3", "Arnold");
        map.put("Schwarzenegger", "Sylvester");
        map.put("Schwarzenegger2", "Bruce");
        map.put("Schwarzenegger3", "Arnold");
        map.put("Willis", "Sylvester");
        map.put("Willis2", "Bruce");
        map.put("Willis3", "Arnold");
        map.put("Stallone4", "Sylvester4");
        return map;
    }

    public static void removeFirstNameDuplicates(Map<String, String> map) {
        HashMap<String, String> copy = new HashMap<>(map);

        for (String copyName : copy.values()) {
            int count = 0;
            for (String name : map.values()) {
                if (name.equals(copyName)) {
                    count++;
                }
            }
            if (count > 1) {
                removeItemFromMapByValue(map, copyName);
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
