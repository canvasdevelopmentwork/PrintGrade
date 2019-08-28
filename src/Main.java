import java.util.Scanner;

public class Main {
//    Write a program that uses a while loop to prompt the user
//    to enter any number of exam scores
//    and the resulting program will print out the grade, A, B, C, D or F.
//    If you're finished:
//    Modify your program to print + or - after the grade.
//    A+ 97 to 100  A 94 to 96 A- 90 to 93 B+ 87 to 89 B 84 to 86 B- 80 to 83
//    C+ 77 to 79 C 74 to 76 C- 70 to 73 D 60 to 69
//    Go back to School if you get below 60
//    You can convert a string to an integer as follows"
//    String input = "99";
//    int score = Integer.parseInt(input);
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String answer;
        System.out.println("Would you like to enter in your grade? (yes/no)");
        answer = key.next();
        while (answer.equalsIgnoreCase("yes")){
            System.out.println("Please enter in your exam score: ");
            String input = key.next();
            int score = Integer.parseInt(input);
            if (score <= 100 && score >= 90){
                System.out.println("Your grade is an A.");
            }
            else if (score < 90 && score >= 80){
                System.out.println("Your grade is a B.");
            }
            else if (score < 80 && score >= 70){
                System.out.println("Your grade is a C.");
            }
            else if (score < 70 && score >= 60){
                System.out.println("Your grade is a D.");
            }
            else if (score < 60 && score >= 0){
                System.out.println("Your grade is a F.");
            }
            else {
                System.out.println("Invalid input.");
            }
            System.out.println("Would you like to enter another score? (yes/no)");
            answer = key.next();
        }

        // For the extended version
//        while (answer.equalsIgnoreCase("yes")){
//            System.out.println("Please enter in your exam score: ");
//            String input = key.next();
//            int score = Integer.parseInt(input);
//            if (score <= 100 && score >= 97){
//                System.out.println("Your grade is an A+.");
//            }
//            else if (score < 97 && score >= 94){
//                System.out.println("Your grade is a A.");
//            }
//            else if (score < 94 && score >= 90){
//                System.out.println("Your grade is a A-.");
//            }
//            else if (score < 90 && score >= 87){
//                System.out.println("Your grade is a B+.");
//            }
//            else if (score < 87 && score >= 84) {
//                System.out.println("Your grade is a B.");
//            }
//            else if (score < 84 && score >= 80){
//                System.out.println("Your grade is a B-.");
//            }
//            else if (score < 80 && score >= 77){
//                System.out.println("Your grade is a C+.");
//            }
//            else if (score < 77 && score >= 74){
//                System.out.println("Your grade is a C.");
//            }
//            else if (score < 74 && score >= 70){
//                System.out.println("Your grade is a C-.");
//            }
//            else if (score < 70 && score >= 60){
//                System.out.println("Your grade is a D.");
//            }
//            else if (score < 60 && score >= 0) {
//                System.out.println("Go back to School.");
//            }
//            else {
//                System.out.println("Invalid input.");
//            }
//            System.out.println("Would you like to enter another score? (yes/no)");
//            answer = key.next();
//        }
        System.out.println("Have a good day!");
    }
}
