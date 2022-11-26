package Animals;

import Transport.ValidationUtils;

import java.util.Objects;

// Класс Животные
public abstract class Animals {

    private String name; // Кличка животного
    private int numYears; // Количество лет

    protected Animals(String name, int numYears) {
        this.name = ValidationUtils.validOrDefault(name, "default");
        this.numYears = Math.max(numYears, 0);
    }

    // Метод Кушать
    public abstract void eat();

    // Метод Спать
    public void sleep() {
        System.out.printf("%s спит\n", this.name);
    }

    // Метод Перемещаться
    public abstract void go();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumYears() {
        return numYears;
    }

    public void setNumYears(int numYears) {
        this.numYears = numYears;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Animals animals = (Animals) o;
        return numYears == animals.numYears && Objects.equals(name, animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numYears);
    }
}
