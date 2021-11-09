/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author akram
 * 
 * @link   http://codeforces.com/contest/427/problem/A
 * 
 */
public class A13_Police_Recruits {

     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = 0;
        int k = 0;
        for(int i = 0; i < n; i++) {
            int a = in.nextInt();
            if(a < 0 && p == 0) k++;
            else if(a < 0) p--;
            else if(a > 0) p+=a;
        }
        System.out.println(k);
    }
} 
