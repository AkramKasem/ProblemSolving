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
 * @link   http://codeforces.com/contest/59/problem/A
 * 
 */
public class A9_Word {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner input = new java.util.Scanner(System.in);

        String string = input.next();

        char Char[] = string.toCharArray();

        int upper = 0;

        int lower = 0;

        for (int i = 0; i < Char.length; i++) {
            if (Character.isUpperCase(Char[i])) {
                upper++;
            }
            if (Character.isLowerCase(Char[i])) {
                lower++;
            }
        }

        String Correction = null;
        if (upper > lower) {
            Correction = string.toUpperCase();
        } else if (upper <= lower) {
            Correction = string.toLowerCase();
        }

        System.out.println(Correction);

    }

}
