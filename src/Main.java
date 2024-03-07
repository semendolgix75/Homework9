public class Main {
    public static void main(String[] args) {    //Метод main
        task1();

    }

    public static int[] generateRandomArray() { //обьявление метода сгенерировать массив
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;

        //Task1
        //Бухгалтеры попросили посчитать сумму всех выплат за месяц.
        //Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате:
        // «Сумма трат за месяц составила … рублей».
    }

    public static void task1() {
        System.out.println("\nTask1\n Бухгалтеры попросили посчитать сумму всех выплат за месяц.");
        int[] arr = generateRandomArray();    //обьявление массива и вызов метода сгенерировать массив
        int sumPay = 0;   //посчитать сумму всех выплат за месяц
        for (int pay: arr) {

            sumPay += pay;
        }
        System.out.println("Сумма трат за месяц составила " + sumPay + " рублей");

        //Задача 2
        //Также бухгалтерия попросила найти минимальную и максимальную трату за день.
        //Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате:
        // «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».
        System.out.println("\nTask2\n Бухгалтерия попросила найти минимальную и максимальную трату за день.");
        int minPay = 200_000; // Массив из случайных чисел от 100 000 до 200 000
        int maxPay = 100_000; // Массив из случайных чисел от 100 000 до 200 000
        for (int day : arr) {
            if (minPay > day) {
                minPay = day;
            }
            if (maxPay < day) {
                maxPay = day;
            }

        }
        System.out.println("Минимальная сумма трат за день составила " + minPay + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxPay + " рублей");

        System.out.println("\nTask3\n Бухгалтерия хочет понять, какую в среднем сумму компания тратила в течение 30 дней..");

        //Задача 3
        //Теперь бухгалтерия хочет понять, какую в среднем сумму компания тратила в течение 30 дней.
        //Напишите программу, которая посчитает среднее значение трат за месяц
        // (то есть сумму всех трат за месяц поделить на количество дней),
        // и выведите в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
        int sumAllPay = 0;   //Сумма всех трат.

        for (int day:arr) {
            sumAllPay += day;
        }
        float averagePay = (float)sumAllPay / arr.length;    //Средняя сумма трат за месяц
        System.out.println("Средняя сумма трат за месяц составила  " + averagePay + " рублей");

        //Задача 4
        System.out.println("\nTask4\n Напишите код, который в будет выводить фамилии и имена сотрудников в корректном виде.");
        //В бухгалтерской книге появился баг. Что-то пошло не так: фамилии и имена сотрудников начали отображаться в обратную сторону.
        //Напишите код, который в случае такого бага будет выводить фамилии и имена сотрудников в корректном виде.
        // В качестве данных для массива используйте: //char[] reverseFullName
        //В результате в консоль должно быть выведено: Ivanov Ivan.

        char[] reverseFullName = new char[]{'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};  //имена сотрудников начали отображаться в обратную сторону.
        System.out.print("Фамилии и имена сотрудников в корректном виде: ");
        for (int i = (reverseFullName.length - 1); i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

}
