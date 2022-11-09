package Animals;

import java.util.Objects;

// Класс Травоядные
public class Herbivores extends Mammals {
    private final String typeFood; // Тип пищи

    public Herbivores(String name, int numYears, String habitat, int speedMovement, String typeFood) {
        super(name, numYears, habitat, speedMovement);
        this.typeFood = typeFood;
    }

    // Метод Пастись
    public void grazing() {
        System.out.printf("%s пасется на %s\n", this.getName(), this.typeFood);
    }

    @Override
    public void eat() {

    }

    @Override
    public void go() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivores that = (Herbivores) o;
        return Objects.equals(typeFood, that.typeFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeFood);
    }
}
