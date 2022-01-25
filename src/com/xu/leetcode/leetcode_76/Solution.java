package com.xu.leetcode.leetcode_76;

import java.util.HashMap;

/**
 * Description 
 * Date 2022/1/25 9:29
 * Version 1.0.1
 *
 * @author Wen
 */
public class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> hs = new HashMap<>();
        HashMap<Character, Integer> ht = new HashMap<>();
        // 记录ht中各个元素出现了多少次
        for (int i = 0; i < t.length(); i++) {
            ht.put(t.charAt(i), ht.getOrDefault(t.charAt(i), 0) + 1);
        }
        int len = Integer.MAX_VALUE;
        String res = "";
        int count = 0;
        for (int i = 0, j = 0; i < s.length(); i++) {
            // 记录hs中各个元素出现了多少次
            hs.put(s.charAt(i), hs.getOrDefault(s.charAt(i), 0) + 1);
            if (ht.containsKey(s.charAt(i)) && ht.get(s.charAt(i)) >= hs.get(s.charAt(i))) {
                count++;
            }
            while(j < i && (!ht.containsKey(s.charAt(j)) || ht.get(s.charAt(j)) < hs.get(s.charAt(j)))) {
                hs.put(s.charAt(j), hs.get(s.charAt(j)) - 1);
                j++;
            }
            if(count == t.length() && i - j + 1 < len) {
                len = i - j + 1;
                res = s.substring(j, i + 1);
            }
        }
        return res;
    }
}
