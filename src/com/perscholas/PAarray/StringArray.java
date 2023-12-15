package com.perscholas.PAarray.Aarray;

import java.util.Arrays;

public class StringArray {
    public static void main(String[] args) {
        String[] colors = { "red", "green ", "yellow", "blue" };
        int colorSize = colors.length;
            System.out.println("Array length is :"+ colorSize);

        String[] copycolors = colors.clone();

        System.out.println("New color string is : " + Arrays.toString(colors));



    }

}
