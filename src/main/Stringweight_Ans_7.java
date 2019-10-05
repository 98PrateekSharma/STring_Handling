package main;
/*
7: WAP to print the totalWeight of given inputString.

  totalWeight can be calculate by adding *ASCII* value of all the characters.
          for example:
          inputString = "Abc";
          totalWeight = 65 + 98 + 99;

          where ASCII values:
              A --> 65
              b --> 98
              c --> 99
 */

import java.util.Scanner;

public class Stringweight_Ans_7{
    private String string7;
    private int weight;

    public void setWeight(int weight) { this.weight = weight; }

    public int getWeight() { return weight; }

    public void setString7(String string7) { this.string7 = string7;}

    public String getString7() { return string7;}

    public void Stringweight_Ans_7(String string7){
        this.string7=string7;
    }
    public int weight(){
        String str7 = getString7();
        setWeight(0);
        for (int i = 0; i < getString7().length() ; i++) {
            weight = weight + (int)(str7.charAt(i));
        }
        return weight;
    }

}

class Main7{
    public static void main(String[] args) {
        System.out.println("enter any string: ");
        Scanner scanner = new Scanner(System.in);
        Stringweight_Ans_7 obj7 = new Stringweight_Ans_7();
        obj7.Stringweight_Ans_7(scanner.nextLine().trim());
        System.out.println(obj7.weight());
    }
}
