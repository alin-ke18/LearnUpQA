import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] speed = {3, 0, 0};
        System.out.println("Количество выбывших игроков: " + TrafficLights.numberOfGetOut(speed));
//        int[] speed2 = {5, 6, 6};
         System.out.println("Игроки выбыли со скоростью: " + Arrays.toString(TrafficLights.toKnowSpeedOut(speed)).replace("[", "").replace("]", ""));

        System.out.println("скорости невыбывающих: " + Arrays.toString(TrafficLights.toKnowStayIn(speed)).replace("[", "").replace("]", ""));
    }
}
