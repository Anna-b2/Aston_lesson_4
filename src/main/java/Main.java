import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
 {
    Park park = new Park();
    Park.Attractions first_attraction = new Park.Attractions("Солнце", "10:00-20:00", "12 руб.");
    System.out.println("Список аттракционов:");
    System.out.println(first_attraction.getName());
     System.out.println(first_attraction.getTimeOfWork());
     System.out.println(first_attraction.getCost());
}
}
