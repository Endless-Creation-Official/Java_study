package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();

        //data = new Data(); 컴파일에러: 이미 할당된 참조값은 재할당 x
        //참조 대상의 값은 변경 가능
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);

    }
}
