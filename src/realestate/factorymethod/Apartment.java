package realestate.factorymethod;

public class Apartment implements Property {
    @Override
    public void showInfo() {
        System.out.println("Apartment: 2 bedrooms, 60 m², great view.");
    }
}
