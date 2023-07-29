import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker tracker = new StepTracker(scanner);


        while (true) {                                          // Ростислав, зацените как сделал,
            printMenu();                                        // даже проверку на ввод реализовал :)
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                switch (i) {
                    case (1):
                        tracker.addNewNumberStepsPerDay();
                        break;
                    case (2):
                        tracker.changeStepGoal();
                        break;
                    case (3):
                        tracker.printStatistic();
                        break;
                    case (0):
                        System.out.println("Всего доброго!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Выберите пункт от 1-3, 0 - чтобы выйти");
                        break;
                }
            } else {
                System.out.println("Вводить нужно только числа!!!!!!!!!!!!");
                scanner.next();
            }
        }
    }


    public static void printMenu() {
        System.out.println("Выберите нужный пункт :)");
        System.out.println("1 - Ввести количество шагов за определенный день");
        System.out.println("2 - Изменить цель по количеству шагов в день");
        System.out.println("3 - Напечатать статистику за определенный месяц");
        System.out.println("0 - Выйти из приложения");
    }
}
