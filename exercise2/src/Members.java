
public class Members{

    String name;
    int age;
    float salary;


}
class MembersMain {

    public static void main(String[] args){

        Members ob=new Members();

        ob.name="prasanna";
        ob.age=22;
        ob.salary=20000;

        System.out.println("Members Name : " +ob.name);
        System.out.println("Members Age : " +ob.age);
        System.out.println("Members Salary : " +ob.salary);

    }

}

