package lang.wrapper.test;

import java.util.Random;

public class LottoGenerator {
    private int count;
    private int[] lottoNum;
    Random random = new Random();

    public int[] generate() {
        lottoNum = new int[6];
        count = 0;

        while (count < 6) {
            int randomNum = random.nextInt(45) + 1;
            if (isUnique(randomNum)) {
                count++;
                lottoNum[count] = randomNum;
            }
        }
        return lottoNum;
    }

    private boolean isUnique(int randomNum) {
        for (int i = 0; i < count; i++) {
            if (lottoNum[i] == randomNum) {
                return false;
            }
        }
        return true;
    }


}
