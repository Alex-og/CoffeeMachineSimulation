package machine.Coffee;

public class Cappuccino extends Coffee{
    private final int milk;

    public Cappuccino() {
        water = 200;
        milk = 100;
        beans = 12;
        disposableCup = 1;
        costs = 6;
    }

    public int getMilk() {
        return milk;
    }
}
