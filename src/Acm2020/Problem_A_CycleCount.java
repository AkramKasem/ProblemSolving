package Acm2020;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Akram Kasem
 * 
 * Questions
 * 
 * El-Khadrawy is well-known across the globe for his love of graph problems, or as he calls them, "graphs".
 * Therefore, he couldn't miss the chance of setting a graph problem for his dear participants from Egypt.
 * In this problem, El-Khadrawy will give you a graph of N nodes. However, this graph doesn't contain any edges yet.
 * Next, El-Khadrawy asks you to add exactly N directed edges to this graph,
 * such that each node gets exactly one edge that starts from it. In addition, EI-Khadrawy will give you an integer C.
 * He asks you to count the number of ways to add the N edges, such that the resulting graph contains exactly C simple cycles.
 * Recall that a simple cycle is the one that starts from some node u, and by following the edges we can rcach back to u.
 * El-Khadrawy likes to make his problems tricky. So, for this problem, he told you that you are allowed to make self-loops.
 * In other words, you can have an edge that starts from some node u and ends at u itself. Since the number of ways can be very large,
 * print it modulo 10° + 7.
 * Two ways are considered different if the first one contains at least one edge that is not presented in the other.
 * 
 * 
 * Input 
 * 
 * 
 * The first line contains an integer T  denoting the number of test cases.
 * Each test case contains two integers N and C  denoting the number of nodes,
 * and the number of required simple cycles respectively. 
 * 
 * Output
 * 
 * For each test case print a single line containing a single integer denoting the answer to the problem.
 *
 *
 */
public class Problem_A_CycleCount {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(new FileInputStream("cycle.in"));

        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(get(input.nextInt()));
        }

    }

    public static int get(int z) {
        int number_schedule = 0;
        ArrayList<number> num = new ArrayList<>();
        for (int i = 0; i <= z; i++) {
            for (int j = 0; j <= z; j++) {
                if (((2 * i) + j) == z) {
                    num.add(new number(i, j));
                }
            }
        }

        for (number object : num) {
            number_schedule += factorial(object.getY() + object.getX()) / (factorial(object.getX()) * factorial(object.getY()));
        }
        return number_schedule;
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }

}