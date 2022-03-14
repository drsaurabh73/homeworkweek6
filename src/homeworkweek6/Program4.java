package homeworkweek6;

public class Program4 {
    int p = 20;//Instance variable
    int q = 30;//Instance variable
    static int r = 40;//Static variable
    static int s = 50;//Static variable

    //main method is a static method

    public static void main(String[] args) {
        Program4 obj = new Program4();
        obj.test4();
        test5();

    }

    //Instance method
    public  void test4(){
        Program4 obj = new Program4();
        System.out.println(obj.p);
        System.out.println(obj.q);
        System.out.println(r);//calling static variable into instance method
        System.out.println(s);//calling static variable into instance method
    }
    //Static method
    public static void test5(){
        Program4 program4 = new Program4();
        System.out.println(r);
        System.out.println(s);
        System.out.println(program4.p);//calling instance variable into static method
        System.out.println(program4.q);//calling instance variable into static method

    }
}
