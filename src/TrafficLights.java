import java.util.Arrays;

public class TrafficLights {
    private static boolean isGreenLight;

    public static void setIsGreenLight(boolean isGreenLight) {
        TrafficLights.isGreenLight = isGreenLight;
    }

    public static void getIsGreenLight() {
//        if (isGreenLight) {
//            System.out.println("Светофор зеленый!");
//        } else
//            System.out.println("Светофор красный!");
    }

    public static int numberOfGetOut(int[] speed) {
        if (isGreenLight) {
//            System.out.println("Количество выбывших игроков: 0");
            return 0;
        } else {
            int cnt = 0;

            for (int i : speed) {
                if (i > 0) {
                    cnt++;
                }
            }
//            System.out.println("Количество выбывших игроков: " + cnt);
            return cnt;
        }
    }

    public static int[] toKnowSpeedOut(int[] speeds) {
        if (isGreenLight) {
//            System.out.println("Нет выбывших игроков.");
            return new int[0];
        } else {
            int cnt = 0;
            for (int speed : speeds) {
                if (speed > 0) {
                    cnt++;
                }
            }
            int[] rest = new int[cnt];
            int i = 0;
            for (int speed : speeds) {
                if (speed > 0) {
                    rest[i] = speed;
                    i++;
                }
            }
//            System.out.println("Игроки выбыли со скоростью: " + Arrays.toString(rest));
            return rest;
        }
    }

    public static int[] toKnowStayIn(int[] speeds) {
        if (isGreenLight) {
            return speeds;
        } else {
            int cnt = 0;
            for (int speed : speeds) {
                if (speed == 0) {
                    cnt++;
                }
            }
            int[] rest = new int[cnt];
            int i = 0;
            for (int speed : speeds) {
                if (speed == 0) {
                    rest[i] = speed;
                    i++;
                }
            }
//            System.out.println(Arrays.toString(rest));
            return rest;
        }
    }
}
