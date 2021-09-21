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
 * @link https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/L
 *
 *
 */
public class L_The_Brothers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name1 = input.nextLine();
        
        String name2 = input.nextLine();
        
        String[] rs1 = name1.split(" ");
        String[] rs2 = name2.split(" ");
        
        System.out.println((rs1[rs1.length-1].trim().equals(rs2[rs2.length-1].trim()))?"ARE Brothers":"NOT");

        
        
        input.close();
    }

}
