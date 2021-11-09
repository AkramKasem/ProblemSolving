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
 * @link https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/H
 *
 *
 */
public class H_Two_numbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double number1 = input.nextDouble();
        
        double number2 = input.nextDouble();
        
        System.out.println("floor "+(int)number1+" / "+(int)number2+" = " +(int)Math.floor(number1/number2)+"\n"+
                           "ceil "+(int)number1+" / "+(int)number2+" = " +(int)Math.ceil(number1/number2)+"\n"+
                           "round "+(int)number1+" / "+(int)number2+" = " +(int)Math.round(number1/number2));

        
        
        input.close();
    }

}
