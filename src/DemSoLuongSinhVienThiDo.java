import java.util.Scanner;

public class DemSoLuongSinhVienThiDo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("số lượng sinh viên: ");
        int number = sc.nextInt();
        int[] scores = new int[number];

        for (int i = 0; i < scores.length; i++) {
            System.out.print("Nhập điểm: ");
            int score = sc.nextInt();
            scores[i] = score;
        }
        int  count = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 5 && scores[i] <= 10) {
                count++;
                }
            }
        System.out.println("Tổng số sinh viên đã qua kì thi là: " + count);
        }

}
