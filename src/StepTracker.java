import java.util.Scanner;

public class StepTracker {
    MonthData[] monthToData = new MonthData[12];
    Scanner scanner;
    Converter converter = new Converter();

    int goalByStepsPerDay = 10000;

    StepTracker(Scanner scanner) {
        this.scanner = scanner;
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца: ");
        int month = scanner.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Номер месяца должен быть от 1 до 12");
            return;
        }
        System.out.println("Введите номер дня: ");
        int day = scanner.nextInt();
        if (day < 1 || day > 30) {
            System.out.println("Номер дня должен быть от 1 до 30");
            return;
        }
        System.out.println("Введите количество шагов: ");           // Тут еще глянул и добавил проверку на то,
        int steps = scanner.nextInt();                              // чтобы отриц. числа не сохранялись, а то в выводе
        if (steps <= 0) {                                           // будет показывать отриц. значения и статистика будет испорена :(
            System.out.println("Введите число больше 0!");
            steps = 0;
        }

        MonthData monthData = monthToData[month - 1];
        monthData.days[day - 1] = steps;
    }


    void changeStepGoal() {
        System.out.println("Введите новую цель шагов в день: ");
        int newGoalByStepsPerDay = scanner.nextInt();
        if (newGoalByStepsPerDay <= 0) {
            System.out.println("Введите число больше 0 ");
        } else {
            goalByStepsPerDay = newGoalByStepsPerDay;
        }
    }

    void printStatistic() {

        System.out.println("Введите число месяца");
        int month = scanner.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Номер месяца должен быть от 1 до 12");
            return;
        }

        MonthData monthData = monthToData[month - 1];
        int sumSteps = monthData.sumStepsFromMonth();// получение суммы шагов за месяц
        System.out.println("Вывод общей статистики по дням: ");
        monthData.printDaysAndStepsFromMonth();// вывод общей статистики по дням
        System.out.println("Вывод суммы шагов за месяц: " + sumSteps);// вывод суммы шагов за месяц
        System.out.println("Вывод максимального пройденного количества шагов за месяц: " + monthData.maxSteps());// вывод максимального пройденного количества шагов за месяц
        System.out.println("Вывод среднего пройденного количества шагов за месяц: " + (monthData.sumStepsFromMonth() / 30));// вывод среднего пройденного количества шагов за месяц
        System.out.println("Вывод пройденной за месяц дистанции в км: " + converter.convertToKm(sumSteps));// вывод пройденной за месяц дистанции в км
        System.out.println("Вывод количества сожжённых килокалорий за месяц: " + converter.convertStepsToKilocalories(sumSteps));// вывод количества сожжённых килокалорий за месяц
        System.out.println("Вывод лучшей серии: " + monthData.bestSeries(goalByStepsPerDay));// вывод лучшей серии
        System.out.println(); //дополнительный перенос строки
    }

}

