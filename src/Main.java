import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your party affiliation? D, R, I, or Other? ");
        String choice = in.nextLine();

        if (choice.equalsIgnoreCase("D")){
            System.out.println("You got the democratic donkey! ");
        } else if (choice.equalsIgnoreCase("R")){
            System.out.println("You got the Republican Elephant! ");
        } else if (choice.equalsIgnoreCase("I")){
            System.out.println("You got the Independent Person! ");
        } else if (choice.equalsIgnoreCase("Other")){
            System.out.println("You get Other! ");
        } else{
            System.out.println("ERROR. You entered a wrong choice");
        }
    }
}