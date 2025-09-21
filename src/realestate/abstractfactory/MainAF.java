package realestate.abstractfactory;

import java.util.Scanner;

public class MainAF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose property set:");
        System.out.println("1 - Apartment");
        System.out.println("2 - House");
        System.out.println("3 - Office");
        int choice = sc.nextInt();
        sc.close();

        RealEstateFactory factory;
        switch (choice) {
            case 1 -> factory = new ApartmentFactory();
            case 2 -> factory = new HouseFactory();
            case 3 -> factory = new OfficeFactory();
            default -> factory = new ApartmentFactory();
        }

        Object property = factory.createProperty();
        if (property instanceof Apartment a) a.show();
        if (property instanceof House h) h.show();
        if (property instanceof Office o) o.show();

        factory.createLease().sign();
        factory.createSale().sign();
    }
}

