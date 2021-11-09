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
 * @link https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/X
 *
 *
 */
public class X_Two_intervals {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        long num1 = input.nextLong();
        long num2 = input.nextLong();
        long num3 = input.nextLong();
        long num4 = input.nextLong();

        if (num2 >= num3 && num4 >= num1) {
            System.out.println(num3 + " " + num2);
        } else if (num2 > num4  ) {
            System.out.println(num4 + " " + num2);
        } else if (num3 > num1 && num4 > num2 && num2 >= num3 ) {
            System.out.println(num3 + " " + num4);
        } else {
            System.out.println("-1");
        }

//        167959139 167959139 167959139 167959139
//        291882089 585325539 358502890 365329221
//          358502890 365329221
//          358502890 585325539
        input.close();
    }

}
