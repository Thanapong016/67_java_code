package W13;

public class W13_03_Array_CountOddEven {
    public static void main(String[] args) {
        // ให้นับเลขคู่เลขที่ใน Array ด้านล่าง
        int [] numbers = {1, 4, 6, 7, 55, 77, 88, 9, 16, 13, 18, 20, 21, 30, 32, 44};
        
        int countOdd = 0;
        int countEven = 0;

        for (int i =0; i < numbers.length ; i++) {
            System.out.print(numbers[i] + " ");
            if(numbers[i] % 2 ==0){
                countEven++;
            }else{
                countOdd++;
            }
        }
        System.out.println("\nAmount of all Number : " + numbers.length);
        System.out.println("\nAmount of Odd Number : " + countOdd);
        System.out.println("\nAmount of Even Number : " + countEven);
        
    }
}
