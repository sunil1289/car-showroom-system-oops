import java.util.Scanner;

public class Showroom  implements utility{
    String Showroom_name;
    String  Showroom_adress;
    int total_empolyee;
    int  total_car_in_stock;
    String manager_name;


 @Override
 public void get_details(){
     System.out.println("Showroom Name::" + Showroom_name);
     System.out.println("Showroom Adress::" + Showroom_adress);
     System.out.println("Total empolyee is::" + total_empolyee );
     System.out.println("Total car in stock is::" +  total_car_in_stock );
     System.out.println("Manager name is::" + manager_name );

 }
 @Override
 public void  set_details() {
     Scanner sc = new Scanner(System.in);
     System.out.println("-----------------------ENTER SHOWROOM DETAILS------------------------");
     System.out.println();
     System.out.println("Showroom Name::");
     Showroom_name = sc.nextLine();
     System.out.println("Showroom Adress::");
     Showroom_adress = sc.nextLine();
     System.out.println("Total empolyee is::");
     total_empolyee = Integer.parseInt(sc.nextLine());
     System.out.println("Total car in stock is::");
     total_car_in_stock = Integer.parseInt(sc.nextLine());//convert String to int
     System.out.println("Manager name is::");
     manager_name = sc.nextLine();

 }

 }
