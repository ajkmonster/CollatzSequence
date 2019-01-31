import java.util.Scanner;

public class CollatzSequence {
    public static void main(String[] args) {
        int i;
        String z;
        do {
            Scanner key = new Scanner(System.in);
            System.out.print("Please enter a number: ");
            i = key.nextInt();
            System.out.print("\n");
            System.out.print(i + " ");
            do {
                if (i % 2 == 0) {
                    i = i / 2;
                    System.out.print(i + " ");
                } else if (i % 2 != 0) {
                    i = (i * 3) + 1;
                    System.out.print(i + " ");
                }
            } while (i != 1);
            System.out.println("\n"+"Would you like to put in another number? (Y/N): ");
            Scanner key2 = new Scanner(System.in);
            z = key2.next();
        } while (!z.equalsIgnoreCase("N")); //input to for a string to equal a variable
        System.out.println("Have a great day!");
    }
}
