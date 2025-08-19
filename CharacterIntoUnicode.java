import java.util.Scanner;

public class CharacterIntoUnicode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");

        char ch = input.next().charAt(0);

        int unicode = ch;

        System.out.println("The unicode for a character "+ch + " is " +unicode);
        

    }
    
}
