package coffee5;

import static coffee5.Coffee.*;

public class Espresso implements CoffeeInterface {
    static final int USED_WATER = 250;
    static final int USED_COFFEE = 16;
    static final int USED_CUP = 1;
    static final int COST = 4;

    @Override
    public void verifyAvailableIngredients() {

        boolean availableEspresso = (availableWater >= USED_WATER &&
                availableCoffee >= USED_COFFEE &&
                disposableCups >= USED_CUP);

        if (availableEspresso) {
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
        } else {
            return "cups";
        }
    }
}
