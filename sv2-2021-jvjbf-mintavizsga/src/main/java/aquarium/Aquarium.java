package aquarium;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {

    private List<Fish> fishList = new ArrayList<>();
    public static final int CAPACITY = 100;

    public void addFish(Fish fish) {
        fishList.add(fish);
    }
}
