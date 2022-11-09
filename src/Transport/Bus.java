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
        System.out.println("Автобус нужно заправлять " + this.fuelType);
    }

    @Override
    protected String checkFuelType(String fuelType) {
        if ("Дизель".contains(fuelType)) {
            return "дизелем";
        } else {
            return "бензином";
        }
    }

    @Override
    public String toString() {
        return getBrand() + ":\n" +
                "  - Модель: " +getModel() + "\n" +
                "  - Цвет: " + getColor() + "\n" +
                "  - Год выпуска: " + getProductionYear() + "\n" +
                "  - Страна производства: " + getProductionCountry() + "\n" +
                "  - Скорость передвежения: " + getSpeed() + " км/ч" + "\n" +
                "  - Тип топлива: " + checkFuelType(fuelType);
    }


}
