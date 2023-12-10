package Quest;

// 배열 문제풀이 1
// 배열 사용하기

public class Quest1 {
    public static void main(String[] args) {
        int[] student = new int[] {90, 80, 70, 60, 50};

        int total = 0;
        for (int i = 0; i < student.length; i++) {
            total += i;
        }
        /*for (int j : student) { // for문에서 'alt + 엔터' 누르면 향상된 for문으로 자동 변경
            total += j;
        }*/
        double average = (double) total / 5;
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);

    }
}