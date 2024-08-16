import java.util.Scanner;
public class IT24102936Lab4Q3 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int number = keyboard.nextInt();

        String x = (number < 0) ?"The Number is: Negative":(number > 0)? "The Number is: Positive":"The Number is Zero";
        System.out.print(x);
}