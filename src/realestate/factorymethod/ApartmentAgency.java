package realestate.factorymethod;

public class ApartmentAgency extends RealEstateAgency {
    @Override
    public Property createProperty() {
        return new Apartment();
    }
}



