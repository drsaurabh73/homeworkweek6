package homeworkweek6;

public class Program2 {
    static String cusname = "Bhrambhatt";// static variable - created inside the class and outside the constructor (method).
    static String customer = " Mukund";//static variable

    public static void main(String[] args) {

        test();//calling static method
    }

// static method
    public static void test(){
       // Program2 program2 = new Program2();
        System.out.print(cusname);
        System.out.println(customer);
        System.out.println();
    }

}
