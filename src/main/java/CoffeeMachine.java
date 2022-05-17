
import java.util.Scanner;

public class CoffeeMachine {

    public static int water = 400;
    public static int milk = 540;
    public static int coffeeBeans = 120;
    public static int disposableCups = 9;
    public static int money = 550;

    public static void handleInput(String input) {
        switch (input) {
            case "buy":
                buy();
                break;
            case "fill":
                fill();
                break;
            case "take":
                take();
                break;
            case "remaining":
                display();
                break;
            case "exit":
                Main.running = false;
        }
    }

    public static void display(){
        System.out.println("The coffee machine has:");
        System.out.printf("%d ml of water\n", water);
        System.out.printf("%d ml of milk\n", milk);
        System.out.printf("%d g of coffee beans\n", coffeeBeans);
        System.out.printf("%d disposable cups\n", disposableCups);
        System.out.printf("$%d of money\n", money);
    }

    public static void buy() {

        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        Scanner sc = new Scanner(System.in);

        String c = sc.next();

        switch (c) {
            case "1":

                if (water < 250) {
                    System.out.println("Sorry, not enough water!");
                }
                else if (disposableCups < 1) {
                    System.out.println("Sorry, not enough disposable cups!");
                }
                else if (coffeeBeans < 16) {
                    System.out.println("Sorry, not enough coffee beans!");
                }
                else {
                    System.out.println("I have enough resources, making you a coffee!");
                    water -= 250;
                    disposableCups -= 1;
                    money += 4;
                    coffeeBeans -= 16;
                }

                break;
            case "2":

                if (water < 350) {
                    System.out.println("Sorry, not enough water!");
                }
                else if (milk < 75) {
                    System.out.println("Sorry, not enough milk!");
                }
                else if (disposableCups < 1) {
                    System.out.println("Sorry, not enough disposable cups!");
                }
                else if (coffeeBeans < 20) {
                    System.out.println("Sorry, not enough coffee beans!");
                }
                else {
                    System.out.println("I have enough resources, making you a coffee!");
                    water -= 350;
                    milk -= 75;
                    coffeeBeans -= 20;
                    disposableCups -= 1;
                    money += 7;
                }

                break;
            case "3":

                if (water < 200) {
                    System.out.println("Sorry, not enough water!");
                }
                else if (milk < 100) {
                    System.out.println("Sorry, not enough milk!");
                }
                else if (disposableCups < 1) {
                    System.out.println("Sorry, not enough disposable cups!");
                }
                else if (coffeeBeans < 12) {
                    System.out.println("Sorry, not enough coffee beans!");
                }
                else {
                    System.out.println("I have enough resources, making you a coffee!");
                    water -= 200;
                    milk -= 100;
                    coffeeBeans -= 12;
                    disposableCups -= 1;
                    money += 6;
                }

                break;
        }
    }

    public static void fill() {
        Scanner sc = new Scanner(System.in);
        int amount;
        System.out.println("Write how many ml of water you want to add?");
        amount = Integer.parseInt(sc.next());
        water += amount;

        System.out.println("Write how many ml of milk you want to add?");
        amount = Integer.parseInt(sc.next());
        milk += amount;

        System.out.println("Write how many grams of coffee beans you want to add?");
        amount = Integer.parseInt(sc.next());
        coffeeBeans += amount;

        System.out.println("How many disposable cups of coffee you want to add?");
        amount = Integer.parseInt(sc.next());
        disposableCups += amount;
    }

    public static void take() {
        System.out.printf("I gave you $%d\n", money);
        money = 0;
    }
}
