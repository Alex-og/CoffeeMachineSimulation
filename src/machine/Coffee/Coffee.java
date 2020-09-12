package machine.Coffee;

public abstract class Coffee {
    int water;
    int milk;
    int beans;
    int disposableCup;
    int costs;


    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getBeans() {
        return beans;
    }

    public int getDisposableCup() {
        return disposableCup;
    }

    public int getCosts() {
        return costs;
    }

    public int[] getResourcesDrink() {
        return new int[] {this.getWater(), this.getMilk(), this.getBeans(), this.getDisposableCup()};
    }
}
