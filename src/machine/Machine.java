package machine;

import machine.Coffee.Cappuccino;
import machine.Coffee.Espresso;
import machine.Coffee.Latte;

import java.text.MessageFormat;

public class Machine {
    private static int water = 400;
    private static int milk = 540;
    private static int beans = 120;
    private static int disposableCups = 9;
    private static int money = 550;

    public static int getWater() {
        return water;
    }

    public static int[] getResources() {
        return new int[] {water, milk, beans, disposableCups, money};
    }

    public static int getMilk() {
        return milk;
    }

    public static int getBeans() {
        return beans;
    }

    public static int getDisposableCups() {
        return disposableCups;
    }

    public static int getMoney() {
        return money;
    }

    public static void setMoney(int money) {
        Machine.money = money;
    }

    public static void makeEspresso() {
        Espresso espresso = new Espresso();
        water -= espresso.getWater();
        beans -= espresso.getBeans();
        disposableCups -= espresso.getDisposableCup();
        money += espresso.getCosts();
    }

    public static void makeLatte() {
        Latte latte = new Latte();
        water -= latte.getWater();
        milk -= latte.getMilk();
        beans -= latte.getBeans();
        disposableCups -= latte.getDisposableCup();
        money += latte.getCosts();
    }

    public static void makeCappuccino() {
        Cappuccino cappuccino = new Cappuccino();
        water -= cappuccino.getWater();
        milk -= cappuccino.getMilk();
        beans -= cappuccino.getBeans();
        disposableCups -= cappuccino.getDisposableCup();
        money += cappuccino.getCosts();
    }

    public static void addResources(int water, int milk, int beans, int disposableCups) {
        Machine.water += water;
        Machine.milk += milk;
        Machine.beans += beans;
        Machine.disposableCups += disposableCups;
    }

    static void containsResources() {
        System.out.println("The coffee machine has:");
        String formatStatistic = "{0} {1, choice, 0#of water | 1#of milk | 2#of coffee beans | 3#of disposable cups| 4#of money}";
        for (int i = 0; i < Machine.getResources().length; i++) {
            System.out.println(MessageFormat.format(formatStatistic, Integer.toString(Machine.getResources()[i]), i));
        }
    }
}
