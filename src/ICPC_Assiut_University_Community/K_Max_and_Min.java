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
 * @link https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/K
 *
 *
 */
public class K_Max_and_Min {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        long x = input.nextLong();
        
        long y = input.nextLong();
        
        long z = input.nextLong();
        
        System.out.println(Math.min(Math.min(x,y),z)+" "+ Math.max(Math.max(x,y),z));

        
        
        input.close();
    }

}
