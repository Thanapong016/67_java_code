package W13;

import java.util.Scanner;

public class W13_02_introArray {
    public static void main(String[] args) {
        //  ประกาศตัวแปรชนิด Array แบบที่ 2 - ไม่รู้จำนวนล่วงหน้า
        String [] brandsCars = new String[3];

        Scanner kb = new Scanner(System.in);

        // กำหนดค่าให้กับ Array
        brandsCars[0] = "Toyota";
        brandsCars[1] = "Honda";
        brandsCars[2] = "Nissan";
        
        // แสดงผล โดยใช้ loop
        System.out.println("Old Brand of cars in the array are:");
        for ( int i = 0 ; i < brandsCars.length; i++) {
            System.out.print(brandsCars[i] + " / ");
        }

        // แก้ไข้ค่าใน Array โดยรับค่าจากคีย์บอร์ด
        System.out.println("\n\nPlease enter the brand of the 3rd car:");
        for (int i=0; i <brandsCars.length ; i++) {
            System.out.print("Enter brand " + (i+1) + ": ");
            brandsCars[i] = kb.next();

        }

        System.out.println("\nNew Brand of cars in the array are:");
        for (String car : brandsCars) { //  ใช้ for-each loop
            System.out.print(car + " / ");
        }
    }
}
