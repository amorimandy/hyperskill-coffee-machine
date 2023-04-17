package coffee5;

import java.util.Scanner;

public class MachineOperations {
    public static void actions() {

        Coffee coffee = new Coffee();

        Scanner input = new Scanner(System.in);

        System.out.println("\nWrite action (buy, fill, take, remaining, exit):");

        String action = input.next();

        switch (action) {
            case "buy":
                coffee.buy();
                break;
            case "fill":
                coffee.fill();
                break;
            case "take":
                coffee.take();
                break;
            case "remaining":
                coffee.remain();
                break;
            case "exit":
                break;
        }
    }
}