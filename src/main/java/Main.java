import java.util.Scanner;

public class Main {

    public static boolean running;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String action;
        running = true;

        while(running) {
            System.out.println();
            System.out.println("Write action (buy, fill, take, remaining, exit):");

            action = scanner.next();
            System.out.println();
            CoffeeMachine.handleInput(action);
        }
        
    }
}

