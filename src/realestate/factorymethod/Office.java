package realestate.factorymethod;

public class Office implements Property {
    @Override
    public void showInfo() {
        System.out.println("Office: 120 m², city center, open space.");
    }
}

