package main;

import java.util.Scanner;

public class Ans_11 {
    public static void main(String[] args) {
        System.out.println("enter any string: ");
        Scanner scanner = new Scanner(System.in);
        String str11 = scanner.next();
        System.out.println("enter any character: ");
        String x = scanner.next();
        for (int i = 0; i < str11.length()-1 ; i++) {
            if(str11.charAt(i) == x.charAt(0)){
                System.out.println(str11.indexOf(x,i));
            }
        }
    }
}
