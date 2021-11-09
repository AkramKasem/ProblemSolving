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
 * @link  http://codeforces.com/contest/677/problem/A
 * 
 * 
 */
public class A1_Vanya_and_Fence {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner input = new Scanner(System.in);

        int num_Frined = input.nextInt();
        int Hieght_fence = input.nextInt();
        int Frineds[] = new int[num_Frined];
        int width_road = 0;
        for (int i = 0; i < Frineds.length; i++) {
            Frineds[i] = input.nextInt();
        }
        for (int i = 0; i < Frineds.length; i++) {
            if (Frineds[i] <= Hieght_fence) {
                width_road++;
            }
            if (Frineds[i] > Hieght_fence) {
                width_road += 2;
            }
        }

        System.out.println(width_road);

    }

}
