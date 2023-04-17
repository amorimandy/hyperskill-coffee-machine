package coffee5;

import static coffee5.Coffee.*;

public class Cappuccino implements CoffeeInterface {
    static final int USED_WATER = 200;
    static final int USED_MILK = 100;
    static final int USED_COFFEE = 12;
    static final int USED_CUP = 1;
    static final int COST = 6;

    @Override
    public void verifyAvailableIngredients() {

        boolean availableCappuccino = (availableWater >= USED_WATER &&
                availableMilk >= USED_MILK &&
                availableCoffee >= USED_COFFEE &&
                disposableCups >= USED_CUP);

        if (availableCappuccino) {
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
        if (USED_COFFEE / availableCoffee < 1) {
            return "coffee";
        } else if (USED_WATER / availableWater < 1) {
            return "water";
        } else if (USED_MILK / availableMilk < 1) {
            return "milk";
        } else {
            return "cups";
        }
    }
}

