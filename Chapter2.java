import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Chapter2 {
    public static void main(String[] args){

        /*1. Reads the users first name and last name(separately)
         *    Print a string composed of the first letter of user's first name, followed
         *    by the first five characters of the user's last name,
         *    followed by a random number in the range 10 to 99.
         *    Assume that the last name is at least five letters long.
         *    (Similar algorithms are sometimes used to generate usernames for new computer accounts)
         */

        Scanner scan = new Scanner(System.in);
        String fName, lName;
        System.out.print("\n1. Enter your first name: ");
        fName = scan.next();
        System.out.print("   Enter your last name: ");
        lName = scan.next();

        char firLetter = fName.charAt(0);
        if(lName.length() > 5){
            lName = lName.substring(0, 6);
        }
        int range = (99 - 10) + 1;
        int rand = (int) ((Math.random() * range) + 10);

        String username = firLetter + lName + rand;
        System.out.println("   Your computer generated username is: " + username);
        System.out.println("-------------------------------------------------------------------\n");

        /*2. Write an application that prints the sum of cubes. Read two integer values and print
        *    the sum of each value raised to the third power.*/

        System.out.print("2. Enter the first value: ");
        int value1 = scan.nextInt();
        System.out.print("   Enter the second value: ");
        int value2 = scan.nextInt();

        int sum = (int) (Math.pow(value1, 3) + Math.pow(value2, 3));
        System.out.println("   The sum of two integers raised to the third power: " + sum);
        System.out.println("-------------------------------------------------------------------\n");

        /*3. Write an application that creates and prints a random phone number of the
        *    form XXX-XXX-XXXX. Include the dashes in the output.
        *    Do not let the first three digits contain an 8 or 9
        *    Make sure that the second set of three digits is not greater than 742.
        *    Hint: Think through the easiest way to construct the phone number.
        *    Each digit does not have to be determined separately.*/

        Random generate = new Random();

        //first three digits of the phone number
        int num1 = generate.nextInt(7) + 1;
        int num2 = generate.nextInt(7) + 1;
        int num3 = generate.nextInt(7) + 1;

        //next three digits of the phone number
        int rang = (742 - 100) + 100;
        int num4 = generate.nextInt(rang) + 100;

        //last four digits of the phone number
        int num5 = generate.nextInt(9999) + 1000;
        System.out.print("3. Your randomly generated phone number is: ");
        System.out.println(num1+""+num2+""+num3+"-"+num4+"-"+num5);
        System.out.println("-------------------------------------------------------------------\n");

        /*4. Write an application that reads the (x, y) coordinates for two points.
        *    Compute the distance between the two points using the following formula.
        *    (the distance formula)*/
        System.out.print("4. Enter the xy-coordinate for the first point(ex: 2 3): ");
        int point1X = scan.nextInt();
        int point1Y = scan.nextInt();
        System.out.print("   Enter the xy-coordinate for the second point(ex: 2 3): ");
        int point2X = scan.nextInt();
        int point2Y = scan.nextInt();

        int x = (int) Math.pow((point2X - point1X), 2);
        int y = (int) Math.pow((point2Y - point1Y), 2);
        int distance = (int) Math.sqrt(x) + (int) Math.sqrt(y);
        System.out.println("   The distance between the two points is: " + distance);
        System.out.println("-------------------------------------------------------------------\n");

        /*5. Write an application that reads the radius of a sphere and prints its volume and
        *    surface area. Use the following formulas, in which r represents the sphere's radius.
        *    Print the output to four decimal places.*/
        System.out.print("5. Enter the radius: ");
        int radius = scan.nextInt();

        DecimalFormat f = new DecimalFormat("##.0000");
        float volumeOfSphere = (float) (4 / 3 * Math.PI * Math.pow(radius, 3));
        float surfaceArea = (float) (4 * Math.PI * Math.pow(radius, 2));
        System.out.println("   Volume of a sphere: " + f.format(volumeOfSphere));
        System.out.println("   Surface Area of a sphere: " + f.format(surfaceArea));
        System.out.println("-------------------------------------------------------------------\n");

        /*6. Write an application that reads the length of the sides of a triangle from the user.
        *    Compute the area of the triangle using Heron's formula(below), in which s represents
        *    half of the perimeter of the triangle, and a, b, and c represent the lengths of the
        *    three sides. Print the area to three decimal places*/
        System.out.print("6. Enter the length of the sides of the triangle(ex: 2 3 6): ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int s = (a + b + c) / 2;
        int area = (int) Math.sqrt((s * (s - a) * (s - b) * (s - c)));

        DecimalFormat f1 = new DecimalFormat("##.000");
        System.out.println("   The area of the triangle is: " + f1.format(area));
        System.out.println("-------------------------------------------------------------------\n");


    }
}
