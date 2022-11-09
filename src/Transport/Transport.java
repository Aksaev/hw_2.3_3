package Transport;

public abstract class Transport {

    private final String brand;
    private final String model;
    private final int productionYear;
    private final String productionCountry;
    private String color;
    private int speed;
    protected final String fuelType;

    public Transport(String brand,
                     String model,
                     int productionYear,
                     String productionCountry,
                     String color,
                     int speed,
                     String fuelType) {

        this.brand = ValidationUtils.validOrDefault(brand, "default");
        this.model = ValidationUtils.validOrDefault(model, "default");
        this.productionYear = Math.max(productionYear, 0);
        this.productionCountry = ValidationUtils.validOrDefault(productionCountry, "Россия");
        this.fuelType = checkFuelType(fuelType);
        setColor(color);
        setSpeed(speed);
    }

    public abstract void refil();
    protected abstract String checkFuelType(String fuelType);

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = ValidationUtils.validOrDefault(color, "Белый");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = Math.max(speed, 0);
    }

}