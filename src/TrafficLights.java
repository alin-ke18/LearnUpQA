

public class TrafficLights {
    //public static int cnt = 0;
    public static int numberOfGetOut (int[] speed)  {
        int cnt = 0;
        for (int i : speed ) {
            if (i > 0) {
                cnt ++;
            }
        }
        return cnt;
    }
    public static int[] toKnowSpeedOut (int[] speeds) {
        int cnt = 0;
        for (int speed : speeds ) {
            if (speed > 0) {
                cnt ++;
            }
        }
//        new int[cnt] = numberOfGetOut(toKnowSpeedOut(int[]));
//        int[] cnt2 = numberOfGetOut(cnt[]);
//        numberOfGetOut();
        int[] rest = new int[cnt];
        int i = 0;
        for (int speed : speeds) {
            if (speed > 0) {
                rest[i] = speed;
                i++;
            }
        }
//        System.out.println(Arrays.toString((rest)));


//        for (int v : rest)
//            System.out.println(v);
        return rest;
    }

    public static int[] toKnowStayIn (int[] speeds) {
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
//        System.out.println(Arrays.toString((rest)));


//        for (int v : rest)
//            System.out.println(v);
        return rest;
    }
}
