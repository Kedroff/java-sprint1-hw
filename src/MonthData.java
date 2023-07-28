import java.util.Scanner;
public class MonthData {
    int[] days = new int[30];
Scanner scanner = new Scanner(System.in);
    void printDaysAndStepsFromMonth(){
        System.out.println("Введите номер месяца: ");
        int month = scanner.nextInt();
        for (int i = 0;i<days.length;i++){
            System.out.println((i+1)+" день: " + days[i] );
        }
    }

//    int sumStepsFromMonth(){
//        int sum = 0;
//        for (int i = 0; i<days.length;i++){
//
//        }
//        return sum;
//    }
//    int maxSteps() {
//        int maxSteps = 0;
//        for (int i = 0; i < days.length; i++) {
//            // поиск максимального элемента
//        }
//        return maxSteps;
//    }
//    int bestSeries(int goalByStepsPerDay) {
//        int currentSeries = 0;
//        int finalSeries = 0;
//        for (int i = 0; i < days.length; i++) {
//            // поиск максимальной серии
//        }
//        return finalSeries;
    }


