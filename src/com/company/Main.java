package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int w = scan.nextInt();
        int[] p = new int[n];
        int number = 0;
        int score = Integer.MIN_VALUE;
        for (int i=0;i<w;i++){
            int x = scan.nextInt();
            p[x-1]++;
        }
        for (int i=0;i<n;i++){
            if (score < p[i]){
                score = p[i];
                number = i;
            }
        }
        System.out.printf("%d %d",number+1,score);

    }
}
