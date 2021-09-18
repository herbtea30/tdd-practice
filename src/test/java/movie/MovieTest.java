package movie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Name : MovieTest <br/>
 * Description : Create a description.
 */
public class MovieTest {

    private Movie movie;

    @BeforeEach
    void setUp() {
        movie = new Movie();
    }

    @Test
    public void should_return_0_when_just_created() {
        assertThat(movie.averageRatring(), is(0));
    }

    @Test
    public void should_return_1_when_1_was_rated() {
        movie.rate(1);
        assertThat(movie.averageRatring(), is(1));
    }

    @Test
    public void should_return_4_when_3_and_5_was_rated() {
        movie.rate(3);
        movie.rate(5);
        assertThat(movie.averageRatring(), is(4));
    }
}
