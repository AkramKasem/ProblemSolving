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
 * 
 * @ link http://codeforces.com/contest/231/problem/A
 * 
 */
public class A4_Team {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner input = new java.util.Scanner(System.in);

        int Num_Tasks = input.nextInt();

        int Tasks[][] = new int[Num_Tasks][3];

        int Solve = 0;

        for (int i = 0; i < Tasks.length; i++) {
            for (int j = 0; j < Tasks[i].length; j++) {
                Tasks[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < Tasks.length; i++) {
            int Agree = 0;
            for (int j = 0; j < Tasks[i].length; j++) {
                if (Tasks[i][j] == 1) {
                    Agree++;
                }
            }
            if (Agree >= 2) {
                Solve++;
            }
        }

        System.out.println(Solve);

    }

}
