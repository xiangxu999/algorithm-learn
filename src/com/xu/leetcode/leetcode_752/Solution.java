package com.xu.leetcode.leetcode_752;

import java.util.*;

/**
 * Description 752. 打开转盘锁
 * Date 2022/3/12 15:50
 * Version 1.0.1
 *
 * @author Wen
 */
class Solution {
    public int openLock(String[] deadends, String target) {
        Set<String> deadensList = new HashSet<>();
        // 所有死亡字符串加入set集合
        deadensList.addAll(Arrays.asList(deadends));
        // 当前节点队列
        Queue<String> queue = new LinkedList<>();
        // 访问过的节点队列
        Set<String> visited = new HashSet<>();
        queue.offer("0000");
        visited.add("0000");
        int step = 0;

        while(!queue.isEmpty()) {
            // 当前队列的大小
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                // 当前的字符串
                String current = queue.poll();
                // 避开所有死亡字符串
                if(deadensList.contains(current)) {
                    continue;
                }
                if(current.equals(target)) {
                    return step;
                }
                // 将临近的节点加入节点队列
                for(int j = 0; j < 4; j++) {
                    // 向上的四个临近节点
                    String upStr = up(current, j);
                    if(!visited.contains(upStr)) {
                        queue.offer(upStr);
                        visited.add(upStr);
                    }
                    // 向下的四个临近节点
                    String downStr = down(current, j);
                    if(!visited.contains(downStr)) {
                        queue.offer(downStr);
                        visited.add(downStr);
                    }
                }

            }
            step++;
        }
        return -1;
    }

    /**
     * 向上调整
     */
    String down(String src, int j) {
        char[] ch = src.toCharArray();
        if(ch[j] == '0') {
            ch[j] = '9';
        } else {
            ch[j] -= 1;
        }
        return new String(ch);
    }

    /**
     * 向下调整
     */
    String up(String src, int j) {
        char[] ch = src.toCharArray();
        if(ch[j] == '9') {
            ch[j] = '0';
        } else {
            ch[j] += 1;
        }
        return new String(ch);
    }
}
