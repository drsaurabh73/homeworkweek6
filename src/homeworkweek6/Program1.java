package homeworkweek6;

public class Program1 {
    String employee = "Sales";//instance variable
    String position = " Manager";//instance variable
    //Variable which are declare inside a class but outside the methods those variables are colled instance variable
    public void Customer()  {
        System.out.println(employee + position);
    }

    public static void main(String[] args) {
        Program1 obj = new Program1();
        obj.Customer();//calling instance method


    }



}
