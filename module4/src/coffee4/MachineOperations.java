package coffee4;

import java.util.Scanner;

public class MachineOperations {

    public static void actions() {
        Scanner input = new Scanner(System.in);

        System.out.println("The coffee machine has:\n" +
                Coffee.availableWater + " ml of water\n" +
                Coffee.availableMilk + " ml of milk\n" +
                Coffee.availableCoffee + " g of coffee beans\n" +
                Coffee.disposableCups + " disposable cups\n" +
                "$" + Coffee.availableMoney + " of money");

        System.out.println("Write action (buy, fill, take):");
        String action = input.next();

        switch (action) {
            case "buy":
                Coffee.buy();
                break;
            case "fill":
                Coffee.fill();
                break;
            case "take":
                Coffee.take();
                break;
        }
    }
}
