package W13;

public class W13_01_introArray {

    public static void main(String[] args) {
        //  ประกาศตัวแปรชนิด Array แบบที่ 1 - รู้จำนวนล่วงหน้า
        String [] colors = { "Purple", "Cyn", "blue", "Green", "Orange", "Red" };       // ประกาศตัวแปร รุ้ง 7 สี 
        char [] alphabets = { 'A', 'B','C','D','E' };       // ประกาศตัวแปร alphabets
        int [] bank = { 20, 50, 100, 500, 1000};        // ประกาศตัวแปร bank

        //  แสดงผลลัพธ์โดยใช้ index ของ array
        System.out.println("The Frist colore is " + colors[0]);
        System.out.println("The third alphabet is " + alphabets[2]);
        
        // แสดงผลลัพธ์โดยใช้ loop
        System.out.println("colors in the array are:");
        for(int i=0; i < 7 ;i++ ){
            System.out.print(colors[i] + " " );
        }
        System.out.println("=========================================================");
        System.out.println("");
        for(int i=6; i >= 0 ; i-- ){
            System.out.print(colors[i] + " " );
        }
        System.out.println("=========================================================");
        System.out.println("Bank in The array are:");
        for(int i=6; i < bank.length ; i++ ){
            System.out.print(bank[i] + " " );
        }
    }
}