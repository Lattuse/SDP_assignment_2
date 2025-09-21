package realestate.factorymethod;

public class House implements Property {
    @Override
    public void showInfo() {
        System.out.println("House: 3 bedrooms, garden, garage.");
    }
}

