/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author akram
 * 
 * @link    http://codeforces.com/contest/266/problem/A
 * 
 */
public class A12_Stones_on_the_Table {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String s = input.next();
        char[] a = s.toCharArray();
        int count = 0;
        for (int j = 0; j < n - 1; j++) {
            if (a[j + 1] == a[j]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
