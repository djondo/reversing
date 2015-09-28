package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word or a sentence: ");
        String str = "";
        str = scanner.nextLine();
        String well = printBackwards(str);
        System.out.println(well);
    }






    public static String printBackwards(String str) {

        System.out.println("This function will reverse the string " + str);

        int stringLength = str.length();

        for (int i = stringLength - 1; i >= 0; i--) {

            System.out.println(str.charAt(i));
        }
        return str;
    }
}











