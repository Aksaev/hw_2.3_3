package Animals;

// Класс Не летающие
public class NoFlying extends Birds {
    private String typeMovement; // Тип передвижения

    public NoFlying(String name, int numYears, String habitat, String typeMovement) {
        super(name, numYears, habitat);
        this.typeMovement = typeMovement;
    }

    // Метод гулять
    public void walk() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void go() {

    }

    public String getTypeMovement() {
        return typeMovement;
    }

    public void setTypeMovement(String typeMovement) {
        this.typeMovement = typeMovement;
    }
}
