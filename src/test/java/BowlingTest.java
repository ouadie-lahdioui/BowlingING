import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by octo-ola on 24/10/2016.
 */
public class BowlingTest {

    Bowling bowling;

    @Before
    public void runBeforeTestMethod(){
        bowling = new Bowling();
    }

    @Test
    public void should_add_tour() throws BowlingException {
        // Given
        int tour[][] = {{0, 0}};

        // When
        int tourNumber = bowling.addTour(tour);

        // Then
        Assert.assertEquals(tourNumber, tour.length);
    }

    @Test
    public void should_add_multiple_tours() throws BowlingException {
        // Given
        int firstTour[][] = {{0, 0}};
        int secondTour[][] = {{10, 0}};

        // When
        int tourNumber = bowling.addTour(firstTour);
        tourNumber = bowling.addTour(secondTour);

        // Then
        Assert.assertEquals(tourNumber, 2);
    }

    @Test(expected = BowlingException.class)
    public void should_add_not_allow_adding_moreThan_10_tours() throws BowlingException {
        // Given
        int tour1[][] = {{0, 0}};
        int tour2[][] = {{0, 0}};
        int tour3[][] = {{0, 0}};
        int tour4[][] = {{0, 0}};
        int tour5[][] = {{0, 0}};
        int tour6[][] = {{0, 0}};
        int tour7[][] = {{0, 0}};
        int tour8[][] = {{0, 0}};
        int tour9[][] = {{0, 0}};
        int tour10[][] = {{0, 0}};
        int tour11[][] = {{0, 0}};

        bowling.addTour(tour1);
        bowling.addTour(tour1);
        bowling.addTour(tour2);
        bowling.addTour(tour3);
        bowling.addTour(tour4);
        bowling.addTour(tour5);
        bowling.addTour(tour6);
        bowling.addTour(tour7);
        bowling.addTour(tour8);
        bowling.addTour(tour9);
        bowling.addTour(tour10);
        bowling.addTour(tour11);

        // When
        // Then
    }



}
