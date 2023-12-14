package com.perscholas.java_string_methods;

import java.util.Scanner;

public class ReadingStringfromConsole2 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character: " );
        String s = input.nextLine();
        char ch = s.charAt(0);
        System.out.println("The character entered is :" +ch);

    }
}
