package machine.Coffee;

public class Latte extends Coffee{
    private final int milk;

    public Latte() {
        water = 350;
        milk = 75;
        beans = 20;
        disposableCup = 1;
        costs = 7;
    }

    public int getMilk() {
        return milk;
    }
}
