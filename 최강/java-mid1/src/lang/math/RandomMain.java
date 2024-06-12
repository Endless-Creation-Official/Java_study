package lang.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
        Random random = new Random();
        int nextInt = random.nextInt();
        System.out.println("randomInt:" + nextInt);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBolean" + randomBoolean);

        int i = random.nextInt(10);
        System.out.println("0-9까지 랜덤:" + i);

        int randomRange1 = random.nextInt(10) + 1;
        // 1-10까지의 랜덤수
        System.out.println("1부터10까지의 랜덤수:" + randomRange1);

    }
}
