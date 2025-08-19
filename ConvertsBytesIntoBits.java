import java.util.Scanner;

public class ConvertsBytesIntoBits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of byte(s) to be converted: ");
        int bytes = input.nextInt();  

        int bits = bytes * 8;

        System.out.println(bytes + " byte(s) = " + bits + " bits.");
    }
}

