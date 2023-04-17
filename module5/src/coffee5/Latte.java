package coffee5;

import static coffee5.Coffee.*;

public class Latte implements CoffeeInterface {
    static final int USED_WATER = 350;
    static final int USED_MILK = 75;
    static final int USED_COFFEE = 20;
    static final int USED_CUP = 1;
    static final int COST = 7;

    @Override
    public void verifyAvailableIngredients() {

        boolean availableLatte = (availableWater >= USED_WATER &&
                availableMilk >= USED_MILK &&
                availableCoffee >= USED_COFFEE &&
                disposableCups >= USED_CUP);

        if (availableLatte) {
            System.out.println("I have enough resources, making you a coffee!");
            produceCoffee();
            MachineOperations.actions();
        } else {
            System.out.println("Sorry, not enough " + getUnavailableIngredient() + "!");
            MachineOperations.actions();
        }
    }

    @Override
    public void produceCoffee() {
        availableWater -= USED_WATER;
        availableMilk -= USED_MILK;
        availableCoffee -= USED_COFFEE;
        disposableCups -= USED_CUP;
        availableMoney += COST;
    }

    @Override
    public String getUnavailableIngredient() {
        if (availableCoffee / USED_COFFEE < 1) {
            return "coffee";
        } else if (availableWater / USED_WATER < 1) {
            return "water";
        } else if (availableMilk / USED_MILK < 1) {
            return "milk";
        } else {
            return "cups";
        }
    }

}