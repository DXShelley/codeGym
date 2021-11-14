package zh.codegym.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

/* 
善良的艾玛和暑假
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<>();
        map.put("Stallone", df.parse("MAY 1 2012"));
        map.put("Stallone2", df.parse("JUNE 1 2012"));
        map.put("Stallone3", df.parse("JULY 1 2012"));
        map.put("Schwarzenegger", df.parse("AUGUST 1 2012"));
        map.put("Schwarzenegger2", df.parse("SEPTEMBER 1 2012"));
        map.put("Schwarzenegger3", df.parse("MAY 1 2012"));
        map.put("Willis", df.parse("JUNE 1 2012"));
        map.put("Willis2", df.parse("JUNE 1 2012"));
        map.put("Willis3", df.parse("JUNE 1 2012"));
        map.put("Stallone4", df.parse("JUNE 1 2012"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        HashMap<String, Date> copy = new HashMap<>(map);
        for (String key : copy.keySet()) {
            Date date = copy.get(key);
            int month = date.getMonth() + 1;
            if (month == 6 || month == 7 || month == 8) {
                map.remove(key);
            }
        }
    }

    public static void main(String[] args) {

    }
}
