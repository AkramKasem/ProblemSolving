/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author akram
 * 
 * 
 * @link  http://codeforces.com/contest/236/problem/A
 * 
 */
public class A8_Boy_or_Girl {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner input = new java.util.Scanner(System.in);

        String string = input.next();

        char Char[] = string.toCharArray();

        Set<Character> Find = new LinkedHashSet<>();

        for (int i = 0; i < Char.length; i++) {
            Find.add(Char[i]);
        }

        if (Find.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        }
        if (Find.size() % 2 != 0) {
            System.out.println("IGNORE HIM!");
        }

    }

}
