package homeworkweek6;

public class Program5 {
    int m = 20;//Instance variable
    int n = 30;//Instance variable
    static int o = 40;//Static variable
    static int t = 50;//Static variable

    public static void main(String[] args) {
    Program5 obj = new Program5();
    obj.test9();//calling instance method
    obj.test11();//calling instance method
    test10();//calling static method
    test12();//calling static method
    }
    //Instance method
    public void test9() {
        Program5 obj = new Program5();
        System.out.print("sum = m + n = ");
        System.out.println(m + n);
    }
        //Instance method
        public void test11() {
        Program5 obj = new Program5();
        System.out.print("multiply = m x n = ");
        System.out.println( m * n);

    }
    //static method
    public static void test10() {
        System.out.print("sum = o + t = ");
        System.out.println(o + t);
    }
        //static method
        public static void test12(){
        System.out.print("divide = o / t = ");
        System.out.println(o / t);

    }
}
