package com.perscholas.GenericMethodandClass;

public class myRunner1 {

    public static void main(String[] args) {
// initialize generic class with String and Integer data
        GmultipleDatatype<String, Integer> mobj = new GmultipleDatatype("Per Scholas", 11025);
        System.out.println(mobj.getValueOne());
        System.out.println(mobj.getValueTwo());
// initialize generic class with String and String data
        GmultipleDatatype<String, String> mobj2 = new GmultipleDatatype("Per Scholas", "Non profit");
        System.out.println(mobj2.getValueOne());
        System.out.println(mobj2.getValueTwo());
    }
}
