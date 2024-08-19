package W10;

import java.util.Scanner;

public class W10_03_login {
    public static void main(String[] args) {

        String username = "nuag";
        String password = "123";

        Scanner kb = new Scanner(System.in);
        System.out.print(">> กรุณาป้อนชื่อผู้ใข้: ");
        String inputUsername = kb.nextLine();
        System.out.print(">> ป้อนรหัสผ่าน: ");
        String inputPassword = kb.nextLine();

        // ตรวจสอบเงื่อนไข
        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("[SUCCESS] เข้าสู่ระบบสำเร็จ :)");
        } else {
            if (!inputUsername.equals(username) && !inputPassword.equals(password)) {
                System.out.println("[ERROR] ชื่อผู้ใช้และรหัสผ่านไม่ถูกต้อง :(");
            } else {
                if (!inputPassword.equals(password)) {
                    System.out.println("[ERROR] รหัสผ่าน ไม่ถูกต้อง :(");
                } else {
                    System.out.println("[ERROR] ชื่อผู้ใช้ ไม่ถูกต้อง :(");
                }
            }
        }
    }
}