import java.util.Arrays;
import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String str = input.nextLine();

        char charArray[] = str.toCharArray();

        Arrays.sort(charArray);

        System.out.println("Sorted String: " + new String(charArray));

        input.close();
    }
}