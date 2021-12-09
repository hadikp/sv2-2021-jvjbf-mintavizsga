package aquarium;

public class Tang extends Fish {

    protected boolean memoryLoss = true;

    public Tang(String name, int weight, String color) {
        super(name, weight, color);
    }

    @Override
    public void feed() {
        weight += 1;
    }

}
