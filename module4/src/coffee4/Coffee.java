package coffee4;

import java.util.Scanner;

public class Coffee {
    static Scanner input = new Scanner(System.in);
    static int availableWater = 400;
    static int availableMilk = 540;
    static int availableCoffee = 120;
    static int disposableCups = 9;
    static int availableMoney = 550;

    static void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        int code = input.nextInt();

        switch (code) {
            case 1 -> System.out.println("The coffee machine has:\n" +
                    (availableWater - Espresso.USED_WATER) + " ml of water\n" +
                    availableMilk + " ml of milk\n" +
                    (availableCoffee - Espresso.USED_COFFEE) + " g of coffee beans\n" +
                    (disposableCups - 1) + " disposable cups\n" +
                    "$" + (availableMoney + Espresso.COST) + " of money");
            case 2 -> System.out.println("The coffee machine has:\n" +
                    (availableWater - Latte.USED_WATER) + " ml of water\n" +
                    (availableMilk - Latte.USED_MILK) + " ml of milk\n" +
                    (availableCoffee - Latte.USED_COFFEE) + " g of coffee beans\n" +
                    (disposableCups - 1) + " disposable cups\n" +
                    "$" + (availableMoney + Latte.COST) + " of money");
            case 3 -> System.out.println("The coffee machine has:\n" +
                    (availableWater - Cappuccino.USED_WATER) + " ml of water\n" +
                    (availableMilk - Cappuccino.USED_MILK) + " ml of milk\n" +
                    (availableCoffee - Cappuccino.USED_COFFEE) + " g of coffee beans\n" +
                    (disposableCups - 1) + " disposable cups\n" +
                    "$" + (availableMoney + Cappuccino.COST) + " of money");
        }
    }

    static void fill() {
        System.out.println("Write how many ml of water you want to add:");
        int addWatter = input.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        int addMilk = input.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        int addCoffeeBeans = input.nextInt();
        System.out.println("Write how many disposable cups you want to add:");
        int addCups = input.nextInt();

        System.out.println("The coffee machine has:\n" +
                (availableWater + addWatter) + " ml of water\n" +
                (availableMilk + addMilk) + " ml of milk\n" +
                (availableCoffee + addCoffeeBeans) + " g of coffee beans\n" +
                (disposableCups + addCups) + " disposable cups\n" +
                "$" + availableMoney + " of money");
    }

    static void take() {
        System.out.println("I gave you " + availableMoney);
        availableMoney = 0;

        System.out.println("The coffee machine has:\n" +
                availableWater + " ml of water\n" +
                availableMilk + " ml of milk\n" +
                availableCoffee + " g of coffee beans\n" +
                disposableCups + " disposable cups\n" +
                "$" + availableMoney + " of money");
    }
}
