import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by octo-ola on 24/10/2016.
 */
public class BowlingTest {

    Bowling bowling;

    @Before
    public void runBeforeTestMethod() {
        bowling = new Bowling();
    }

    @Test
    public void should_add_tour() {
        // Given
        int tour[][] = {{0, 0}};

        // When
        int tourNumber = bowling.addTour(tour);

        // Then
        Assert.assertEquals(tourNumber, tour.length);
    }

    @Test
    public void should_add_multiple_tours() {
        // Given
        int firstTour[][] = {{0, 0}};
        int secondTour[][] = {{10, 0}};

        // When
        int tourNumber = bowling.addTour(firstTour);
        tourNumber = bowling.addTour(secondTour);

        // Then
        Assert.assertEquals(tourNumber, 2);
    }

}
