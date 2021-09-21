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
 * @link https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/M
 *
 *
 */
public class M_Capital_or_Small_or_Digit {

    public static boolean isStringAlphabetCaptail(String str) {
        return ((str != null)
                && (!str.equals(""))
                && (str.matches("^[A-Z]*$")));
    }

    public static boolean isStringAlphabetSmall(String str) {
        return ((str != null)
                && (!str.equals(""))
                && (str.matches("^[a-z]*$")));
    }
    
    public static boolean isnumber(String str) {
        return ((str != null)
                && (!str.equals(""))
                && (str.matches("^[0-9]*$")));
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String test = input.nextLine();

        if (isStringAlphabetCaptail(test)) {
            System.out.println("ALPHA\n" +"IS CAPITAL");
        }else if (isStringAlphabetSmall(test)) {
            System.out.println("ALPHA\n" +"IS SMALL");
        }else if (isnumber(test)) {
            System.out.println("IS DIGIT");
        }
        
        
        
        input.close();
    }

}
