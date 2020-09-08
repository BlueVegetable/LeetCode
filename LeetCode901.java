package leetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode901 {
    List<Integer> list;
    List<Integer> stepList;

    public LeetCode901() {
        list = new ArrayList<>();
        stepList = new ArrayList<>();
    }

    public int next(int price) {
        //第一天肯定是1
        if (list.size() == 0) {
            list.add(price);
            stepList.add(1);
            return 1;
        }

        int ans = 1;//跨度
        for (int day = list.size() - 1;day > -1;) {
            if (list.get(day) > price) {
                //如果跳跃后已经大于price，找到结果，存到list
                list.add(price);
                stepList.add(ans);
                return ans;
            }
            //跨度加上前一天的跨度
            ans += stepList.get(day);
            //天数往前跳跃
            day -= stepList.get(day);
        }
        list.add(price);
        stepList.add(ans);
        return ans;
    }
}