package homeworkweek6;
public class Program16 {

    public static void main(String[] args) {
        // java program to add to binary numbers
        System.out.println("java program to add two binary number");
        String binarynumber1 = "10", binarynumber2 = "11";
                //converting string into binary format numbers
        int integer1 = Integer.parseInt(binarynumber1, 2);
        int integer2 = Integer.parseInt(binarynumber2, 2);
        // adding two integers
        Integer output = integer1 + integer2;
        // converting final output back to Binary Integer
        System.out.println("output: " + Integer.toBinaryString(output));


    }
}
