package com.emam.index;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k = (int) (Math.random()*100);
        System.out.println("I have a number between 0 and 100 in my mind lets guess that");
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        do {
            cnt++;
            System.out.println("Guess The Number (0-100)");
            int vl = sc.nextInt();
            if(vl==k) {
                System.out.println("Booyah!!");
                System.out.print("You guessed the number in ");
                System.out.print(cnt);
                System.out.println(" steps.");
                break;
            }
            else if(vl>k) {
                System.out.println("Less than that");
            }
            else System.out.println("Greater than that");
        } while (true);
    }
}
