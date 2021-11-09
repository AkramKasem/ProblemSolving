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
 * @link https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/R
 *
 *
 */
public class R_Age_in_Days {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int noOfDays, year, month, week, days;
        
        noOfDays = input.nextInt();

        year = noOfDays/365;
        noOfDays=noOfDays%365;

        month = noOfDays/30;
        noOfDays=noOfDays%30;

//        week = noOfDays/7;
//        noOfDays=noOfDays%7;


        System.out.println(year +" years");
        System.out.println(month+" months"  );
//        System.out.println("Week: " + week);
        System.out.println(noOfDays+" days" );
        input.close();
    }

}
