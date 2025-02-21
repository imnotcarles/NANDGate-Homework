import java.util.Scanner;

public class NANDGate {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
    
        System.out.println("Please enter input a:");
        boolean a = keyboard.nextBoolean();
        System.out.println("Please enter input b:");
        boolean b = keyboard.nextBoolean();

        boolean c = !(a && b);

        System.out.println("The value of c is: " + c);
    }
}