package realestate;

public class Main {
    public static void main(String[] args) {
        RealEstateAgency agency1 = new ApartmentAgency();
        RealEstateAgency agency2 = new HouseAgency();
        RealEstateAgency agency3 = new OfficeAgency();

        agency1.advertise();
        agency2.advertise();
        agency3.advertise();
    }
}
