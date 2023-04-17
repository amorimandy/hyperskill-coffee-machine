package coffee2;

import java.util.Scanner;

public class Module2 {

    /**
     * 1. First, read the numbers of coffee drinks from the input.
     * 2. Figure out how much of each ingredient the machine will need.
     * Note that one cup of coffee made on this coffee machine contains 200 ml of water, 50 ml of milk,
     * and 15 g of coffee beans.
     * 3. Output the required ingredient amounts back to the user.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Write how many cups of coffee you will need:");
        int nCoffeeDrinks = input.nextInt();
        int water, milk, coffeeBeans;

        water = nCoffeeDrinks * 200;
        milk = nCoffeeDrinks * 50;
        coffeeBeans = nCoffeeDrinks * 15;

        System.out.println("For " + nCoffeeDrinks + " cups of coffee you will need:\n" +
                water + " ml of water\n" +
                milk + " ml of milk\n" +
                coffeeBeans + " g of coffee beans");
    }
}
