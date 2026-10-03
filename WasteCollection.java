import java.util.Scanner;
class WasteCollection{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vehicleNumber;
        float wasteCollectedInKilograms;
        int numberOfCollectionPoints;
        char vehicleStatus;
        System.out.println("Enter vehicleNumber:");
        vehicleNumber = sc.nextInt();
         System.out.println(" wasteCollectedInKilograms:"); 
          wasteCollectedInKilograms = sc.nextFloat();
         System.out.println("numberOfCollectionPoints:");
           numberOfCollectionPoints = sc.nextInt();
         System.out.println(" vehicleStatus:"); 
         vehicleStatus = sc.next().charAt(0);
         sc.close();
           }
}