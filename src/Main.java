import javafx.scene.layout.HBox;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static JFrame frame = new JFrame("InputDialog Example #1");

    public static void main(String[] args) {

        System.out.println("Hello World!");
        System.out.println("lakira");

        numberfuction();
        friedfunction();
        agefunction();
        namefuction();
         teamfuction();
        bornfuction();
        gamefuction();
        candyfuction();
        subjectfuction();
        byefuction();
    }

    public static void agefunction() {
        System.out.println("Enter your age");
        String age = scanner.next();
        System.out.println(" hello lakira you are " + age);

    }

    public static void friedfunction() {
        System.out.println("who is your best friend?");
        String friend = scanner.next();
        System.out.println("your best friend is " + friend);
        System.out.println("what is your favorite food ?");
        String food = scanner.next();
        System.out.println("your favorite food is " + food);
    }

    public static void numberfuction() {
        System.out.println("Enter first  number");
        int num1 = scanner.nextInt();
        System.out.println("Enter second  number");
        int num2 = scanner.nextInt();
        System.out.println("Total is " + (num1 + num2));
        System.out.println("Mutiplication is  " + (num1 * num2));
        System.out.println("Substraction is  " + (num1 - num2));
    }

    public static void namefuction() {

        // prompt the user to enter their name
        String name = JOptionPane.showInputDialog(frame, "What's your name?");
        // get the user's input. note that if they press Cancel, 'name' will be null
        System.out.printf("The user's name is '%s'.\n", name);
    }

    public static void teamfuction() {
        System.out.println("what is your favorite football team ?");
        String team = scanner.next();
        System.out.println("your favorite football team is " + team);

    }

    public static void gamefuction() {
        System.out.println("what is your favorite game ?");
        String game = scanner.next();
        System.out.println("your favorite game is " + game);
    }

    public static void candyfuction() {
        System.out.println("what is your favorite candy ?");
        String candy = scanner.next();
        System.out.println("your favorite candy is " + candy);
    }

    public static void subjectfuction() {
        System.out.println("what is your favorite subject ?");
        String subject = scanner.next();
        System.out.println("your favortite subject is " + subject);

    }

    public static void bornfuction() {
        System.out.println("which year are you born?");
        String born = scanner.next();
        System.out.println("you are born " + born);
    }


    public static void byefuction() {
        System.out.println("bye and thanks for answering these questions !");
    }

}

