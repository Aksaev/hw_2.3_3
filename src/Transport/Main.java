package Transport;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car ladaGranta = new Car(
                "Lada",
                "Granta",
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

        Car audiA8 = new Car(
                "Audi",
                "A8 50 L TDI quattro",
                2020,
                "Германия",
                "Черный",
                250,
                "Дизель",
                3.0,
                "АКПП",
                "Седан",
                "Б002АА163",
                5,
                true,
                new Car.Key(true, true),
                new Car.Insurance(LocalDate.now().plusMonths(3), 2000.0f, "223344550"));

        Car bmwZ8 = new Car(
                "BMW",
                "Z8",
                2021,
                "Германия",
                "Черный",
                200,
                "Дизель",
                2.0,
                "АКПП",
                "Седан",
                "В144РА799",
                4,
                false,
                new Car.Key(true, true),
                new Car.Insurance(LocalDate.now().plusMonths(3), 1500.0f, "203040599"));

        Car kiaSportage4 = new Car(
                "Kia",
                "Sportage 4",
                2018,
                "Южная Корея",
                "Красный",
                250,
                "Бензин",
                2.4,
                "АКПП",
                "Кроссовер",
                "П568ГГ187",
                5,
                false,
                new Car.Key(true, true),
                new Car.Insurance(LocalDate.now().plusMonths(3), 5000.0f, "100005678"));

        Car hyundaiAvante = new Car(
                "Hyundai",
                "Avante",
                2016,
                "Южная Корея",
                "Оранжевый",
                180,
                "Бензин",
                1.6,
                "МКПП",
                "Седан",
                "О848МР777",
                4,
                true,
                new Car.Key(true, true),
                new Car.Insurance(LocalDate.now().plusMonths(3), 1000.0f, "220004587"));

        System.out.println("--- Class Transport.Car ---");

        System.out.println(ladaGranta);
        ladaGranta.refil();
        if (!ladaGranta.getInsurance().isInsuranceValid()) { System.out.println("  Строховка просрочена!"); }

        System.out.println(audiA8);
        audiA8.refil();
        if (!audiA8.getInsurance().isInsuranceValid()) { System.out.println("  Строховка просрочена!"); }

        System.out.println(bmwZ8);
        bmwZ8.refil();
        if (!bmwZ8.getInsurance().isInsuranceValid()) { System.out.println("  Строховка просрочена!"); }

        System.out.println(kiaSportage4);
        kiaSportage4.refil();
        if (!kiaSportage4.getInsurance().isInsuranceValid()) { System.out.println("  Строховка просрочена!"); }

        System.out.println(hyundaiAvante);
        hyundaiAvante.refil();
        if (!hyundaiAvante.getInsurance().isInsuranceValid()) { System.out.println("  Строховка просрочена!"); }

        System.out.println("\n--- Class Transport.Train ---");

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
        trainSwallow.refil();
        System.out.println(trainLeningrad);
        trainLeningrad.refil();

        System.out.println("\n--- Class Transport.Bus ---");

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
        busOne.refil();
        System.out.println(busTwo);
        busTwo.refil();
        System.out.println(busThree);
        busThree.refil();

    }
}
