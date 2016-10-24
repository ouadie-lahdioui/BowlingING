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

}
