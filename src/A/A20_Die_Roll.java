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
 * @link https://codeforces.com/contest/9/problem/A
 *
 *
 */
public class A20_Die_Roll {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner input = new java.util.Scanner(System.in);

        int y = input.nextInt();
        int w = input.nextInt();

        if (w >= y) {
            y = w;
        } else {
            w = y;
        }

        switch (w) {
            case 1:
                System.out.println("1/1");
                break;
            case 2:
                System.out.println("5/6");
                break;
            case 3:
                System.out.println("2/3");
                break;
            case 4:
                System.out.println("1/2");
                break;
            case 5:
                System.out.println("1/3");
                break;
            case 6:
                System.out.println("1/6");
                break;
        }
        input.close();

    }

}
