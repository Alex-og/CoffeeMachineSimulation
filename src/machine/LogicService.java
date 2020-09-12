package machine;

import machine.Coffee.Cappuccino;
import machine.Coffee.Coffee;
import machine.Coffee.Espresso;
import machine.Coffee.Latte;

import java.io.BufferedReader;
import java.io.IOException;


public class LogicService {
    static final String ENOUGH_RESOURCES = "I have enough resources, making you a coffee!";

    static void startAction(BufferedReader reader) throws IOException {

        while (true) {
            System.out.println("\n" + "Write action (buy, fill, take, remaining, exit):");
            String action = reader.readLine();
            if (action.equals(ACTION.EXIT.getAction())) {
                break;
            }

            switch (ACTION.valueOf(action.toUpperCase())) {
                case BUY:
                    System.out.println();
                    LogicService.buy(reader);
                    break;
                case FILL:
                    System.out.println();
                    LogicService.fill(reader);
                    break;
                case TAKE:
                    System.out.println();
                    LogicService.take();
                    break;
                case REMAINING:
                    System.out.println();
                    Machine.containsResources();
                    break;
                default:
                    break;
            }
        }
    }

    private static void take() {
        int money = Machine.getMoney();
        Machine.setMoney(0);
        System.out.printf("I gave you $%d", money);
        System.out.println();
    }

    private static void fill(BufferedReader reader) throws IOException {
        System.out.println("Write how many ml of water do you want to add:");
        int water = Integer.parseInt(reader.readLine());
        System.out.println("Write how many ml of milk do you want to add:");
        int milk = Integer.parseInt(reader.readLine());
        System.out.println("Write how many grams of coffee beans do you want to add:");
        int beans = Integer.parseInt(reader.readLine());
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        int disposableCup = Integer.parseInt(reader.readLine());
        Machine.addResources(water, milk, beans, disposableCup);
        System.out.println();
    }

    private static void buy(BufferedReader reader) throws IOException {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        String input = reader.readLine();
        if (input.equalsIgnoreCase(ACTION.BACK.getAction())) {
            return;
        }
        int choiceDrink = Integer.parseInt(input);
        switch (choiceDrink) {
            case 1:
                if (isEnoughResources(choiceDrink)) {
                    System.out.println(ENOUGH_RESOURCES);
                    Machine.makeEspresso();
                } else {
                    whichResourceNotEnough(new Espresso());
                }
                break;
            case 2:
                if (isEnoughResources(choiceDrink)) {
                    System.out.println(ENOUGH_RESOURCES);
                    Machine.makeLatte();
                } else {
                    whichResourceNotEnough(new Latte());
                }
                break;
            case 3:
                if (isEnoughResources(choiceDrink)) {
                    System.out.println(ENOUGH_RESOURCES);
                    Machine.makeCappuccino();
                } else {
                    whichResourceNotEnough(new Cappuccino());
                }
                break;
            default:
                break;
        }
    }

    private static boolean isEnoughResources(int choiceDrink) {
        int[] res;
        switch (choiceDrink) {
            case 1:
                Espresso espresso = new Espresso();
                res = espresso.getResourcesDrink();
                if (res[0] > Machine.getWater() || res[2] > Machine.getBeans() || res[3] > Machine.getDisposableCups()) {
                    return false;
                }
                break;
            case 2:
                Latte latte = new Latte();
                res = latte.getResourcesDrink();
                if (res[0] > Machine.getWater() || res[1] > Machine.getMilk() || res[2] > Machine.getBeans() || res[3] > Machine.getDisposableCups()) {
                    return false;
                }
                break;
            case 3:
                Cappuccino cappuccino = new Cappuccino();
                res = cappuccino.getResourcesDrink();
                if (res[0] > Machine.getWater() || res[1] > Machine.getMilk() || res[2] > Machine.getBeans() || res[3] > Machine.getDisposableCups()) {
                    return false;
                }
                break;
            default:
                return true;
        }

        return true;
    }

    private static void whichResourceNotEnough(Coffee coffee) {
        if (coffee.getWater() > Machine.getWater()) {
            System.out.println("Sorry, not enough water!");
        }
        if (coffee.getMilk() > Machine.getMilk()) {
            System.out.println("Sorry, not enough milk!");
        }
        if (coffee.getBeans() > Machine.getBeans()) {
            System.out.println("Sorry, not enough beans!");
        }
        if (coffee.getDisposableCup() > Machine.getDisposableCups()) {
            System.out.println("Sorry, not enough disposable cup!");
        }
    }
}
