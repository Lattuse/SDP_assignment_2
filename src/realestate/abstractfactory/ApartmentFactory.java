package realestate.abstractfactory;

public class ApartmentFactory implements RealEstateFactory {
    @Override
    public Apartment createProperty() {
        return new Apartment();
    }
    @Override
    public LeaseContract createLease() {
        return () -> System.out.println("Lease contract for apartment signed.");
    }
    @Override
    public SaleContract createSale() {
        return () -> System.out.println("Sale contract for apartment signed.");
    }
}

