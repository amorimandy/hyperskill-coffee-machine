package coffee5;

import java.util.Scanner;

public class Coffee {

    static Espresso espresso = new Espresso();
    static Latte latte = new Latte();
    static Cappuccino cappuccino = new Cappuccino();
    static int availableWater = 400;
    static int availableMilk = 540;
    static int availableCoffee = 120;
    static int disposableCups = 9;
    static int availableMoney = 550;

    void buy() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String code = scanner.next();

        switch (code) {
            case "1":
                espresso.verifyAvailableIngredients();
                break;
            case "2":
                latte.verifyAvailableIngredients();
                break;
            case "3":
                cappuccino.verifyAvailableIngredients();
                break;
            case "back":
                MachineOperations.actions();
                break;
        }
    }

    void fill() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWrite how many ml of water you want to add:");
        int addWatter = scanner.nextInt();
        availableWater += addWatter;

        System.out.println("Write how many ml of milk you want to add:");
        int addMilk = scanner.nextInt();
        availableMilk += addMilk;

        System.out.println("Write how many grams of coffee beans you want to add:");
        int addCoffeeBeans = scanner.nextInt();
        availableCoffee += addCoffeeBeans;

        System.out.println("Write how many disposable cups you want to add:");
        int addCups = scanner.nextInt();
        disposableCups += addCups;

        MachineOperations.actions();
    }

    void take() {
        System.out.println("\nI gave you " + availableMoney);
        availableMoney = 0;

        MachineOperations.actions();
    }

    void remain() {
        System.out.println("\nThe coffee machine has:\n" +
                availableWater + " ml of water\n" +
                availableMilk + " ml of milk\n" +
                availableCoffee + " g of coffee beans\n" +
                disposableCups + " disposable cups\n" +
                "$" + availableMoney + " of money");

        MachineOperations.actions();
    }

}
