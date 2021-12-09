package aquarium;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {

    private List<Fish> fishList = new ArrayList<>();
    public static final int CAPACITY = 20;

    public void addFish(Fish fish) {
        if (fishList.size() * 5 < CAPACITY) {
            fishList.add(fish);
        } else {
            throw new IllegalStateException("Can not add fish because there is no more space.");
        }
    }

    public void feed() {
        for (Fish f: fishList) {
            f.feed();
        }
    }

    public void removeFish(int maxWeight) {
        List<Fish> remove = new ArrayList<>();
        for (Fish f: fishList) {
            if (f.weight > maxWeight) {
                remove.add(f);
            }
        }
        fishList.removeAll(remove);
    }

    public List<String> getStatus() {
        List<String> statusList = new ArrayList<>();
        for (Fish f: fishList) {
            statusList.add(f.getStatus());
        }
        return statusList;
    }

    public int getNumberOfFishWithMemoryLoss() {
        int count = 0;
        for (Fish f: fishList) {
            if (f.hasMemoryLoss() == true) {
                count++;
            }
        }
        return count;
    }

    public boolean isThereFishWithGivenColor(String color) {
        for (Fish f: fishList) {
            if (f.getColor().equals(color)) {
                return true;
            }
        }
        return false;
    }

    public Fish  getSmallestFish() {
        int minWeight = 1000;
        Fish fish = null;
        for (Fish f: fishList) {
            if (f.weight < minWeight) {
                minWeight = f.weight;
                fish = f;
            }
        }
        return fish;
    }
}
