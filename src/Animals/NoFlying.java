package Animals;

// Класс Не летающие
public class NoFlying extends Birds {
    private String typeMovement; // Тип передвижения


    public NoFlying(String name, int numYears, String habitat, String typeMovement) {
        super(name, numYears, habitat);
        this.typeMovement = typeMovement;
    }

    @Override
    public void eat() {
        System.out.printf("%s питается насекомыми и рыбой.\n", this.getName());
    }

    @Override
    public void go() {
        System.out.printf("%s гуляет по %s.\n", this.getName(), this.typeMovement);
    }

    public String getTypeMovement() {
        return typeMovement;
    }

    public void setTypeMovement(String typeMovement) {
        this.typeMovement = typeMovement;
    }
}
