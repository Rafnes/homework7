public class Main {
    public static void main(String[] args) {
        //Задание 1
        int depositTask1 = 15000;
        int totalTask1 = 0;
        int monthNumberTask1 = 0;
        while (totalTask1 <= 2_459_000) {
            monthNumberTask1++;
            totalTask1 += depositTask1;
            totalTask1 += totalTask1 / 100;
            System.out.println("Месяц " + monthNumberTask1 + ", сумма накоплений равна " + totalTask1);
        }
        System.out.println();

        //Задание 2
        int numTask2 = 0;
        while (numTask2 < 10) {
            numTask2++;
            System.out.print(numTask2);
            System.out.print(" ");
        }
        System.out.println();

        for (; numTask2 >= 1; numTask2--) {
            System.out.print(numTask2);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println();

        //Задание 3
        int population = 12_000_000;
        double birthRate = (double) 17 / 1000;
        double deathRate = (double) 8 / 1000;
        //исходим из того, что до начала измерений (на нулевом году) население 12 000 000,
        //а уже потом прошел год и население изменилось
        for (int year = 1; year <= 10; year++) {
            population += (int) (population * (birthRate - deathRate));
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        System.out.println();

        //Задание 4
        double depositTask4 = 15000.00;
        double percent = 1.07; //одинаковый процент для заданий 4, 5 и 6
        int goalTask4 = 12_000_000;
        int monthsNumberTask4 = 1;
        while (depositTask4 < goalTask4) {
            depositTask4 *= percent;
            System.out.printf("Месяц %s, накопления: %.2f рублей%n", monthsNumberTask4, depositTask4);
            monthsNumberTask4++;
        }
        System.out.println();

        //Задание 5
        double depositTask5 = 15000.00;
        int goalTask5 = 12_000_000;
        int monthsNumberTask5 = 1;
        while (depositTask5 < goalTask5) {
            depositTask5 *= percent;
            if (monthsNumberTask5 % 6 == 0) {
                System.out.printf("Месяц %s, накопления: %.2f рублей%n", monthsNumberTask5, depositTask5);
            }
            monthsNumberTask5++;
        }
        System.out.println();

        //Задание 6
        double depositTask6 = 15000.0;
        int monthsToGoal = 9 * 12; //по 12 месяцев за 9 лет - целевое количество месяцев
        for (int i = 1; i <= monthsToGoal; i++) {
            depositTask6 *= percent;
            if (i % 6 == 0) {
                System.out.printf("Месяц %s, накопления: %.2f рублей %n", i, depositTask6);
            }
        }
        System.out.printf("За 9 лет на счету накопится %.2f рублей %n", depositTask6);
        System.out.println();

        //Задание 7
        int firstFriday = 4;
        for (int i = firstFriday; i <= 31; i += 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
        }

        //Задание 8
        int flyByPeriod = 79;
        int currentYear = 2024;
        int lowerBorderYear = currentYear - 200;
        int upperBorderYear = currentYear + 100;
        for (int i = 0; i <= upperBorderYear; i += flyByPeriod) {
            if (i > lowerBorderYear) {
                System.out.println(i);
            }
        }
    }
}