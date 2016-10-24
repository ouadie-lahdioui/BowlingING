/**
 * Created by octo-ola on 24/10/2016.
 */
public class Tour {

    private int firstScore;
    private int secondScore;

    public Tour(int firstScore, int secondScore) {
        this.firstScore = firstScore;
        this.secondScore = secondScore;
    }

    public int getScore() {
        return this.firstScore + this.secondScore;
    }

    @Override
    public String toString() {
        return "[" + this.firstScore + ", " + this.secondScore + "]";
    }
}
