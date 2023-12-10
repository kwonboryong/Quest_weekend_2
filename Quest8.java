package Quest;

import java.util.Scanner;

// 학생 수를 사용자 입력으로 정함
public class Quest8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("학생 수를 입력하세요: ");
        int studentCount = scanner.nextInt(); // * 행 = (studentCount)로 넣음

        int[][] scores = new int[studentCount][3];
        String[] subjects = {"국어", "영어", "수학"};

        for (int i = 0; i < studentCount; i++) { // 행 (학생)
            System.out.println((i + 1)+ "번 학생의 성적을 입력하세요: ");
            for (int j = 0; j < 3; j++) { // 열 (국영수)
                System.out.print(subjects[j] + " 점수:"); // 입력값 출력
                scores[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < studentCount; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j]; // 과목의 누적 총점
            }
            double average = total / 3.0; // 평균
            System.out.println((i + 1) + "번 학생의 총점: " + total + ", 평균: " + average);
        }
    }
}
