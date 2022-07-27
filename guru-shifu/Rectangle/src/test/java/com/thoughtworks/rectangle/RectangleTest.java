import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.closeTo;
import org.junit.jupiter.api.Test;

class RectangleTest{

    @Test
    void shouldReturnRectangleAreaWhenBreadthAndHeightGiven(){

        Rectangle rectangle = new Rectangle(12.5,2.0);

        double result = rectangle.area();

        assertThat(result,is(closeTo(25.0,0.001)));
    }

    @Test
    void shouldReturnRectanglePerimeterWhenBreadthAndHeightGiven(){

        Rectangle rectangle = new Rectangle(10.5,5);

        double result = rectangle.perimeter();

        assertThat(result, is(closeTo(31.0,0.001)));
    }
}