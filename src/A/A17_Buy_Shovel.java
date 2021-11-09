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
 * @link  http://codeforces.com/contest/732/problem/A
 * 
 */
public class A17_Buy_Shovel {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int Cost_Shovel = input.nextInt();
        int Single_Coin = input.nextInt();
      
        int Total_Shovel = 0 ;        
        for (int i = 1; true; i++) {
            int test = i * Cost_Shovel ;
            Total_Shovel ++;
            if ( (test % 10) == 0 ) {
                break;
            }else if ( ((test-Single_Coin)% 10) == 0 ) {
                break;
            }
        }
        
        System.out.println(Total_Shovel);
       
    }
    
}
