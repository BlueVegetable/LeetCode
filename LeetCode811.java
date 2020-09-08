package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode811 {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String,Integer> util = new HashMap<>();
        for (String cpdomain:cpdomains) {
            String[] strs1 = cpdomain.split(" ");
            Integer times = Integer.parseInt(strs1[0]);
            String[] strs2 = strs1[1].split("\\.");
            String value = "";
            for (int i=strs2.length-1;i>=0;i--) {
                if(i == strs2.length-1) {
                    value = strs2[i] + value;
                } else {
                    value = strs2[i] + "." + value;
                }
                int number = util.getOrDefault(value,0);
                number = times + number;
                util.put(value,number);
            }
        }
        List<String> result = new ArrayList<>();
        for (Map.Entry<String,Integer> inline:util.entrySet()) {
            result.add(inline.getValue()+" "+inline.getKey());
        }
        return result;
    }
}
