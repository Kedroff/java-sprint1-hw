import java.util.Scanner;
public class StepTracker {
    MonthData[] monthToData = new MonthData[12];
    Scanner scanner;

    int goalByStepsPerDay = 10000;

    StepTracker (Scanner scanner){
        this.scanner = scanner;
        for (int i=0;i<monthToData.length;i++){
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
            if (day < 1 || day > 30){
                System.out.println("Номер дня должен быть от 1 до 30");
                return;
            }
            System.out.println("Введите количество шагов: ");
            int steps = scanner.nextInt();

            MonthData monthData = monthToData[month-1];
            monthData.days[day-1] = steps;
        }
        void changeStepGoal(){
            System.out.println("Введите новую цель шагов в день: ");
            goalByStepsPerDay = scanner.nextInt();
            if (goalByStepsPerDay <= 0 ){
                System.out.println("Введите число больше 0 ");
            }
        }
    }

