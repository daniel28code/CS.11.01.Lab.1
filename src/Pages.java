import java.util.Scanner;
public class Pages {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scan.nextInt();
        System.out.print(age + "-year olds should read at least " + (100 - age) + " pages before giving up on a book.");
    }
}
