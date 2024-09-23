public class W13_Homework {

  public static void main(String[] args) {

      // นับจำนวนคู่คี่ใน Array ด้านล่าง
      int [] number = {1, 5, 6, 11, 8, 7, 2, 23, 55, 64, 98, 64, 67, 99, 78};

      int countOdd = 0;
      int countEven = 0;

      for (int i = 0; i < number.length; i++) {
          if (number[i] % 2 == 0) {
              System.out.println(number[i] + " is Even");
              countEven++;
          } else {
              System.out.println(number[i] + " is Odd");
              countOdd++;
          }
      }

      System.out.println("\nAmount of all Numbers: " + number.length);
      System.out.println("Amount of Odd Numbers: " + countOdd);
      System.out.println("Amount of Even Numbers: " + countEven);
  }

}