import java.util.Scanner;

public class NumberOfDurians {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double durian = 15.75;
        System.out.println("Each durian cost $"+durian);

        System.out.println("How much money do you have? $");
        Double money = input.nextDouble();

        int NumDurian = (int)(money / durian);

        System.out.println("The number of durian(s) you can buy is "+NumDurian);

    }
}
