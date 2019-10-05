package main;

import java.util.Scanner;

public class Print_Substring {
    private String string2;
    private int index;

    public int getIndex() { return index;}

    public void setIndex(int index) { this.index = index; }

    public void setString(String string) { this.string2 = string;}

    public String getString() { return string2;}

    public void Print_String(String string,int index){
        this.string2=string;
        this.index=index;
    }

    public void Display(){
        System.out.println(getString().substring(getIndex()));
    }
}
class Main{
    public static void main(String[] args) {
        System.out.println("enter any string\n"+"enter the index to print substring");
        Scanner scanner = new Scanner(System.in);
        String string=scanner.nextLine().trim();
        int ind=scanner.nextInt();
        Print_Substring obj1 = new Print_Substring();
        obj1.Print_String(string,ind);
        obj1.Display();
    }
}
