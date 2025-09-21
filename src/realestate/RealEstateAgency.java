package realestate;

public abstract class RealEstateAgency {
    public abstract Property createProperty();

    public void advertise() {
        Property p = createProperty();
        System.out.print("Advertising -> ");
        p.showInfo();
    }
}
