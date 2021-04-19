package com.study.oo.nowcoder;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StockArray {
    public static void main(String[] args) {
        int[] test = {2,5,4,1,7};
        System.out.println(maxProfit(test));
    }
    public static int maxProfit (int[] prices) {
        // write code here
        int min = prices[0];
        int ans = 0;
        for (int i = 0; i < prices.length; i++){
            min = Math.min(min, prices[i]);
            ans = Math.max(ans, prices[i] - min);
        }
        return ans;
    }

    private static int method2(int[] prices) {
        int ans = 0;
        HashMap <Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < prices.length; i++){
            for (int j = i+1; j < prices.length; j++) {
                if (hm.containsKey(prices[i])) {
                    hm.put(prices[i], prices[j] < hm.get(prices[i]) ? hm.get(prices[i]) : prices[j]);
                }
                else {
                    hm.put(prices[i], prices[j]);
                }
            }
        }
        Set<Map.Entry<Integer, Integer>> entries = hm.entrySet();
        for (Map.Entry<Integer, Integer> mm : entries){
            //System.out.println(mm.getKey()+"  "+ mm.getValue());
            ans = Math.max(ans,mm.getValue()-mm.getKey());
        }

        return ans;
    }
}
