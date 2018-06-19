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
        for (int i = 0; i < list.length; i++) {
            for (int j = 1; j < list.length; j++) {
                if (list[i] > list[j]) {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
