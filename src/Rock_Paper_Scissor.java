import java.util.Random;
import java.util.Scanner;


public class Rock_Paper_Scissor {


    public static void main(String[] args) {
        int input;
        int b = 1;
        Scanner sage = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println(" Rock,Paper, or Scissors");
        System.out.println("Choose between 1,2,3 these stand for Rock,Paper,and Scissor");
        while (b != 0) {
            int rock = 1, Paper = 2, Scissor = 3;
            input = sage.nextInt();
            int randomnumber = rnd.nextInt(3 - 1 + 1) + 1;

            if (randomnumber == rock) {
                System.out.println("Rock vs Rock");
                System.out.println(" Tie Game");


                if (input == Paper) {
                    System.out.println(" Rock vs Paper");
                    System.out.println("You Win!");
                } else if (input == Scissor) {
                    System.out.println("Rock vs. Scissor");
                    System.out.println("You Lose!");
                } else if (randomnumber == Paper) {
                    if (input == rock) {
                        System.out.println("Paper vs Rock");
                        System.out.println("You Lose!");
                    } else if (input == Scissor) {
                        System.out.println("Paper vs scissor");
                        System.out.println(" You Win!");
                    } else if (input == Paper) {
                        System.out.println("Paper vs Paper");
                        System.out.println("Tie Game");
                    } else if (randomnumber == Scissor) {
                        if (input == rock) {
                            System.out.println("Scissor vs Rock");
                            System.out.println("You Win!");
                        } else if (input == Scissor) {

                            System.out.println("Scissors vs Scissors");
                            System.out.println("Its a tie");
                        } else if (input == Paper) {
                            System.out.println("Scissors vs Paper");
                            System.out.println("you Lose!");

                        }

                    }
                }
            }
        }
    }
}








