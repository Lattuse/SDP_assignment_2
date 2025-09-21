package realestate.abstractfactory;

public interface RealEstateFactory {
    Object createProperty();
    LeaseContract createLease();
    SaleContract createSale();
}

