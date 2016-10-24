import java.util.ArrayList;
import java.util.List;

/**
 * Created by octo-ola on 24/10/2016.
 */
public class Bowling {

    List<Tour> tours = new ArrayList<>();
    final int MAX_TOUR_NUMBER = 10;

    public int addTour(Tour tour) throws BowlingException {
        if (tours.size() == MAX_TOUR_NUMBER) {
            throw new BowlingException();
        }
        tours.add(tour);
        return tours.size();
    }

    public int getScore() {
        int score = 0;
        for (int i = 0; i < tours.size(); i++) {
            Tour tour = tours.get(i);
            if(tour.isStrike() && isFirstOrLast(i, tours.size())) {
                Tour nextTour = tours.get(i + 1);
                score += tour.getScore() + nextTour.getScore();
            }else if (tour.isSpare()) {

            }else {
                score += tour.getScore();
            }
        }
        return score;
        //return tours.stream().map(Tour::getScore).reduce(0, (a, b) -> a + b);
    }

    private boolean isFirstOrLast(int position, int size) {
        return position != 0 && position != size;
    }
}
