package Animals;

// Класс Летающие
public class Flying extends Birds {
    private String typeMovement; // Тип передвижения

    public Flying(String name, int numYears, String habitat, String typeMovement) {
        super(name, numYears, habitat);
        this.typeMovement = typeMovement;
    }

    // Метод Летать
    public void toFly() {

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
