public class cwtask {
    public static void main(String[] args) {
        // Task 1
        int num1 = 8;
        int num2 = 18;

        System.out.println("Is greater than "+ (num1 > num2));

        // Task 2
        int amount = 5;
        int time = 3;
        double rate = 4;

        double si = amount * time * (rate/100);
        System.out.println("Simple interest is "+ (si));

        // Task 3
        int l = 15;
        int b = 12;
        // int a = l * b;
        double p = 2 *(l + b);
        System.out.println("The area and perimeter of rectangle is "+ (p));

        // Task 4
        int  terNumber1=35, terNumber2=18;
         boolean exp=terNumber1== terNumber2;

         String output1= exp ? "true condition":"False Condition";
         System.out.println(output1);
    }
    
}
