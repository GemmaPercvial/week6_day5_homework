public enum BedroomTypes {
    SINGLE("single", 50.00),
    DOUBLE("double", 70.00),
    FAMILY("family", 100.00);

    private String bedroomType;
    private double nightlyRate;

    BedroomTypes(String bedroomType, double nightlyRate) {
        this.bedroomType = bedroomType;
        this.nightlyRate = nightlyRate;
    }

    public String getBedroomType() {
        return bedroomType;
    }

    public double getNightlyRate() {
        return nightlyRate;
    }
}
