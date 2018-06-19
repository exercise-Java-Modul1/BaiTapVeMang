import java.util.Scanner;

public class TimGiaTriLonNhatTrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mảng của bạn có bao nhiêu số?: ");
        int n = sc.nextInt();

        int[] list = new int[n];
        for (int i = 0; i < list.length; i++) {
            System.out.print("input number: ");
            int num = sc.nextInt();
            list[i] = num;
        }
        int max = list[0];
        int count = 0;
        for (int i = 1; i < list.length; i++) {
            if (max < list[i]) {
                max = list[i];
                count = i + 1;
            }
        }
        System.out.println("Giá trị lớn nhất trong dãy số là: " + max + ",at position " + count);
    }
}
