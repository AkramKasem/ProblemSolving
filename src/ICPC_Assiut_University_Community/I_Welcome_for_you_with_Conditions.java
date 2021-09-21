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
 * @link https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/I
 *
 *
 */
public class I_Welcome_for_you_with_Conditions {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1 = input.nextInt();
        
        int number2 = input.nextInt();
        
        System.out.println((number1>=number2)?"Yes":"No");

        
        
        input.close();
    }

}
