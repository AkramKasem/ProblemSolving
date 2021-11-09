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
 * @link   http://codeforces.com/contest/263/problem/A
 * 
 */
public class A5_Beautiful_Matrix {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner input = new java.util.Scanner(System.in);

        int Step = 0;

        int Tasks[][] = new int[5][5];

        int where[] = new int[2];

        for (int i = 0; i < Tasks.length; i++) {
            for (int j = 0; j < Tasks[i].length; j++) {
                Tasks[i][j] = input.nextInt();
                if (Tasks[i][j] == 1) {
                    where[0] = i;
                    where[1] = j;
                }
            }
        }

//    		System.out.println(where[0]+"     "+where[1] );
        if (where[1] != 2) {
            while (where[1] > 2) {
                int Re[] = new int[5];
                for (int i = 0; i < where.length; i++) {
                    int x = Tasks[i][where[1]];
                    Tasks[i][where[1]] = Tasks[i][where[1] - 1];
                    Tasks[i][where[1] - 1] = x;
                }
                where[1]--;
                Step++;
            }

            while (where[1] < 2) {
                int Re[] = new int[5];
                for (int i = 0; i < where.length; i++) {
                    int x = Tasks[i][where[1]];
                    Tasks[i][where[1]] = Tasks[i][where[1] + 1];
                    Tasks[i][where[1] + 1] = x;
                }
                where[1]++;
                Step++;
            }
        }

        if (where[0] != 2) {
            while (where[0] > 2) {
                int Re[] = Arrays.copyOf(Tasks[where[0]], 5);
                Tasks[where[0]] = Arrays.copyOf(Tasks[where[0] - 1], 5);
                Tasks[where[0] - 1] = Arrays.copyOf(Re, 5);
                where[0]--;
                Step++;
            }
            while (where[0] < 2) {
                int Re[] = Arrays.copyOf(Tasks[where[0]], 5);
                Tasks[where[0]] = Arrays.copyOf(Tasks[where[0] + 1], 5);
                Tasks[where[0] + 1] = Arrays.copyOf(Re, 5);
                where[0]++;
                Step++;
            }
        }

//    		for (int i = 0; i < Tasks.length; i++) {
//				for (int j = 0; j < Tasks[i].length; j++) {
//					System.out.print(Tasks[i][j] +" ");
//					}
//				System.out.println();
//				}
        System.out.println(Step);

    }

}
