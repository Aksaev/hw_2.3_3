package Animals;

import java.util.Objects;

// Класс Земноводные
public class Amphibians extends Animals {
    private final String habitat; // Среда проживания

    public Amphibians(String name, int numYears, String habitat) {
        super(name, numYears);
        this.habitat = habitat;
    }

    // Метод Охотиться
    public void hunting() {
        System.out.printf("%s охотиться на %s.\n", this.getName(), this.habitat);
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
        Amphibians that = (Amphibians) o;
        return Objects.equals(habitat, that.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitat);
    }
}
