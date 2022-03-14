package homeworkweek6;

public class Program3 {
    static String  name = "Narendra Modi";//static variable
    int  n = 8;//instance variable

    public static void main(String[] args) {
       // Program3 program3 = new Program3();
        Program3 obj = new Program3();
        test7();//calling static method
        obj.test8();//calling instance method
    }
    //Static method
    public static void test7(){
        Program3 program3 = new Program3();
        System.out.println(name);//calling static variable into static mehtod
        System.out.println(program3.n);//calling instance variable into static method
    }
    //Instance method
    public void test8(){
        Program3 obj = new Program3();
        System.out.println(obj.n);//calling instance variable into instance method
        System.out.println(name);//calling static variable into instance method

    }

}
