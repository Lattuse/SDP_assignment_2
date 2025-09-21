package realestate.abstractfactory;

public class OfficeFactory implements RealEstateFactory {
    @Override
    public Office createProperty() {
        return new Office();
    }
    @Override
    public LeaseContract createLease() {
        return () -> System.out.println("Lease contract for office signed.");
    }
    @Override
    public SaleContract createSale() {
        return () -> System.out.println("Sale contract for office signed.");
    }
}

