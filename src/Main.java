import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker tracker = new StepTracker(scanner);
        MonthData data = new MonthData();

        while (true) {
            printMenu();
            int i = scanner.nextInt();

            if (i == 1) {
                tracker.addNewNumberStepsPerDay();
            }else if(i == 2){
                tracker.changeStepGoal();
            }else if(i == 3){
                data.printDaysAndStepsFromMonth();
            }else if(i == 0) {
                System.out.println("Всего доброго!");
                scanner.close();
                return;
            }else{
                System.out.println("Такой команды нет, попробуйте еще раз.");
            }

        }
    }






    public static void printMenu(){
        System.out.println("Выберите нужный пункт :)");
        System.out.println("1 - Ввести количество шагов за определенный день");
        System.out.println("2 - Изменить цель по количеству шагов в день");
        System.out.println("3 - Напечатать статистику за определенный месяц");
        System.out.println("0 - Выйти из приложения");
    }
}
