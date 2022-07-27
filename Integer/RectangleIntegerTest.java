import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Test;

class RectangleTest{

    @Test
    void shouldReturnRectangleAreaWhenBreadthAndHeightGiven(){
        
        Rectangle rectangle = new Rectangle(10,22);

        int result = rectangle.area();

        assertThat(result, is(equalTo(220)));
    }
}