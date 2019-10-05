package main;
/*
6: WAP to change case of given inputString to uppercase by using String toUpperCase().
 */

import java.util.Scanner;

public class ToUpperCaseAns_6 {
    public static void main(String[] args) {
        System.out.println("enter any string: ");
        Scanner scanner = new Scanner(System.in);
        String s3 = scanner.nextLine();
        s3 = s3.toUpperCase();
        System.out.println("entered string in uppercase: "+s3);
    }
}
