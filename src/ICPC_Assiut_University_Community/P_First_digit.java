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
 * @link https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/P
 *
 *
 */
public class P_First_digit {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String number = input.next();
        
        
        
        System.out.println((Integer.parseInt(number.substring(0,1))%2 == 0)?"EVEN":"ODD");

        input.close();
    }

}
