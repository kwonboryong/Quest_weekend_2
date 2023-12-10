package Quest;

import java.util.Scanner;

public class Quest7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] scores = new int[4][3]; // 2차원 배열 - 학생 4명: 행(가로), 과목(국영수): 열(세로)
        String[] subjects = {"국어", "영어", "수학"}; // 과목 배열

        for (int i = 0; i < 4; i++) { // 행 (학생)
            System.out.println((i + 1)+ "번 학생의 성적을 입력하세요: ");
            for (int j = 0; j < 3; j++) { // 열 (국영수)
                System.out.print(subjects[j] + " 점수:");
                scores[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < 4; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j]; // 과목의 누적 총점
            }
            double average = total / 3.0; // 평균
            System.out.println((i + 1) + "번 학생의 총점: " + total + ", 평균: " + average);
        }
    }
}
