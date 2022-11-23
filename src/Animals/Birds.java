package Animals;

// Класс Птицы
public class Birds extends Animals {
    private String habitat; // Среда проживания

    public Birds(String name, int numYears, String habitat) {
        super(name, numYears);
        this.habitat = habitat;
    }

    @Override
    public void eat() {

    }

    @Override
    public void go() {

    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}

