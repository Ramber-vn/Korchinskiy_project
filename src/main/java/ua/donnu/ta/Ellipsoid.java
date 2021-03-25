package ua.donnu.ta;

import java.util.Scanner;

public class Ellipsoid {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Input number 1:");
        float n_1=in.nextFloat();
        System.out.println("Input number 2:");
        float n_2=in.nextFloat();

        double e = n_1 * n_2 * Math.PI;

        System.out.println(e);

        double k = 4 * (Math.PI * n_1 * n_2 + (n_1 - n_2)) / n_1 + n_2;

        System.out.println(k);
    }
}
