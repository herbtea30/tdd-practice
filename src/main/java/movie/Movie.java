package movie;

/**
 * Name : Movie <br/>
 * Description : Create a description.
 */
public class Movie {

    private int sumOfRate = 0;
    private int countOfRate = 0;

    public Integer averageRatring() {
        return countOfRate == 0 ? 0 : sumOfRate / countOfRate;
    }

    public void rate(int rate) {
        this.sumOfRate += rate;
        countOfRate++;
    }
}
