package ua.donnu.ta;

public class Ellipsoid {
    public static void main(String[] args) {
        double a = 5;
        double b = 2;

        double s = a * b * Math.PI;

        System.out.println(s);

        double p = 4 * (Math.PI * a * b + (a - b)) / a + b;

        System.out.println(p);
    }
}
