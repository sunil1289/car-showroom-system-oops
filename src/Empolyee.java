import java.util.*;
public class  Empolyee extends Showroom implements utility{
    String emp_id;
    String emp_name;
    int emp_age;
    String emp_department;


@Override
public void get_details() {
    System.out.println("empolyee id  is::" + emp_id);
    System.out.println("empolyee name is ::" + emp_name);
    System.out.println("empolyee age is::" + emp_age);
    System.out.println("empolyee department is::" + emp_department);
    System.out.println("showroom name " + Showroom_name );
}
@Override
public void  set_details() {
    Scanner sc = new Scanner(System.in);
    UUID uuid = UUID.randomUUID();
    emp_id = String.valueOf(uuid);
    System.out.println("...................................enter empolyee details...................................");
    System.out.println();
    System.out.println("empolyee name::");
    emp_name = sc.nextLine();
    System.out.println("empolyee agre::");
    emp_age = Integer.parseInt(sc.nextLine());
    sc.nextLine();
    System.out.println("showroom name is::");
    Showroom_name= sc.nextLine();

    System.out.println("department is::");
    emp_department = sc.nextLine();

}

 }
