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
 * @link https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/Q
 *
 *
 */
public class Q_Coordinates_of_a_Point {

    
    static void quadrant(double x, double y)
    {
        if (x > 0 && y > 0)
            System.out.println("Q1");
 
        else if (x < 0 && y > 0)
            System.out.println("Q2");
 
        else if (x < 0 && y < 0)
            System.out.println("Q3");
 
        else if (x > 0 && y < 0)
            System.out.println("Q4");
 
        else if (x == 0 && y > 0)
            System.out.println("Eixo Y");
 
        else if (x == 0 && y < 0)
            System.out.println("Eixo Y");
 
        else if (y == 0 && x < 0)
            System.out.println("Eixo X");
 
        else if (y == 0 && x > 0)
            System.out.println("Eixo X");
 
        else
            System.out.println("Origem");
    }
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double point1 = input.nextDouble();
        double point2 = input.nextDouble();
        
        
        quadrant(point1, point2);

        input.close();
    }

}
