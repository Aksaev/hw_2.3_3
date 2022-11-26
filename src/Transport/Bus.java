package Transport;

public class Bus extends Transport {

    public Bus(String brand,
               String model,
               int productionYear,
               String productionCountry,
               String color,
               int speed,
               String fuelType) {
        super(brand, model, productionYear, productionCountry, color, speed, fuelType);
    }

    @Override
    public void refil() {
        System.out.printf("  Автобус %s нужно заправлять %s. \n", getModel(), this.fuelType);
    }

    @Override
    protected String checkFuelType(String fuelType) {
        if ("Бензин".contains(fuelType)) {
            return "бензином";
        } else {
            return "дизелем";
        }
    }

    @Override
    public String toString() {
        return getBrand() + ":\n" +
                "  - Модель: " +getModel() + "\n" +
                "  - Цвет: " + getColor() + "\n" +
                "  - Год выпуска: " + getProductionYear() + "\n" +
                "  - Страна производства: " + getProductionCountry() + "\n" +
                "  - Скорость передвежения: " + getSpeed() + " км/ч";
    }


}
