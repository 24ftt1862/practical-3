import java.util.Scanner;

public class Savings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("What is your target amount? $"); 
        Double num = input.nextDouble(); 

        System.out.println("What is your target amount? $"+num); 

        System.out.println("How many month(s) to reach your goal? "); 
        int month = input.nextInt();
        System.out.println("How many month(s) to reach your goal? "+month); 

         Double savingsMonth = num / month;
         Double SavingsDay = savingsMonth / 30;

        System.out.printf("The amount you need to save per day is $ %.2f%n",SavingsDay);


    }
}
