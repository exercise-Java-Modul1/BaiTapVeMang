import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] studens = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter a name’s student: ");
            String name = sc.nextLine();
            int dem = 1;
            for (int i = 0; i < studens.length; i++) {
                if (studens[i].equals(name)) {
                    System.out.println("Position of the students in the list " + name + " is " + (i + 1));
                    dem++;
                    break;
                }
            }
            if (dem == 1) {
                System.out.println("Not found" + name + " in the list.");
            }

    }
}
