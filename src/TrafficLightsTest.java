import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrafficLightsTest {

    @Test
    public void shouldCountNumberOfGetOut() {
        int[] speed = {3, 0, 0};
        int actual = TrafficLights.numberOfGetOut(speed);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldFindSpeedToGetOut() {
        int[] speed = {3, 67, 0};
        int[] actual = TrafficLights.toKnowSpeedOut(speed);
        int[] expected = {3, 67};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindSpeedToStayIn() {
        int[] speed = {3, 67, 0};
        int[] actual = TrafficLights.toKnowStayIn(speed);
        int[] expected = {0};
        Assertions.assertArrayEquals(expected, actual);
    }
}
