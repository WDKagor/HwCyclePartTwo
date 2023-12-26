public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");//Выведите в консоль количество месяцев, необходимое для накопления заданной суммы
        int deposit = 15000;
        int total = 0;
        int i = 0;
        while (total<2_459_000) {
            total=total+total/100;
            total=total+deposit;
            if (i >= 0 && i<97) {
                i++;
            continue;
        }
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        System.out.println("   ");
        System.out.println("Задача 2");//Выведите последовательность чисел с помощью while и for
        i = 0;
        while (i<=10) {
            System.out.print(i++ + " ");
        }
        System.out.println(" ");
        for (i=10; i>=0; i--) {
            System.out.print(i + " ");
        }

        System.out.println("   ");
        System.out.println("   ");
        System.out.println("Задача 3");//Выведите в консоль численность населения страна через 10 лет
        int population = 12_000_000;
        i=0;
        while (i<10) {
            i++;
            population=population+population/1000*(17-8);
            continue;
            }
        System.out.print("Год " + i + " численность населения составляет " + population);

        System.out.println("   ");
        System.out.println("   ");
        System.out.println("Задача 4");//Выведите в консоль сумму накоплений за каждый месяц
        deposit = 15000;
        i=0;
        while (deposit<12_000_000) {
            deposit=deposit+deposit/ 100 * 7;
            if (i>=0) {
                i++;
                System.out.println("Месяц " + i + ", сумма накоплений равна " + deposit + " рублей");
            }

        }



    }
}