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
 * 
 * Questions
 * 
 * Resli is studying for his final exams. He finished all of his exams
 * except for the last one. Resli has only N hours left. He is going to write a
 * plan for the N hours to perform well in his final exam. He can do one of two
 * things, either study one lecture, which will take a whole hour, or eat fast
 * food, which will take two hours For example, if Resli has 5 hours left, one
 * possible schedule is SESS, which means he will study for one hour, eat for
 * two hours, study for one hour, and study for one hour, for a total of 5
 * hours. He could also choose one of the following plans: SSSSS, ESSS, SSES,
 * SSSE, SEE, ESE, and EES. Resli realized that there are a lot of ways that he
 * can schedule the studying plan. Can you help him count the number of ways?
 * Note that the number of ways could be very large, so you should print the
 * remainder of dividing it by 10° + 7.
 *
 * Input
 *
 * The first line of the input contains one integer T, the number of test cases.
 * The only line of each test case contains one integer N the remaining hours
 * for Resli's exam.
 *
 * Output
 *
 * For each test case, print one integer M, the number of ways to schedule a
 * studying plan in N hours, after taking the remainder of dividing it by 10°+
 * 7.
 *
 *
 */
public class Problem_C_Exams {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(new FileInputStream("exam.in"));

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

class number {

    private int x;
    private int y;

    public number(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public number() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
