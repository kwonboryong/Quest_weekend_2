package Quest;

public class Quset1_09 {
    public static void main(String[] args) {
        System.out.println("평균값: " + average(1, 2, 3));
        System.out.println("평균값: " + average(15, 25, 35));
    }
    public static double average(int a, int b, int c) { // int로 값을 받기 때문에 매개변수는 int
        int sum = a + b + c;
        return sum / 3.0; // 평균: 3가지 값이니까 3.0(double)으로 나눠줌
    }
}
