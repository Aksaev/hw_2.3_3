package Transport;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(
                "Lada",
                "Grande",
                2018,
                "Россия",
                "Желтый",
                180,
                "Бензин",
                1.7,
                "МКПП",
                "Седан",
                "А001МН177",
                4,
                true,
                new Car.Key(true, true),
                new Car.Insurance(LocalDate.now().plusMonths(3), 1000.0f, "123456789")
        );
//        Transport.Car audiA8 = new Transport.Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "Черный", 3.0);
//        Transport.Car bmwZ8 = new Transport.Car("BMW", "Z8", 2021, "Германия", "Черный", 3.0);
//        Transport.Car kiaSportage4 = new Transport.Car("Kia", "Sportage 4", 2018, "Южная Корея", "Красный", 2.4);
//        Transport.Car hyundaiAvante = new Transport.Car("Hyundai", "Avante", 2016, "Южная Корея", "Оранжевый", 1.6);

        System.out.println("Урок 2.3 ООП. Домашнее задание.");

        System.out.println("--- Class Transport.Car ---");
        System.out.println(car);
        car.refil();

//        System.out.println(audiA8);
//        System.out.println(bmwZ8);
//        System.out.println(kiaSportage4);
//        System.out.println(hyundaiAvante);

        if (!car.getInsurance().isInsuranceValid()) {
            System.out.println("Строховка просрочена!");
        }

        System.out.println("--- Class Transport.Train ---");

        Train trainSwallow = new Train(
                "Поезд Ласточка",
                "B-901",
                2011,
                "Россия",
                "Белый",
                "Дизель",
                301,
                3500,
                1,
                "Белорусский вокзал",
                "Станция Минск-Пассажирский",
                11);

        Train trainLeningrad = new Train(
                "Поезд Ленинград",
                "D-125",
                2019,
                "Россия",
                "Красный",
                "Дизель",
                270,
                1700,
                2,
                "Ленинградский вокзал",
                "Станция Ленинград-Пассажирский",
                8);

        System.out.println(trainSwallow);
        System.out.println(trainLeningrad);
        trainLeningrad.refil();

        System.out.println("--- Class Transport.Bus ---");

        Bus busOne = new Bus(
                "Газель",
                "ГАЗ 41",
                2019,
                "Россия",
                "Желтый",
                60,
                "Бензин");

        Bus busTwo = new Bus(
                "Пазик",
                "ПАЗ 96",
                2009,
                "Россия",
                "Красный",
                50,
                "Дизель");

        Bus busThree = new Bus(
                "МАЗ",
                "МАЗ 12",
                2020,
                "Беларусь",
                "Белый",
                90,
                "Дизель");

        System.out.println(busOne);
        System.out.println(busTwo);
        System.out.println(busThree);
        busThree.refil();

    }
}
