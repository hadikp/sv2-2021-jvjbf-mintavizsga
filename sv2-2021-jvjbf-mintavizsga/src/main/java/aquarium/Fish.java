package aquarium;

public abstract class Fish {

    private String name;
    protected int weight; //g-ban
    private String color;
    private boolean memoryLoss;

    public Fish(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public String getStatus() {
        String datas = String.format("%s, weight: %d, color: %s, short-term memory loss: %s", name, weight, color, memoryLoss);
        return datas;
    }

    public abstract void feed();

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public boolean hasMemoryLoss() {
        return memoryLoss;
    }
}
