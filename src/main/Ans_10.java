package main;

import java.util.Scanner;

public class Ans_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any string: ");
        String str10 = scanner.next();
        System.out.println("enter any character to find it's index: ");
        char c = scanner.next().charAt(0);
        System.out.println(str10.indexOf(c));
    }

}
