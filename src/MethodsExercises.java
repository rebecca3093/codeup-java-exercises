import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {
// 1.
        System.out.println("Start");

        //1.
        printMathStuff();
        addStuff(10, 5);
        subtractStuff(10, 5);
        multiplyStuff(10, 5);
        //multiplyStuffBonus(10,5,0);
        divideStuff(10, 5);
        modStuff(23, 5);

        //2/
        getInteger(1, 10);

        //3.
        //getFactorial(1, 10);

        //4.


        System.out.println("End");
    }

    public static void printMathStuff() {
        System.out.println("Lets do some Math stuff");
    }

    public static int addStuff(int x, int y) {
        //System.out.println("Lets add some stuff:" + (x + y));
        int sum = (x + y);
        System.out.println(x + " + " + y + " = " + sum);
        return sum;
    }

    public static void subtractStuff(int x, int y) {
        int sum = (x - y);
        System.out.println(x + " - " + y + " = " + sum);
    }

    public static void multiplyStuff(int x, int y) {
        // System.out.println("Bonus stuff after");
        //int sum2 = x;
        //int i;

        // Bonus A.
        //How to call a method and return the value using a previous method
    /*    for (i = 1; i < y; i++) {
            sum2 = addStuff(sum2, x);
            System.out.println("*** sum = " + sum2);
        }

        //The easy way (according to Bryant)
        for (i = 1; i < y; i++) {
            sum2 = (sum2 + x);
            System.out.println("sum = " + sum2);
        }*/

        //OG CODE!
        int sum = (x * y);
        System.out.println(x + " * " + y + " = " + sum);
    }

// Bryant did this. Im not that skilled. This is an example.
   /* public static int multiplyStuffBonus(int x, int y, int sum3) {

        // Bonus B.

        if(sum3 == (x*y))
        {
            System.out.println("sum = " + sum3);
            return sum3;
        }
        else
        {
//            int oldSum = sum3;
            sum3 = (sum3 + x);
            System.out.println( oldSum + " + " + x + " = " + sum3);
            sum3 = multiplyStuffBonus(x, y, sum3);
        }
        return sum3;
    }*/


    // Ry's Example

  /*  if (x == 0 || y == 0){
        return 0;
    }
    return ( x + multiplyByAdd (x, y -1));
    */

    public static void divideStuff(int x, int y) {

        if (y == 0) {
            System.out.println("Cant do Zeros bud!");
        } else {
            int sum = (x / y);
            System.out.println(x + " / " + y + " = " + sum);
        }
    }

    public static void modStuff(int x, int y) {
        if (y == 0) {
            System.out.println("Cant do Zeros bud!");
        } else {
            int sum = (x % y);
            System.out.println(x + " % " + y + " = " + sum);
        }
    }

    // 2.

    public static int getInteger(int min, int max) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a number between 1 and 10", min, max);
        int userInput = scanner.nextInt();
        if (userInput < max && userInput > min) {
            System.out.printf("Your number is between 1 and 10 ", min, max);
        } else if (userInput > max || userInput < min) {
            getInteger(min, max);
        }
        return userInput;
    }
}

    // 3.
  /*  public static void getFactorial(int min, int max) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a number between 1 and 10", min, max);
        int userInput = scanner.nextInt();
    }*/

    //rys walkthru
/*
    public static void getFactorial(int min, int max) {

        int userInt = getInteger(min, max);

        long result = 1;

        for (int i = 1; i <= userInt; i++) {
            result += i;
            fact *= i;
        }
        return result;


    }


*/



