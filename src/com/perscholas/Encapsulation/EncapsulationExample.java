package com.perscholas.Encapsulation;

public class EncapsulationExample {

    public static void main(String[]args){

//        HumanBeing h1 = new HumanBeing();
//
//        h1.setHeight(1.65f);
//        h1.setWeight(68);
//        h1.setBmi(calculateBmi(h1));
//
//        // using getters of HumanBeing
//        System.out.println("Person has "+h1.getWeight()+" kgs and is "+h1.getHeight()+" meters in height, which results in BMI of "+h1.getBmi());
//    }
//    public static float calculateBmi(HumanBeing h1){
//        return h1.getWeight()/(h1.getHeight()*h1.getHeight());
//    }
        fizzbuzz(20);


    }

    public static void fizzbuzz(int n) {

        for (int i = 1; i<=n; i++){

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");

            } else if (i % 5 == 0) {

                System.out.println("buzz");

            } else if (i % 3 == 0) {

                System.out.print("fizz");
            } else {

                System.out.println(i);
            }
        }

    }

    }


