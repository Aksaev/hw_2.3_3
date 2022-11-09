package Animals;

public class Main {
    public static void main(String[] args) {
        Herbivores gazelle = new Herbivores("Газель", 5, "Савана", 30, "Трава");
        Herbivores horse = new Herbivores("Лошадь", 3, "Поле", 50, "Трава");
        gazelle.eat();
        gazelle.go();
        gazelle.grazing();


        Amphibians frog = new Amphibians("Лягушка", 1, "болоте");
        frog.hunting();
        Amphibians alreadyFreshwater = new Amphibians("Уж пресноводный", 2, "реке");
        alreadyFreshwater.hunting();

    }
}