import java.util.Scanner;

public class DaoNguocCacPhanTuTrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ dài của mảng: ");
        int n = sc.nextInt();
        int[] array1 = new int[n];
        int[] array2 = new int[n];
        System.out.println("Nhập dữ liệu vào cho mảng: ");
        for (int i = 0; i < array1.length; i++) {
            int number = sc.nextInt();
            array1[i] = number;
        }
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[array1.length - i -1];
        }
        System.out.println("mảng mới: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + "\t");
        }
    }
}
