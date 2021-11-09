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
 * @link   http://codeforces.com/contest/381/problem/A
 * 
 */
public class A11_Sereja_and_Dima {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new java.util.Scanner(System.in);
        int num_Card = input.nextInt();
        ArrayList<Integer> Value_Card = new ArrayList<Integer>();

        for (int i = 0; i < num_Card; i++) {
            Value_Card.add(input.nextInt());
        }
        int Sereja = 0;
        int Dima = 0;
        while (Value_Card.size() != 0) {
            if (Value_Card.get(0) >= Value_Card.get(Value_Card.size() - 1)) {
                Sereja = Sereja + Value_Card.get(0);
                Value_Card.remove(0);
            } else {
                Sereja = Sereja + Value_Card.get(Value_Card.size() - 1);
                Value_Card.remove(Value_Card.size() - 1);
            }
            if (Value_Card.size() == 0) {
                break;
            }
            if (Value_Card.get(0) >= Value_Card.get(Value_Card.size() - 1)) {
                Dima = Dima + Value_Card.get(0);
                Value_Card.remove(0);
            } else {
                Dima = Dima + Value_Card.get(Value_Card.size() - 1);
                Value_Card.remove(Value_Card.size() - 1);
            }
        }

        System.out.println(Sereja + " " + Dima);
    }
}
