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
 * @link  http://codeforces.com/contest/268/problem/A
 * 
 */
public class A16_Games {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num_teams = input.nextInt();
        int home_uniforms  [] = new int[num_teams];
        int guest_uniforms [] = new int[num_teams];
      
        
        int team_guest_uniforms = 0;
        
        for (int i = 0; i < guest_uniforms.length; i++) {
            home_uniforms[i] = input.nextInt();
            guest_uniforms[i] = input.nextInt();           
        }
       
        
        for (int i = 0; i < home_uniforms.length; i++) {
            for (int j = 0; j < guest_uniforms.length; j++) {
                if (home_uniforms[i] == guest_uniforms[j]) {
                    team_guest_uniforms ++;
                }
                
            }
        }
        
        System.out.println(team_guest_uniforms);
    }
    
}
