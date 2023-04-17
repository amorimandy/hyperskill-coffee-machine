package coffee5;

public class Module5 {

    /**
     * Write a program that will work endlessly to make coffee for all interested persons until the shutdown signal is
     * given. Introduce two new options: "remaining" and "exit".
     * <p>
     * Do not forget that you can be out of resources for making coffee. If the coffee machine doesn't have enough
     * resources to make coffee, the program should output a message that says it can't make a cup of coffee and state
     * what is missing.
     * <p>
     * And the last improvement to the program at this step — if the user types "buy" to buy a cup of coffee and then
     * changes his mind, they should be able to type "back" to return into the main cycle.
     */

    public static void main(String[] args) {

        MachineOperations.actions();
    }
}
