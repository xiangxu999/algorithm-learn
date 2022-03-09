package com.xu.lan_yan.twelve_I;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Description 双向排序
 * Date 2022/3/8 22:29
 * Version 1.0.1
 *
 * @author Wen
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }
        int jiang = 0;
        int sheng = nums.length - 1;
        for (int j = 0; j < m; j++) {
            int p = input.nextInt();
            int q = input.nextInt();
            // 降序
            if (p == 0) {
                if (q - 1 > jiang) {
                    Arrays.sort(nums, 0, q);
                    reSort(nums, 0, q - 1 );
                    jiang = q - 1;
                } else {
                    if (jiang > sheng) {
                        Arrays.sort(nums, 0, q);
                        reSort(nums, 0, q - 1 );
                        jiang = q - 1;
                    }
                }

            }

            // 升序
            if (p == 1) {
                if (q - 1 < sheng) {
                    Arrays.sort(nums, q - 1, nums.length);
                    sheng = q - 1;
                } else {
                    if(sheng < jiang) {
                        Arrays.sort(nums, q - 1, nums.length);
                        sheng = q - 1;
                    }
                }
            }
        }
        for (int temp : nums) {
            System.out.print(temp + " ");
        }

    }

    private static void reSort(int[] nums, int fromIndex, int toIndex) {
        if (fromIndex >= toIndex) {
            return;
        }
        for (int i = fromIndex, j = toIndex; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
