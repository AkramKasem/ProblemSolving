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
 * @link https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/E
 *
 *
 */
public class E_Area_of_aCircle {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        double R = 3.141592653 ;
        double radius = input.nextFloat();
        double area = R * Math.pow(radius, 2);
        
        System.out.printf("%.9f",area);

        input.close();
    }

}
