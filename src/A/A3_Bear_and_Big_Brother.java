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
 *  @link    http://codeforces.com/contest/791/problem/A
 * 
 */
public class A3_Bear_and_Big_Brother {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner input = new java.util.Scanner(System.in);

        int weight_Limak = input.nextInt();

        int weight_Bob = input.nextInt();

        int Year = 0;

        while (weight_Bob >= weight_Limak) {
            Year++;
            weight_Bob = weight_Bob * 2;
            weight_Limak = weight_Limak * 3;
        }

        System.out.println(Year);

    }

}
