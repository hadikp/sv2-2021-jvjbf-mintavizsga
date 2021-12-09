package owlcounter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class OwlCounter {

    private List<String> numberOfOwls = new ArrayList<>();

    public List<String> readFromFile(Path path) {
        try {
            numberOfOwls = Files.readAllLines(path);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.", ioe);
        }
        return numberOfOwls;
    }

    public int getNumberOfOwls(String county) {
        int countyNumber = 0;
        for (String st: numberOfOwls) {
            String[] countySplit = st.split("=");
            if (countySplit[0].equals(county)) {
                countyNumber = Integer.parseInt(countySplit[1]);
            }
        }
        if (countyNumber == 0) {
            throw new IllegalArgumentException("No such county in Hungary!");
        }
        return countyNumber;
    }

    public int getNumberOfAllOwls() {
        int countySplitAllOwls = 0;
        for (String st: numberOfOwls) {
            String[] county = st.split("=");
            countySplitAllOwls += getNumberOfOwls(county[0]);
        }
        return countySplitAllOwls;
    }


}
