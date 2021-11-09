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
 * @link http://codeforces.com/contest/344/problem/A
 * 
 * 
 */
public class A10_Magnets {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner input = new java.util.Scanner(System.in);

        int num_magnet = input.nextInt();

        int magnets[] = new int[num_magnet];

        for (int i = 0; i < magnets.length; i++) {
            magnets[i] = input.nextInt();
        }

        int Groups = 1;

        for (int i = 0; i < magnets.length - 1; i++) {

            if (magnets[i] != magnets[i + 1]) {
                Groups++;
            }

        }

        System.out.println(Groups);

    }

}
