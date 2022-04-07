import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] speed = {3, 0, 0};
        TrafficLights.setIsGreenLight(false);
        TrafficLights.getIsGreenLight();
//        TrafficLights.numberOfGetOut(speed);
//        Arrays.toString(TrafficLights.toKnowSpeedOut(speed));
        TrafficLights.toKnowStayIn(speed);
    }
}
