import java.util.Scanner;
public class Dateable {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scan.nextInt();
        System.out.print(age + "-year olds should date someone who is at least " + (7 + age/2) + " years old.");
    }
}
