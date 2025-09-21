package realestate.abstractfactory;

public class HouseFactory implements RealEstateFactory {
    @Override
    public House createProperty() {
        return new House();
    }
    @Override
    public LeaseContract createLease() {
        return () -> System.out.println("Lease contract for house signed.");
    }
    @Override
    public SaleContract createSale() {
        return () -> System.out.println("Sale contract for house signed.");
    }
}

