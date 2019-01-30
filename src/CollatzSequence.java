import java.util.Scanner;

public class CollatzSequence {
    public static void main(String[] args){
        int i;
        Scanner key = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        i = key.nextInt();
        System.out.print("\n");
        System.out.print(i +" ");
        do {
            if (i % 2 == 0) {
                i = i / 2;
                System.out.print(i+ " ");
            } else if (i % 2 != 0) {
                i = (i * 3) + 1;
                System.out.print(i+ " ");
            }
        } while (i !=1);
        System.out.println("Would you like to put in another number? (Y/N): ");
        Scanner key2 = new Scanner(System.in);
        boolean z = key2.hasNext();
        if (z == true) {
            Scanner key1 = new Scanner(System.in);
            System.out.print("Please enter a number: ");
            int j = key1.nextInt();
            System.out.print("\n");
            System.out.print(i +" ");
            do {
                if (j % 2 == 0) {
                    j = j / 2;
                    System.out.print(j+ " ");
                } else if (j % 2 != 0) {
                    j = (j * 3) + 1;
                    System.out.print(j+ " ");
                }
            } while (j !=1);
        } else if (z == false) {
            System.out.println("Have a great day!");
        }
    }
}
