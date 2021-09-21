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
 * @link https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/N
 *
 *
 */
public class N_Char {

    static void check(char ch)
    {
     
        if (ch >= 'A' && ch <= 'Z')
            System.out.println((ch +"").toLowerCase());
     
        else if (ch >= 'a' && ch <= 'z')
            System.out.println((ch +"").toUpperCase());
     
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char test = input.next().charAt(0);

        check(test);
        
        
        
        input.close();
    }

}
