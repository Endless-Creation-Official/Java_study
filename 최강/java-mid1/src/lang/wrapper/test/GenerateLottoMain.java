package lang.wrapper.test;

public class GenerateLottoMain {
    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();
        int[] lottoNum = lottoGenerator.generate();
        System.out.println("로또 번호");
        for (int i : lottoNum) {
            System.out.println(i + " ");
        }
    }
}
