package W15;

public class W15_04_method_findMaxMin {

    // 1) Method สำหรับหาค่ามากที่สุด
    static int FindMax(int a, int b) {
        //     if (a >b) {
        //         return  a;
        //     }else{
        //         return b;
        //     }
        // }
        return (a > b) ? a : b; //ใช้เงื่อนไขแบบ ternary operrator
    }
    // 2) Method สำหรับหาค่าน้อยที่สุด

    static int FindMin(int a, int b) {
        // if (a < b) {
        //     return a;
        // } else {
        //     return b;
        // }
        return (a < b) ? a : b; //ใช้เงื่อนไขแบบ ternary operrator
    }

    // 3) Method สำหรับหาค่ามากที่สุด โดยรับค่า 3 ตัว
    static int FindMax(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    // 4) Method สำหรับหาค่าน้อยที่สุด โดยรับค่าเป็น array
    static int findMin(int[] numbers) {
        displayarray(numbers);
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    // 5) Method สำหรับแสดงค่าใน array ทั้งหมด
    static void displayarray(int[] number) {
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 1) Method สำหรับหาค่ามากที่สุด
        System.out.println("ค่ามากที่สุด[10, 20 ] คือ  " + FindMax(10, 20));

        // 2) Method สำหรับหาค่าน้อยที่สุด
        System.out.println("ค่าน้อยที่สุด [10, 20 ] คือ " + FindMin(10, 20));

        // 3) Method สำหรับหาค่ามากที่สุด โดยรับค่า 3 ตัว
        System.out.println("ค่ามากที่สุด [10, 20 ,15]คือ " + FindMax(10, 20, 15));

        // 4) Method สำหรับหาค่าน้อยที่สุด โดยรับค่าเป็น array
        int[] numbers = {10, 20, 30, 40, 50};
        // displayarray(numbers);
        System.out.println("Min number in array is " + findMin(numbers));

    }
}

// method ที่มีชื่อเดียวกัน แต่มีพารามิเตอร์ต่างกันได้ เรียกว่า Method Overloading
// การเรียกใช้ method ที่มีชื่อเดียวกัน จะขึ้นอยู่กับพารามิเตอร์ที่ส่งเข้าไป
// ถ้ามี method ที่มีชื่อเดียวกัน และมีพารามิเตอร์ต่างกัน จะต้องมีการส่งพารามิเตอร์ตามที่ method ต้องการ