import java.util.Scanner;
public class IT24102936Lab4Q1 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int number = keyboard.nextInt();

        if (number < 0){
            System.out.print("The Number is: Negative");
        } else if (number > 0) {
            System.out.print("The Number is: Positive");
        } else {
            System.out.print("The Number is Zero");
        }
    }
}