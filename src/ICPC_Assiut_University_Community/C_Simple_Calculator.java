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
 * @link https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/C
 *
 *
 */
public class C_Simple_Calculator {

    
    public static void main(String[] args) {

    long number1, number2, result;

    
    Scanner input = new Scanner(System.in);

   
    number1 = input.nextLong();

    number2 = input.nextLong();


        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        
        
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        
        
  }
    
  

}
