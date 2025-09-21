package realestate.factorymethod;

import java.util.Scanner;

public class MainFM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose property type:");
        System.out.println("1 - Apartment");
        System.out.println("2 - House");
        System.out.println("3 - Office");
        int choice = sc.nextInt();
        sc.close();

        RealEstateAgency agency;
        switch (choice) {
            case 1 -> agency = new ApartmentAgency();
            case 2 -> agency = new HouseAgency();
            case 3 -> agency = new OfficeAgency();
            default -> agency = new ApartmentAgency();
        }
        agency.advertise();
    }
}
