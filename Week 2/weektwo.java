import java.util.Scanner;
public class weektwo {
    public static void main(String[] args) {
       

        // /* 1. Write a program to check whether a person can cast a vote or not. The condition is you must be over 18 years old to vote. */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        if (age >= 18){
            System.out.println("You can cast vote. ");
        }
        else{
            System.out.println("You cannot cast vote. ");
        }

        /* 2. Write a program to calculate SI. 
         * Formula Simple Interest = (PrincipleAmount*Time*Rate/100);
         */


        System.out.println("Enter principal: ");
        double principal = scan.nextDouble();

        System.out.println("Enter rate (in percentage): ");
        double rate = scan.nextDouble();

        System.out.println("Enter years: ");
        double time = scan.nextDouble();

        double simpleinterest = (principal*rate*time)/ 100;

        System.out.println("Simple interest = "+ (simpleinterest));

        /* 3. Write a program to calculate, area of the triangle, and the Volume of the Cube and Cuboid.
               Formula: Volume of Cuboid = length*width*height; and Volume of Cube: side*side*side;
           */

        System.out.println("Lenght: ");
        int length = scan.nextInt();

        System.out.println("Height");
        int height = scan.nextInt();

        System.out.println("width");
        int width = scan.nextInt();

        int cuboid = length * width * height;
        int cube = length * length + length;

        System.out.println("breadth");
        double breadth = scan.nextDouble();
        System.out.println("The area of cuboid is "+ (cuboid));

        double triangle = (0.5 *breadth * height);
        System.out.println("The area of triangle is "+ (triangle));

        System.out.println("The area of cube is "+ (cube));

        /* 4. Write the ternary operator for question no. 1 */

        int  terNumber1=35, terNumber2=18;
        boolean exp=terNumber1== terNumber2;

        String output1= exp ? "true condition":"False Condition";
        System.out.println(output1);

        System.out.println("Enter your age: ");
        int Age = scan.nextInt();
         
        String canVote = (Age >= 18) ? "You can cast vote." : "You cannot cast vote.";
        System.out.println(canVote);

        /* 5. Write a program to take two integer inputs from the user and print the sum and product of them. */

        System.out.println("Enter a number1: ");
        int num1 = scan.nextInt();

        System.out.println("Enter a number2: ");
        int num2 = scan.nextInt();

        int sum = num1 + num2;
        int product = num1 + num2;

        System.out.println("The sum of "+ (num1)+ " and "+ (num2)+ " is "+(sum));
        System.out.println("The product of "+ (num1)+ " and "+ (num2)+ " is "+(product));

        /* 6. Take two integer inputs from the user. First, calculate the sum of two, 
              then the product of two. Finally, calculate the division of the thus obtained 
              sum and product and print the result. */

        System.out.println("Enter a number1: ");
        int numone = scan.nextInt();
      
        System.out.println("Enter a number2: ");
        int numtwo = scan.nextInt();
      
        int sum1 = num1 + num2;
        int product1 = num1 + num2;
      
        System.out.println("The sum of "+ (numone)+ " and "+ (numtwo)+ " is "+(sum1));
        System.out.println("The product of "+ (numone)+ " and "+ (numtwo)+ " is "+(product1));

        double division = sum1 / product1;
        System.out.println("The division of "+ (sum1)+ " and "+ (product1)+ " is "+(division));

        /* 7. Take the name, roll number, and field of interest from the user and print in 
        the format below: Hey, my name is XYZ and my roll number is XYZ. My field of interest are xyz. */

        System.out.println("Enter your name: ");
        String name = scan.next();

        System.out.println("Enter your roll number: ");
        int roll_number = scan.nextInt();

        System.out.println("Enter your interested field: ");
        String field = scan.next();

        System.out.printf("Hey, my name is " + (name) + " and "+ " my roll number is "+ (roll_number) + ". \nMy field of interest are "+ (field)+".");





        scan.close();
    }

}
