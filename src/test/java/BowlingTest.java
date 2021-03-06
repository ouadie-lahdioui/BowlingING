import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by octo-ola on 24/10/2016.
 */
//@RunWith(Parameterized.class)
public class BowlingTest {

    Bowling bowling;
    Tour parameterizedTour;

    /*
    public BowlingTest(Tour tour) {
        this.parameterizedTour = tour;
    }
    */

    @Before
    public void runBeforeTestMethod() {
        bowling = new Bowling();
    }

    // Yes : This functoionnality is realy awesome ;)
    /*
    @Parameterized.Parameters
    public static Collection<Tour> params() {
        return Arrays.asList(
                new Tour(0,0),
                new Tour(0,0),
                new Tour(0,0),
                new Tour(0,0),
                new Tour(0,0),
                new Tour(0,0),
                new Tour(0,0),
                new Tour(0,0),
                new Tour(0,0),
                new Tour(0,0)
        );
    }
    */

    @Test
    public void should_add_tour() throws BowlingException {
        // Given
        Tour tour = new Tour(0, 0);

        // When
        int tourNumber = bowling.addTour(tour);

        // Then
        Assert.assertEquals(tourNumber, 1);
    }

    @Test
    public void should_add_multiple_tours() throws BowlingException {
        // Given
        Tour firstTour = new Tour(0, 0);
        Tour secondTour = new Tour(10, 0);

        // When
        bowling.addTour(firstTour);
        int tourNumber = bowling.addTour(secondTour);

        // Then
        Assert.assertEquals(tourNumber, 2);
    }

    @Test(expected = BowlingException.class)
    public void should_add_not_allow_adding_moreThan_10_tours() throws BowlingException {
        // Given
        Tour tour1 = new Tour(0, 0);
        Tour tour2 = new Tour(0, 0);
        Tour tour3 = new Tour(0, 0);
        Tour tour4 = new Tour(0, 0);
        Tour tour5 = new Tour(0, 0);
        Tour tour6 = new Tour(0, 0);
        Tour tour7 = new Tour(0, 0);
        Tour tour8 = new Tour(0, 0);
        Tour tour9 = new Tour(0, 0);
        Tour tour10 = new Tour(0, 0);
        Tour tour11 = new Tour(0, 0);

        // When
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

        // Then
    }

    @Test
    public void should_returnZero_whenNoStrike_andNoSpare_andScoreIsZero() throws BowlingException {
        // Given
        Tour tour1 = new Tour(0, 0);
        Tour tour2 = new Tour(0, 0);
        Tour tour3 = new Tour(0, 0);
        Tour tour4 = new Tour(0, 0);
        Tour tour5 = new Tour(0, 0);
        Tour tour6 = new Tour(0, 0);
        Tour tour7 = new Tour(0, 0);
        Tour tour8 = new Tour(0, 0);
        Tour tour9 = new Tour(0, 0);
        Tour tour10 = new Tour(0, 0);

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

        // When
        int score = bowling.getScore();

        // Then
        Assert.assertEquals(score, 0);
    }

    @Test
    public void should_return60_whenNoStrike_andNoSpare_andScoreIs60() throws BowlingException {
        // Given
        Tour tour1 = new Tour(3, 3);
        Tour tour2 = new Tour(3, 3);
        Tour tour3 = new Tour(3, 3);
        Tour tour4 = new Tour(3, 3);
        Tour tour5 = new Tour(3, 3);
        Tour tour6 = new Tour(3, 3);
        Tour tour7 = new Tour(3, 3);
        Tour tour8 = new Tour(3, 3);
        Tour tour9 = new Tour(3, 3);
        Tour tour10 = new Tour(3, 3);

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

        // When
        int score = bowling.getScore();

        // Then
        Assert.assertEquals(score, 60);
    }

    @Test
    public void should_add_oneStrike_tour() throws BowlingException {
        // Given
        Tour tour = new Tour(10, 0);
        bowling.addTour(tour);

        // When
        int score = bowling.getScore();

        // Then
        Assert.assertEquals(score, 10);
    }

    @Test
    public void should_returnScore100_whenOneStrikeIsGiven_andNoSpareIsGiven() throws BowlingException {
        // Given
        Tour tour1 = new Tour(4,5);
        Tour tour2 = new Tour(4,5);
        Tour tour3 = new Tour(4,5);
        Tour tour4 = new Tour(4,5);
        Tour tour5 = new Tour(4,5);
        Tour tour6 = new Tour(10, 0);
        Tour tour7 = new Tour(4,5);
        Tour tour8 = new Tour(4,5);
        Tour tour9 = new Tour(4,5);
        Tour tour10 = new Tour(4,5);

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

        // When
        int score = bowling.getScore();

        // Then
        Assert.assertEquals(score, 100);
    }

    @Test
    public void should_returnScore100_whenOneStrikeIsGivenAtFirst_andNoSpareIsGiven() throws BowlingException {
        // Given
        Tour tour1 = new Tour(10,0);
        Tour tour2 = new Tour(4,5);
        Tour tour3 = new Tour(4,5);
        Tour tour4 = new Tour(4,5);
        Tour tour5 = new Tour(4,5);
        Tour tour6 = new Tour(4, 5);
        Tour tour7 = new Tour(4,5);
        Tour tour8 = new Tour(4,5);
        Tour tour9 = new Tour(4,5);
        Tour tour10 = new Tour(4,5);

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

        // When
        int score = bowling.getScore();

        // Then
        Assert.assertEquals(score, 100);
    }

    @Test
    public void should_add_oneSpare_tour() throws BowlingException {
        // Given
        Tour tour = new Tour(7, 3);
        bowling.addTour(tour);

        // When
        int score = bowling.getScore();

        // Then
        Assert.assertEquals(score, 10);
    }

    @Test
    public void should_returnScore95_whenNoStrikeIsGiven_andOneSpareIsGiven() throws BowlingException {
        // Given
        Tour tour1 = new Tour(4,5);
        Tour tour2 = new Tour(4,5);
        Tour tour3 = new Tour(4,5);
        Tour tour4 = new Tour(4,5);
        Tour tour5 = new Tour(4,5);
        Tour tour6 = new Tour(5, 5);
        Tour tour7 = new Tour(4,5);
        Tour tour8 = new Tour(4,5);
        Tour tour9 = new Tour(4,5);
        Tour tour10 = new Tour(4,5);

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

        // When
        int score = bowling.getScore();

        // Then
        Assert.assertEquals(score, 95);
    }
}
