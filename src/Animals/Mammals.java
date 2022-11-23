package Animals;

import java.util.Objects;

// Класс Млекопитающие
public abstract class Mammals extends Animals {
    final String habitat; // Среда проживания
    private final int speedMovement; // Скорость перемещения

    public Mammals(String name, int numYears, String habitat, int speedMovement) {
        super(name, numYears);
        this.habitat = habitat;
        this.speedMovement = speedMovement;
    }

    // Метод Гулять
    public void walking() {
        System.out.printf("%s гуляет %s со скоростью %s\n", this.getName(), speedMovement, habitat);
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
        Mammals mammals = (Mammals) o;
        return speedMovement == mammals.speedMovement && Objects.equals(habitat, mammals.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitat, speedMovement);
    }
}
