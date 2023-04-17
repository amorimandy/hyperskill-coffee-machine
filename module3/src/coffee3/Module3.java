package coffee3;

import java.util.Scanner;

public class Module3 {

    /**
     * 1. It requests the amounts of water, milk, and coffee beans available at the moment, and then asks for the number
     * of cups a user needs.
     * 2. If the coffee machine has enough supplies to make the specified amount of coffee, the program should print "Yes,
     * I can make that amount of coffee".
     * 3. If the coffee machine can make more than that, the program should output "Yes, I can make that amount of coffee
     * (and even N more than that)", where N is the number of additional cups of coffee that the coffee machine can make.
     * 4. If the amount of given resources is not enough to make the specified amount of coffee, the program should output
     * "No, I can make only N cup(s) of coffee".
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final int WATER_CONSTANT = 200;
        final int MILK_CONSTANT = 50;
        final int COFFEE_CONSTANT = 15;

        System.out.println("Write how many ml of water the coffee machine has:");
        int inputWater = input.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has:");
        int inputMilk = input.nextInt();

        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int inputCoffeeBeans = input.nextInt();

        System.out.println("Write how many cups of coffee you will need:");
        int nCoffeeDrinks = input.nextInt();

        boolean condition1 = (inputWater >= WATER_CONSTANT) &&
                (inputMilk >= MILK_CONSTANT) &&
                (inputCoffeeBeans >= COFFEE_CONSTANT);

        if (condition1) {
            int producedCoffee = 0;

            while ((inputWater >= WATER_CONSTANT) && (inputMilk >= MILK_CONSTANT) && (inputCoffeeBeans >= COFFEE_CONSTANT)) {
                inputWater -= WATER_CONSTANT;
                inputMilk -= MILK_CONSTANT;
                inputCoffeeBeans -= COFFEE_CONSTANT;

                producedCoffee++;
            }

            if (producedCoffee == nCoffeeDrinks) {
                System.out.println("Yes, I can make that amount of coffee");
            }

            if (producedCoffee < nCoffeeDrinks) {
                System.out.println(String.format("No, I can make only %s cup(s) of coffee", producedCoffee));
            }

            if (producedCoffee > nCoffeeDrinks) {
                producedCoffee -= nCoffeeDrinks;
                System.out.println(String.format("Yes, I can make that amount of coffee (and even %s more than that)", producedCoffee));
            }
        }
    }
}
