/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A;

import java.util.Scanner;

/**
 *
 * @author akram
 * 
 * @link  http://codeforces.com/contest/731/problem/A
 * 
 */
public class A15_Night_Museum {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
      
        char name []  = S.toCharArray();
        int Moves = 0 ;
        int start = 0;
        
        for (int i = 0; i < name.length; i++) {
            int index = name[i]-97;
            int step = Math.abs(start-index);
            if (step < 13) {
                Moves += step;
            }else{
                Moves += 26 - step;
            }
            start = index;
        }
        
        System.out.println(Moves);
            
        
    }
    
}
