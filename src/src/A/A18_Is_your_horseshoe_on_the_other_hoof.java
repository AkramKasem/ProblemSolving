/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author akram
 * 
 * @link   http://codeforces.com/contest/228/problem/A
 * 
 */
public class A18_Is_your_horseshoe_on_the_other_hoof {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
      
        HashSet<Integer> answear = new HashSet<>();
        for (int i = 0; i <4 ; i++) {
            answear.add(input.nextInt());
        }
        System.out.println(4-answear.size());
       
    }
    
}
