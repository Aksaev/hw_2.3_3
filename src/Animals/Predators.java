package Animals;
// Класс Хищники
public class Predators extends Mammals {
    private String typeFood; // Тип пищи

    public Predators(String name, int numYears, String habitat, int speedMovement, String typeFood) {
        super(name, numYears, habitat, speedMovement);
        this.typeFood = typeFood;
    }

    // Метод Охотиться
    public void hunting() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void go() {

    }

    public String getTypeFood() {
        return typeFood;
    }

    public void setTypeFood(String typeFood) {
        this.typeFood = typeFood;
    }
}
