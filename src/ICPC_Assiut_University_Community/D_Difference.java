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
 * @link https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/D
 *
 *
 */
public class D_Difference {

    public static void main(String[] args) {

        long X ;

        Scanner input = new Scanner(System.in);



        X = (input.nextLong()*input.nextLong()) - (input.nextLong()*input.nextLong());

        System.out.println("Difference = " + X);

        input.close();
    }

}
