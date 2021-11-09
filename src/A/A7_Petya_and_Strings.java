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
 * @link  http://codeforces.com/contest/112/problem/A
 * 
 */
public class A7_Petya_and_Strings {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner input = new java.util.Scanner(System.in);

        String Frist = input.next();

        String Second = input.next();

        if (Frist.compareToIgnoreCase(Second) > 0) {
            System.out.println(1);
        } else if (Frist.compareToIgnoreCase(Second) < 0) {
            System.out.println(-1);
        } else if (Frist.compareToIgnoreCase(Second) == 0) {
            System.out.println(0);
        }

    }

}
