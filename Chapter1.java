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

        Scanner scan = new Scanner(System.in);  // one scanner object can be used for multiple user inputs

        System.out.print("4. Enter temperature in fahrenheit: ");
        fahrenheit = scan.nextShort();
        celsius = (short) ((fahrenheit - 32) * 5/9);
        System.out.println(fahrenheit +"F is " + celsius + "C.");
        System.out.println("-------------------------------------------------------------------\n");

        /*5. Convert from Miles to Kilometers. Read the Miles value from the user as a floating point value*/
        float miles;
        float kilometers;

        System.out.print("5. Enter distance in miles: ");
        miles = scan.nextFloat();
        kilometers = (float) (miles * 1.60935); // (One mile equals 1.60935 kilometers)
        System.out.println(miles +"mi is equals to " + kilometers + "km.");
        System.out.println("-------------------------------------------------------------------\n");

        /*6. Read values representing a time durations in hours, minutes, and seconds, and then prints the
        * equivalent total number of seconds (ex: 1 hours, 28 minutes, and 42 seconds is equivalent to 5322 sec)*/
        int hours, minutes, seconds;

        System.out.print("6. Enter your hour value: ");
        hours = scan.nextInt();
        System.out.print("Enter your minutes value: ");
        minutes = scan.nextInt();
        System.out.print("Enter your seconds value: ");
        seconds = scan.nextInt();

        int equivSeconds = (hours * 3600) + (minutes * 60) + seconds;
        System.out.println(hours + " hour(s), " + minutes + " minute(s), and " + seconds + " second(s) is equivalent to " + equivSeconds + " seconds");
        System.out.println("------------------------------------------------------------------------------------------------------------\n");

        /*7. Read a value representing a number of seconds, and then print the equivalent amount of time as a combination of
        hours, minutes, and seconds. (ex: 9999 seconds is equivalent to 2 hours, 46 minutes, and 39 seconds.)*/
        int seconds1;

        System.out.print("7. Enter your value in seconds: ");
        seconds1 = scan.nextInt();

        int hrs = seconds1 / 3600;
        int mins = (seconds1 % 3600) / 60;
        int secs = (seconds1 % 3600) % 60;
        System.out.println(seconds1 + " second(s) is equivalent to " + hrs + " hour(s), " + mins + " minute(s), and " + secs + " second(s).");
        System.out.println("------------------------------------------------------------------------------------------------------------\n");

        /*8. Read integer values that represent the number of quarters, dimes, nickles, and pennies and print the total in dollars and cents*/
        /*int numOfQuaters, numOfDimes, numOfNickles, numOfPennies;

        System.out.print("8. Enter number of quarters: ");
        numOfQuaters = scan.nextInt();
        System.out.print("Enter number of dimes: ");
        numOfDimes = scan.nextInt();
        System.out.print("Enter number of nickles: ");
        numOfNickles = scan.nextInt();
        System.out.print("Enter number of pennies: ");
        numOfPennies = scan.nextInt();

        float quaters = (float) (numOfQuaters * 0.25);
        float dimes = (float) (numOfDimes * 0.10);
        float nickles = (float) (numOfNickles * 0.05);
        float pennies = (float) (numOfPennies * 0.01);

        float dollars = (quaters % 4) + (dimes % 10) + (nickles % 20) + (pennies % 100);
        System.out.print(numOfQuaters + " number of quarters, " + numOfDimes + " dimes, " + numOfNickles + " nickles, " + numOfPennies + " nickles, ");
        System.out.println("is equals to $" + dollars + " cents");
        System.out.println("------------------------------------------------------------------------------------------------------------\n");*/

        /*9. Read a double value representing a monetary amount. Then determine the least number of each bill and coin needed to
        * represent that amount, starting with the highest(assume that a ten-dollar bill is the maximum size needed). ex: if the
        * value entered is 47.63 (forty-seven dollars and sixty-three cents), then the program should print the equivalent
        * amount as:
        *       4 ten dollar bills
        *       1 five dollar bills
        *       2 one dollar bills
        *       2 quarters
        *       1 dimes
        *       0 nickles
        *       3 pennies*/

       /* double value;

        System.out.print("Enter value in decimal (ex: 47.63): ");
        value = scan.nextDouble();

        int numOfTenDollarBills = (int)(value / 10);
        //System.out.println(numOfTenDollarBills);
        int numOf5DollarBills = (int)(value % 10) / 5;
        //System.out.println(numOf5DollarBills);
        int numOfOneDollarBills = (int)(value % 10) % 5;
        //System.out.println(numOfOneDollarBills);

        int numQuarters = (int) ((float)(value % 10) % 5 / 0.25) / 4;
        System.out.println(numQuarters);
        //int numDimes = (int) ((int)(value % 10) % 5 );
        int numDimes = (int) ((float) ((value % 10) % 5 % 0.25) % 4 / 0.10);
        System.out.println(numDimes);
        //int numNickles;
        int numNickles = (int) ((float) ((float) ((value % 10) % 5 % 0.25) % 4 % 0.10) / 0.05);
        System.out.println(numNickles);
        //int numPennies;
        int numPennies = (int) ((float) ((float) ((float) ((value % 10) % 5 % 0.25) % 4 % 0.10) % 0.05) / 0.01);
        System.out.println(numPennies);*/

        /*10. Read an integer representing the length of a square's side and then prints the square's perimeter and area*/
        int lenSquare;
        System.out.print("10. Enter the length of a square: ");
        lenSquare = scan.nextInt();

        int perimeterSq = lenSquare * 4;
        int areaSq = lenSquare * lenSquare;
        System.out.println("Perimeter of a square with length " + lenSquare + " is: " + perimeterSq);
        System.out.println("Area of a square with length " + lenSquare + " is: " + areaSq);
        System.out.println("------------------------------------------------------------------------------------------------------------\n");

        /*11. Read the numerator and denominator of a fraction as integers and then print the decimal equivalent of the fraction*/
        int numerator;
        int denominator;
        System.out.print("11. Enter numerator: ");
        numerator = scan.nextInt();
        System.out.print("Enter denominator: ");
        denominator = scan.nextInt();

        float equivDecimal = (float) numerator / (float) denominator;
        System.out.println("The decimal equivalent of the fraction: " + equivDecimal);
        System.out.println("------------------------------------------------------------------------------------------------------------\n");



    }
}
