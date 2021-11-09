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
 * @link   https://codeforces.com/contest/265/problem/A
 *
 */
public class A19_Colorful_Stones_Simplified_Edition {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
 
        Scanner input = new java.util.Scanner(System.in);
 
        String s1 = input.nextLine();
        String s2 = input.nextLine();
        int i = 0;
        for (int j = 0; j < s2.length(); j++) {
            if (s2.charAt(j) == s1.charAt(i)) {
                i++;
            }
        }
        System.out.print(i + 1);
 
    }
 
}

