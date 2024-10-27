// การรับค่าผ่านทางคีย์บอร์ด - กรณีรับมาหลายค่า//
import java.util.Scanner;

public class MultipleInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("กรอกตัวเลขครั้งที่ " + i + ": ");
            int number = scanner.nextInt();
            total += number;
        }

        System.out.println("ผลรวมตัวเลขทั้งหมดคือ: " + total);
    }
}