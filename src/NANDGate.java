import java.util.Scanner;

public class NANDGate {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        boolean c = false;
        char a = 'y';
        char b = 'y';

        System.out.println("Please enter an a value (y/n):");
        a = keyboard.next().charAt(0);
        System.out.println("Please enter a b value (y/n):");
        b = keyboard.next().charAt(0);

        c = a && b == 'Y' || a && b == 'y';

        System.out.println("The value of c is:" + c);
    }
}