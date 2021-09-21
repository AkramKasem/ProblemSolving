/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ICPC_Assiut_University_Community;

import java.util.Scanner;

/**
 *
 * @author akram
 *
 * @link https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/T
 *
 *
 */
public class T_Sort_Numbers {

    /**
     * Sort Numbers
     */
    public static void displaySortedNumbers(long a, long b, long c) {
        long min, max, med;//assume values are there for a b c
        if (a > b) {
            if (a > c) {
                max = a;
                if (b > c) {
                    med = b;
                    min = c;
                } else {
                    med = c;
                    min = b;
                }
            } else {
                med = a;
                max = c;
                min = b;
            }
        } else {
            if (b > c) {
                max = b;
                if (a > c) {
                    med = a;
                    min = c;
                } else {
                    med = c;
                    min = a;
                }
            } else {
                med = b;
                max = c;
                min = a;
            }
        }
        System.out.println(min + "\n" + med + "\n" + max);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        long num1 = input.nextLong();
        long num2 = input.nextLong();
        long num3 = input.nextLong();
        displaySortedNumbers(num1, num2, num3);

        System.out.println("\n" + num1 + "\n" + num2 + "\n" + num3);

    }

}
