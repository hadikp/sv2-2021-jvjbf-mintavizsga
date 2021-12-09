package owlcounter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OwlCounter {

    private List<String> NumberOfOwls = new ArrayList<>();

    public void readFromFile(Path path) {
        try {
            NumberOfOwls = Files.readAllLines(path);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.", ioe);
        }
    }

    public int getNumberOfOwls(String county) {
        int countySplitNumber = 0;
        for (String st: NumberOfOwls) {
            String[] countySplit = st.split("=");
            System.out.println(countySplit[0]);
            if (!countySplit[0].contains(county)) {
                throw new IllegalArgumentException("No such county in Hungary!");

            } else {
                countySplitNumber = Integer.parseInt(countySplit[1]);
            }
        }
        return countySplitNumber;
    }

    public int getNumberOfAllOwls() {
        int countySplitAllOwls = 0;
        for (String st: NumberOfOwls) {
            String[] county = st.split("=");
            countySplitAllOwls = getNumberOfOwls(county[0]);
            System.out.println(countySplitAllOwls);
        }
        return countySplitAllOwls;
    }


}
