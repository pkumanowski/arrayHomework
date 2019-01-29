package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Wpisz liczbę pierwszą tablicy dwuwymiarowej");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Wpisz liczbę drugą tablicy dwuwymiarowej");
        int b = sc.nextInt();

        int twoD [] [] = new int[a] [b];

        int i, j, k = 0;
        for (i = 0; i < a; i++)
            for (j=0; j<i+1; j++){
                twoD[i][j] = k;
                k++;
            }

        for (i=0; i < a; i++){
            for(j=0; j<i+1; j++)
                System.out.print(j + ", ");
            System.out.println();
        }
    }
}
