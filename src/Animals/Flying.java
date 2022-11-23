package Animals;

// Класс Летающие
public class Flying extends Birds {
    private String typeMovement; // Тип передвижения

    public Flying(String name, int numYears, String habitat, String typeMovement) {
        super(name, numYears, habitat);
        this.typeMovement = typeMovement;
    }

    @Override
    public void eat() {

    }

    @Override
    public void go() {
        System.out.printf("%s летает %s.\n", this.getName(), this.typeMovement);
    }

    public String getTypeMovement() {
        return typeMovement;
    }

    public void setTypeMovement(String typeMovement) {
        this.typeMovement = typeMovement;
    }
}
