/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ICPC_Assiut_University_Community;

import java.util.Scanner;

/**
 *
 * @author akram
 *
 * @link https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/U
 *
 *
 */
public class U_Float_or_int {

    static boolean isInteger(double N) {

        int X = (int) N;
        double temp2 = N - X;

        if (temp2 > 0) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double num = input.nextDouble();

        System.out.println((isInteger(num)?"int "+(int)num:"float "+(int)num+" "+ (float)(num - (int)num)));

    }

}
