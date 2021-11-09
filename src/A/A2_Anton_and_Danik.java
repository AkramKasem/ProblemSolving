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
 * @link  http://codeforces.com/contest/734/problem/A
 * 
 * 
 */
public class A2_Anton_and_Danik {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner input = new java.util.Scanner(System.in);

        int num_Game = input.nextInt();

        String Score = input.next();

        char Scores[] = Score.toCharArray();

        int A = 0;
        int D = 0;

        for (char S : Scores) {
            if (S == 'A') {
                A++;
            }
            if (S == 'D') {
                D++;
            }
        }

        if (A > D) {

            System.out.println("Anton");
        } else if (A < D) {

            System.out.println("Danik");
        } else if (A == D) {

            System.out.println("Friendship");
        }

    }

}
