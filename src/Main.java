public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");//Выведите в консоль количество месяцев, необходимое для накопления заданной суммы
        int deposit = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total = total + total / 100;
            total = total + deposit;
            if (i >= 0 && i < 97) {
                i++;
                continue;
            }
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        System.out.println("   ");
        System.out.println("Задача 2");//Выведите последовательность чисел с помощью while и for
        i = 0;
        while (i <= 10) {
            System.out.print(i++ + " ");
        }
        System.out.println(" ");
        for (i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println("   ");
        System.out.println("   ");
        System.out.println("Задача 3");//Выведите в консоль численность населения страна через 10 лет
        int population = 12_000_000;
        i = 0;
        while (i < 10) {
            i++;
            population = population + population / 1000 * (17 - 8);
            }
        System.out.print("Год " + i + " численность населения составляет " + population);

        System.out.println("   ");
        System.out.println("Задача 4");//Выведите в консоль сумму накоплений за каждый месяц
        deposit = 15000;
        i = 0;
        while (deposit < 12_000_000) {
            i++;
            deposit = deposit + deposit / 100 * 7;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + deposit + " рублей");
        }

        System.out.println("   ");
        System.out.println("Задача 5");//Выведите в консоль сумму накоплений за каждый 6-ой месяц
        deposit = 15000;
        i = 0;
        while (deposit < 12_000_000) {
            i++;
            deposit = deposit + deposit / 100 * 7;
            if (i%6==0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + deposit + " рублей");
            }
        }

        System.out.println("   ");
        System.out.println("Задача 6");//Выведите в консоль сумму накоплений за каждые полгода в течении 9 лет
        deposit = 15000;
        i = 0;
        while (i<=108) {
            i++;
            deposit = deposit + deposit / 100 * 7;
            if (i%6==0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + deposit + " рублей");
            }
        }

        System.out.println("   ");
        System.out.println("Задача 7");//Выведите в консоль напоминание об отчете за каждую пятницу месяца
        int numberFriday = 3;
        do {
            System.out.println("Сегодня пятница, " + numberFriday + " число. Необходимо подготовить отчет");
            numberFriday = numberFriday + 7;
        }
        while (numberFriday < 31);

        System.out.println("   ");
        System.out.println("Задача 8");//Выведите в консоль годы появления кометы за заданный период
        int year = 2023;
        int starYears = year - 200;
        int stopYear = year + 100;
        for (i = 0; i < stopYear; i++) {
            if (i % 79 == 0 && i > starYears) {
                System.out.println(i);
            }
        }





    }
}