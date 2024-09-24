import java.util.Scanner;
import java.util.UUID;

public class Cars extends Showroom implements utility {
    String car_name;
    String car_color;
    String car_fuel_type;
    int car_price;
    String car_type;
    String car_transmisson;

    @Override
    public void get_details() {
        System.out.println(" Name  is::" + car_name);
        System.out.println("Color  is ::" + car_color);
        System.out.println("Fuel type age is::" + car_fuel_type);
        System.out.println("Price  is::" + car_price);
        System.out.println("Transmission  is::" + car_transmisson);
        System.out.println("Car type is " + car_type);
    }
    @Override
    public void  set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("...................................enter car details...................................");
        System.out.println();
        System.out.println("car name::");
        car_name = sc.nextLine();
        System.out.println("color is::");
        car_color = sc.nextLine();
        System.out.println("car fuel type is::");
        car_fuel_type = sc.nextLine();
        System.out.println("price is::");
        car_price = Integer.parseInt(sc.nextLine());
        sc.nextLine();
        System.out.println("transmisson is");
        car_transmisson = sc.nextLine();
        System.out.println("showroom name is::");
        Showroom_name= sc.nextLine();
        total_car_in_stock++;

    }

}


