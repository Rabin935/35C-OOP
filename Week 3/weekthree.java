
import java.util.Scanner;
public class weekthree {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        /* 1. Write a JAVA program to find the maximum between three numbers. */

        System.out.println("Enter you number: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        int maximum;
        if (num1 >= num2 && num1 >= num3){
            maximum = num1;
        }
        else if (num2 >= num1 && num2 >= num3){
            maximum = num2;
        }
        else{
            maximum = num3;
        }

        System.out.println("The maximum between three number is "+ (maximum)+".");

        /* 2. Write a JAVA program to check whether a number is negative, positive, or zero. */

        System.out.println("Enter your number: ");
        int number = scan.nextInt();

        if (number > 0){
            System.out.println("positive number.");
        }
        else if (number < 0){
            System.out.println("negative number.");
        }
        else{
            System.out.println("zero.");
        }

        /* 3. Write a JAVA program to check whether a number is divisible by 5 and 11 or not. */

        System.out.println("Enter your number: ");
        int div = scan.nextInt();

        if (div % 5 == 0 && div % 11 == 0){
            System.out.println("A numnber is divisible by 5 and 11.");
        }
        else{
            System.out.println("A number is not divisible by 5 and 11.");
        }

        /* 4. Write a JAVA program to check whether a number is even or odd. */

        System.out.println("Enter your number: ");
        int numb = scan.nextInt();

        if (numb % 2 == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }

        /* 5. Write a JAVA program to check whether a year is a leap year or not. 
              Hint: if year%4==0; if year%100!==0 ; year%400==0;  */

        System.out.println("Enter year: ");
        int year = scan.nextInt();

        if (year % 4 == 0 || year % 100 == 0 || year % 400 == 0){
            System.out.println("Is a leap year.");
        }
        else{
            System.out.println("Is not a leap year.");
        }

        /* 6. Write a JAVA program to input any alphabet and check whether it is vowel or consonant. */

        System.out.println("Enter your alphabet letter: ");
        char ch = scan.next().toLowerCase().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("Is vowel letter");
        }
        else{
            System.out.println("Is consonant letter");
        }


        scan.close();
    }
}
