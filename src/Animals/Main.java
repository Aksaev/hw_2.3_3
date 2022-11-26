package Animals;

public class Main {
    public static void main(String[] args) {

        System.out.println("-----------------");
        System.out.println("Травоядные:");
        System.out.println("-----------------");

        Herbivores gazelle = new Herbivores("Газель", 5, "степи", 50, "травой");
        Herbivores giraffe = new Herbivores("Жираф", 2, "тропической степи", 55, "листьями с деревьев");
        Herbivores horse = new Herbivores("Лошадь", 3, "поле", 60, "сеном");

        gazelle.go();
        gazelle.eat();

        giraffe.go();
        giraffe.eat();

        horse.go();
        horse.eat();

        System.out.println("-----------------");
        System.out.println("Хищники:");
        System.out.println("-----------------");

        Predators hyena = new Predators("Гиена", 4, "по саванне", 40, "больных и слабых животных");
        Predators tiger = new Predators("Тигр", 10, "в тропическом лесу", 50, "животных");
        Predators bear = new Predators("Медведь", 7, "по лесу", 40, "животных и рыбу");

        hyena.eat();
        hyena.go();

        tiger.eat();
        tiger.go();

        bear.eat();
        bear.go();

        System.out.println("-----------------");
        System.out.println("Земноводные:");
        System.out.println("-----------------");

        Amphibians frog = new Amphibians("Лягушка", 1, "на болоте");
        Amphibians alreadyFreshwater = new Amphibians("Уж пресноводный", 2, "на реке");

        frog.eat();
        frog.go();

        alreadyFreshwater.eat();
        alreadyFreshwater.go();

        System.out.println("-----------------");
        System.out.println("Нелетающие птицы:");
        System.out.println("-----------------");

        NoFlying peacock = new NoFlying("Павлин", 2, "","джунглях");
        NoFlying penguin = new NoFlying("Пингвин", 1, "", "льду и снегу");
        NoFlying birdDodo = new NoFlying("Птица Додо", 6, "", "земле");

        peacock.go();
        peacock.eat();

        penguin.go();
        penguin.eat();

        birdDodo.go();
        birdDodo.eat();

        System.out.println("-----------------");
        System.out.println("Летающие птицы:");
        System.out.println("-----------------");

        Flying seagull = new Flying("Чайка", 3, "","около рек и морей");
        Flying albatross = new Flying("Альбатрос", 2, "", "в Антарктиде");
        Flying falcon = new Flying("Сокол", 4, "", "в пустыне, тундре, тайге, лесах");

        seagull.go();
        seagull.eat();

        albatross.go();
        albatross.eat();

        falcon.go();
        falcon.eat();

    }
}