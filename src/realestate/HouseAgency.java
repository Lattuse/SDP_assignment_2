package realestate;

public class HouseAgency extends RealEstateAgency {
    @Override
    public Property createProperty() {
        return new House();
    }
}

