import java.util.Scanner;

public class NANDGate {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
    
        System.out.println("Please enter an a value (y/n):");
        char a = keyboard.next().charAt(0);
        System.out.println("Please enter a b value (y/n):");
        char b = keyboard.next().charAt(0);

        boolean c = !((a == 'y' || a == 'Y') && (b == 'y' || b == 'Y'));

        System.out.println("The value of c is: " + c);
    }
}