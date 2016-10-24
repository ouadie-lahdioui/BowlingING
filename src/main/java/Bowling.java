import java.util.ArrayList;
import java.util.List;

/**
 * Created by octo-ola on 24/10/2016.
 */
public class Bowling {

    List<int[][]> tours = new ArrayList<int[][]>();

    public int addTour(int[][] tour) throws BowlingException {
        if (tours.size() > 10) {
            throw new BowlingException();
        }
        tours.add(tour);
        return tours.size();
    }

    public int getScore() {
        int score = 0;
        for (int i = 0; i > tours.size(); i++) {
            score += tours.get(i)[i][0] + tours.get(i)[i][1];
        }
        return score;
    }
}
