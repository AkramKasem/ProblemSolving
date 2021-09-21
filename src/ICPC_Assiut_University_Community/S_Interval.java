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
 * @link https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/S
 *
 *
 */
public class S_Interval {

    
   static void Interval(double number){
       
       if (number >= 0 && number <= 25)
            System.out.println("Interval [0,25]");
 
        else if (number > 25 && number <= 50)
            System.out.println("Interval (25,50]");
 
        else if (number > 50 && number <= 75)
            System.out.println("Interval (50,75]");
 
        else if (number > 75 && number <= 100)
            System.out.println("Interval (75,100]");
 
        else
            System.out.println("Out of Intervals");
       
   }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();
        
       Interval(number);
    }

}
