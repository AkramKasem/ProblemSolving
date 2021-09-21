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
 * @link https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/G
 *
 *
 */
public class G_Summation_from_1_to_N {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        long i = input.nextLong();
        long sum = (i) * (i + 1) / 2;
        System.out.println(sum);

        input.close();
    }

}
