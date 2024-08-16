import java.util.Scanner;
public class IT24102936Lab4Q2 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the exam marks: ");
        int marks = keyboard.nextInt();
        if (marks > 100 || marks < 0){
            System.out.print("Invalid input for exam marks. Terminating program");
        }else {
            System.out.print("Please enter the Lab Submission marks: ");
            int labmarks = keyboard.nextInt();
            if (labmarks > 100 || labmarks < 0){
                System.out.print("Invalid input for Lab submission marks. Terminating program");

            }else {
                System.out.print("Please enter the percentage given for the exam: ");
                int percentagemarks = keyboard.nextInt();
                System.out.print("Please enter the percentage given for lab submission: ");
                int percentagelabmarks = keyboard.nextInt();

                double pexammarks= marks*percentagemarks/100;
                double plabmarks= labmarks*percentagelabmarks/100;
                double totmarks = pexammarks + plabmarks;

                if (totmarks <= 100){
                    System.out.print("Final Exam Mark is: "+totmarks);
                }else {
                    System.out.print("The percentage must add up to 100. Terminating program.");
                }
            }

        }



    }
}