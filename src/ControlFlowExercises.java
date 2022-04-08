import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

        //1. Loops Basics

        // a.

      /*  int i = 5;

        while (i <= 15) {
            System.out.println(i + "");
            i++;
        }*/


        // b. Do While

         /*int x = 0;
        do {
            System.out.println(i);
            i = i + 2;
           i+=2;
        } while (x <= 100);
       */


     //c.

        /* int i = 100;
        do {
            System.out.println(i);
            i -= 5;
        } while  (i >= -10);*/

    // c.2

        /*int i = 2;

        do {
            System.out.println(i);
            i = (int) Math.pow(i, 2);
        } while (i < 1000000);*/


       /* for (int i = 100; i >= -10; i++){
            System.out.println(i);
        }
        */


     /*   for (long i = 2; i < 1000000; i *=i){
            System.out.println(i);
        }*/


        // 2.  Fizzbuzz

        //TODO: Write a program that prints the numbers from 1 to 100.
        //TODO: For multiples of three: print “Fizz” instead of the number.
        //TODO:For the multiples of five: print “Buzz”.
        //TODO: For numbers which are multiples of both three and five: print “FizzBuzz”.


       /* for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("Fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            }else if  (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }

    }*/

        System.out.println("Enter a integer: ");



    }
}