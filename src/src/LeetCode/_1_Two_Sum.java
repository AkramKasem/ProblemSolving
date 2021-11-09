/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

/**
 *
 * @author akram
 * @link https://leetcode.com/problems/two-sum/
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class _1_Two_Sum {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> terms = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (terms.containsKey(target - nums[i])) {
                return new int[]{terms.get(target - nums[i]), i};
            }
            terms.put(nums[i], i);
        }

        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] arrOfStr = str.split(" ");

        int size = arrOfStr.length;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(arrOfStr[i]);
        }

        System.out.println(Arrays.toString(twoSum(arr, sc.nextInt())));

    }

}
