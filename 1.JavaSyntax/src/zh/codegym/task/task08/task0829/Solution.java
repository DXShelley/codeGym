package zh.codegym.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* 
软件更新
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // 地址列表
        HashMap<String, String> addresses = new HashMap<>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) {
                break;
            }
            String family = reader.readLine();

            addresses.put(city, family);
        }

        // 读取门牌号
        String city = reader.readLine();

        if (addresses.containsKey(city)) {
            String familyName = addresses.get(city);
            System.out.println(familyName);
        }
    }
}
