package Transport;

public class Train extends Transport {
    private double priceTrip;
    private int timeTravel;
    private String firstNameStation;
    private String endNameStation;
    private int countWagon;

    public Train(String brand,
                 String model,
                 int productionYear,
                 String productionCountry,
                 String color,
                 String fuelType,
                 int speed,
                 double priceTrip,
                 int timeTravel,
                 String firstNameStation,
                 String endNameStation,
                 int countWagon) {

        super(brand, model, productionYear, productionCountry, color, speed, fuelType);

        setPriceTrip(priceTrip);
        setTimeTravel(timeTravel);
        setFirstNameStation(firstNameStation);
        setEndNameStation(endNameStation);
        setCountWagon(countWagon);
    }

    public double getPriceTrip() {
        return priceTrip;
    }

    public void setPriceTrip(double priceTrip) {
        this.priceTrip = Math.max(priceTrip, 1);
    }

    public int getTimeTravel() {
        return timeTravel;
    }

    public void setTimeTravel(int timeTravel) {
        this.timeTravel = Math.max(timeTravel, 1);
    }

    public String getFirstNameStation() {
        return firstNameStation;
    }

    public void setFirstNameStation(String firstNameStation) {
        this.firstNameStation = ValidationUtils.validOrDefault(firstNameStation, "default");
    }

    public String getEndNameStation() {
        return endNameStation;
    }

    public void setEndNameStation(String endNameStation) {
        this.endNameStation = ValidationUtils.validOrDefault(endNameStation, "default");
    }

    public int getCountWagon() {
        return countWagon;
    }

    public void setCountWagon(int countWagon) {
        this.countWagon = Math.max(countWagon, 1);
    }

    @Override
    public void refil() {
        System.out.printf("  Поезд %s нужно заправлять %s. \n", getModel(), this.fuelType);
    }

    @Override
    protected String checkFuelType(String fuelType) {
        if ("Дизель".contains(fuelType)) {
            return "дизелем";
        } else {
            return fuelType;
        }
    }

    @Override
    public String toString() {
        return getBrand() + ":\n" +
                "  - Модель: " +getModel() + "\n" +
                "  - Год выпуска: " + getProductionYear() + "\n" +
                "  - Страна производства: " + getProductionCountry() + "\n" +
                "  - Скорость передвежения: " + getSpeed() + " км/ч\n" +
                "  - Отходит от: " + getFirstNameStation() + "\n" +
                "  - Следует до: " + getEndNameStation() + "\n" +
                "  - Цена поездки: " + getPriceTrip() + " рублей\n" +
                "  - Вагонов: " + getCountWagon();
    }

}