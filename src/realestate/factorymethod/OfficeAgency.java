package realestate.factorymethod;

public class OfficeAgency extends RealEstateAgency {
    @Override
    public Property createProperty() {
        return new Office();
    }
}

