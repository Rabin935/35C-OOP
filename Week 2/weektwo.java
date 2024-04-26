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
        System.out.println("The volume of cuboid is "+ (cuboid));

        double triangle = (0.5 *breadth * height);
        System.out.println("The area of triangle is "+ (triangle));

        System.out.println("The volume of cube is "+ (cube));

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

        /* 8. Take side of a square from user and print area and perimeter of it. Also,
         calculate Simple Interest, Area of triangle and Volume of Cube and Cuboid. 
         Take the attributes as user input. */

        System.out.println("Enter the side of the square:");
        double squareSide = scan.nextDouble();
        double squareArea = squareSide * squareSide;
        double squarePerimeter = 4 * squareSide;
        System.out.println("Area of the square: " + squareArea);
        System.out.println("Perimeter of the square: " + squarePerimeter);

        System.out.println("Enter principal: ");
        double Principal = scan.nextDouble();

        System.out.println("Enter rate (in percentage): ");
        double Rate = scan.nextDouble();

        System.out.println("Enter years: ");
        double Time = scan.nextDouble();

        double Simpleinterest = (Principal*Rate*Time)/ 100;
        System.out.println("Simple interest = "+ (Simpleinterest));

        System.out.println("Lenght: ");
        int Length = scan.nextInt();

        System.out.println("Height");
        int Height = scan.nextInt();

        System.out.println("width");
        int Width = scan.nextInt();

        int Cuboid = Length * Width * Height;
        int Cube = Length * Length + Length;

        System.out.println("breadth");
        double Breadth = scan.nextDouble();
        System.out.println("The volume of cuboid is "+ (Cuboid));

        double Triangle = (0.5 *Breadth * Height);
        System.out.println("The area of triangle is "+ (Triangle));

        System.out.println("The volume of cube is "+ (Cube));


        /* 9.  Ask user to give two double input for length and breadth of 
        a rectangle and print area type casted to int. */

        System.out.println("Enter your number: ");
        double length_rec = scan.nextDouble();

        System.out.println("Enter your number: ");
        double breadth_rec = scan.nextDouble();

        double Rectangle = length_rec * breadth_rec;
        System.out.println("The area tpe casted to integer is "+ (Rectangle));

        /* 10. Write a program to calculate the total marks of four subjects of a student 
         * and the total percentage secured. And use the following conditions
         * to generate the final result;
         * a. If equal to or more than 70 -> First Class
           b. If more than 59 -> Upper Second Class
           c. If more than 49 -> Second class
           d. If more than 39 -> Third class and if below than 40 the result is fail. 
           Hint: Use ternary operator
         */


        System.out.println("Enter your marks: ");
        int math = scan.nextInt();
        int science = scan.nextInt();
        int social = scan.nextInt();
        int english = scan.nextInt();

        int total_marks = math + science + social + english;
        double percentage = (total_marks / 4.0) * 100;

        String result = (percentage >=70) ? "First class"
                        : (percentage > 59) ? "Upper Second class"
                        : (percentage > 49) ? "Second class"
                        : (percentage > 39) ? "Third class"
                        : "Fail";

        System.out.println("Total marks is "+(total_marks));
        System.out.println("Total percentage "+ (percentage)+"%");
        System.out.println("Final results is "+ (result));

        

        scan.close();
    }

}
