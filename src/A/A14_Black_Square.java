/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A;

import java.util.Scanner;

/**
 *
 * @author akram
 * 
 * @link   http://codeforces.com/contest/431/problem/A
 * 
 * 
 */
public class A14_Black_Square {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int calories [] = new int[4];
        for (int i = 0; i < calories .length; i++) {
            calories [i] = in.nextInt();
        }

        String steps = in.next();
        
        int total_calories = 0; 
        for (int i = 0; i < steps.length(); i++) {
            total_calories += calories[Integer.parseInt(String.valueOf(steps.charAt(i)))-1];
        }
        System.out.println(total_calories);
        
    }
    
}
