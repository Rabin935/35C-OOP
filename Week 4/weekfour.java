import java.util.Scanner;
public class weekfour {
    public static void main(String[] args) {
        
        /* 1. Write a program that asks your name and prints “Hello your name” five times. Use a loop. */

        for(int index = 0; index < 5; index ++){
            System.out.println("Hello your name");
        }

        /* 2. Write a program that displays the following table (note that 1 mile is 1.609 kilometers):
         * Miles    Kilometers
         * 1     1.609
         * 2     3.218
         * …     ….
         * 9     14.481
         * 10    16.090
         */

        double num = 1.609;
        for(int kilo = 0; kilo <=10; kilo ++){
            System.out.println( kilo + " mile is "+ kilo * num);
        }

        /* 3. Write a program that generates the following table: 
            Number    Square
            10        100
            9         81
            ..        ….2    4
            1         1
             */

        System.out.println("Number     Square ");
        for(int sqr = 10; sqr >= 0; sqr --){
            System.out.println( sqr + "         "+ sqr* sqr);
        }

        /* 4. Write a program that reads the width and generates a corresponding square of *. For example, if width = 5, output is:
            *****
            *****
            *****
            *****
            *****
             */

        int width = 5;

        for(int i = 1; i <= width; i++){
            for(int j = 1; j <= width; j++){
                System.out.println("*");
            }
                System.out.println();
        }

        /* 5. Modify the above program by using a do..while loop so that it provides the user with the option to continue running the program and enter more inputs. For example:
            Sample Run:
            Enter a positive non-zero integer 4
            Sum of 1 to 4 is 10
            Do you want to continue? Enter ‘y’ for yes or any other character for no.
            y
            Enter a positive non-zero integer 3
            Sum of 1 to 3 is 6
            Do you want to continue? Enter ‘y’ for yes and any other character for no.
            n. */


        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("Enter a positive non-zero integer: ");
            int n = scan.nextInt();

            int sum = 0;
            for (int i = 1; i <= n; i++){
                sum += i;
           }

           System.out.println("Sum of 1 to " + n + " is " + sum);

           System.out.println("Dou you want to continue? Enter 'y' for yes and any other key for no:  ");
           
           char choice = scan.next().charAt(0);


           if (choice == 'y' || choice == 'Y') {
                continue;
           }
           else{
            System.out.println("Stopped!!!");
            break;
           }

        }while(true);
        
        /* 6. Write a program that reads the width and generates a corresponding triangle of *. For example, if width = 5, output is:
            *
            **
            ***
            ****
            *****
            Use a nested for loop to generate the above pattern. */
        
        int Width = 5;

        for(int i = 1; i <= Width; i++){
            for(int j = 1; j <= i; j++){
                System.out.println("*");
            }
            System.out.println();
        }

        /* 7. Write a program to calculate the HCF of Two given numbers. */

        // System.out.println("Enter a number: ");
        // int num1 = scan.nextInt();
        // int num2 = scan.nextInt();


        /* 8. Write a program that prompts the user to input an integer and then outputs the
         number with the digits reversed. For example, if the input is 12345, the output should be 54321. */

        System.out.print("Enter an integer: ");
        int num3 = scan.nextInt();
 
        int reversedNum = 0;
        while (num3 != 0) {
            int digit = num3 % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
 
        System.out.println("The reversed number is: " + reversedNum);

        

        /* 9. Write a program that reads ten integer numbers and outputs the number of inputs which 
        are greater than 50, less than 50 or equal to 50. The program should also display the average 
          of all numbers greater than 50 and the average of all numbers less than 50.
 */
        int[] counts = new int[3];
        int[] sums = new int[2];

        for (int i = 0; i < 10; i++) {
            int num1 = scan.nextInt();
            if (num1 > 50) {
                counts[0]++;
                sums[0] += num1;
            } else if (num1 < 50) {
                counts[1]++;
                sums[1] += num1;
            } else {
                counts[2]++;
            }
        }

        System.out.println("Number of inputs greater than 50: " + counts[0]);
        System.out.println("Number of inputs less than 50: " + counts[1]);
        System.out.println("Number of inputs equal to 50: " + counts[2]);
        System.out.println("Average of numbers greater than 50: " + (counts[0] > 0 ? (double) sums[0] / counts[0] : 0));
        System.out.println("Average of numbers less than 50: " + (counts[1] > 0 ? (double) sums[1] / counts[1] : 0));


    scan.close();

    }
}
