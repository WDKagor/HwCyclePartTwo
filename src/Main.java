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
        System.out.println("Задача 2");//Напишите программу, которая выводит в консоль заданную последовательность чисел



    }
}