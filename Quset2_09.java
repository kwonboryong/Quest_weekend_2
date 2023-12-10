package Quest;

public class Quset2_09 {
    public static void main(String[] args) {
        String message = "Hello, world!";

       printMessage(message, 3);
       printMessage(message, 5);
       printMessage(message, 7);
    }

    public static void printMessage (String message, int times) {
                                  // 문자(message)를 몇 번(times) 반복할 지
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
}
