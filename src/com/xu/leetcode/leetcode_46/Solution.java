package com.xu.leetcode.leetcode_46;

import java.util.ArrayList;
import java.util.List;

/**
 * Description 46. 全排列
 * Date 2022/3/7 20:37
 * Version 1.0.1
 *
 * @author Wen
 */
class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        // 用于存放选择路径
        List<Integer> track = new ArrayList<>();
        backTrack(nums, track);
        return result;
    }

    void backTrack(int[] nums, List<Integer> track) {
        // 满足结束条件
        if (track.size() == nums.length) {
            // 添加路径
            result.add(new ArrayList<>(track));
            return;
        }

        for (int num : nums) {
            // 排除已经选择过的
            if (track.contains(num)) {
                continue;
            }
            // 添加选择
            track.add(num);
            // 递归
            backTrack(nums, track);
            // 撤销选择
            track.remove(track.size() - 1);
        }
    }


}
