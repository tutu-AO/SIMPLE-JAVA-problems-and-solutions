import java.util.Scanner;

public class Chapter1 {
    public static void main(String[] args) {
        /*1. Printing a quote from Abraham Lincoln*/
        System.out.print("\n1. A quote by Abraham Lincoln: ");
        System.out.println("\"Whatever you are, be a good one.\"");
        System.out.println("-------------------------------------------------------------------\n");

        /*2. Read three integers and print their average*/
        int num1 = 56, num2 = 9, num3 = 34;
        int avgNum = (num1 + num2 + num3) / 3;
        System.out.println("2. The average of the numbers: " + avgNum);
        System.out.println("-------------------------------------------------------------------\n");

        /*3. Read two floating point numbers and prints their sum, difference, and product*/
        float numFloat1 = (float) 56.2, numFloat2 = (float) 71.1;
        float sumNum = numFloat1 + numFloat2;
        float minNum = numFloat2 - numFloat1;
        float proNum = numFloat1 * numFloat2;

        System.out.println("3.");
        System.out.println("Sum of the two floating point numbers: " + sumNum);
        System.out.println("Difference between the two floating point numbers: " + minNum);
        System.out.println("Product of the two floating point numbers: " + proNum);
        System.out.println("-------------------------------------------------------------------\n");

        /*4. Convert from Fahrenheit to Celsius. Read the Fahrenheit temperature from the user*/
        short fahrenheit;
        short celsius;

        Scanner scan = new Scanner(System.in);
        System.out.print("4. Enter temperature in fahrenheit: ");
        fahrenheit = scan.nextShort();
        celsius = (short) ((fahrenheit - 32) * 5/9);
        System.out.println(fahrenheit +"F is " + celsius + "C.");
        System.out.println("-------------------------------------------------------------------\n");

    }
}
