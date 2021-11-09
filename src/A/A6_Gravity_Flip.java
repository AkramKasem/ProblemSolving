/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author akram
 * 
 * @link   http://codeforces.com/contest/405/problem/A
 * 
 * 
 */
public class A6_Gravity_Flip {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner input = new java.util.Scanner(System.in);

        int Col = input.nextInt();

        int height[] = new int[Col];

        for (int i = 0; i < height.length; i++) {
            height[i] = input.nextInt();
        }

        Arrays.sort(height);

        for (int i = 0; i < height.length; i++) {
            System.out.print(height[i] + " ");
        }

    }

}
