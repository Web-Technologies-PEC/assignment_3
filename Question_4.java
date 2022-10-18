import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int n = input.nextInt();

        System.out.println("HailStone Sequence: ");

        while (n != 1) {

            System.out.print(n + " ");
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
        }

        System.out.println(1);
        input.close();
    }
}
