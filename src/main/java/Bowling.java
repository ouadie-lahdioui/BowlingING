import java.util.ArrayList;
import java.util.List;

/**
 * Created by octo-ola on 24/10/2016.
 */
public class Bowling {

    List<Tour> tours = new ArrayList<>();

    public int addTour(Tour tour) throws BowlingException {
        if (tours.size() > 10) {
            throw new BowlingException();
        }
        tours.add(tour);
        return tours.size();
    }

    public int getScore() {
        return tours.stream().map(Tour::getScore).reduce(0, (a, b) -> a + b);
    }
}
