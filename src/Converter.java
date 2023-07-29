public class Converter {

    int step = 75;
    int kilo = 50;

    double smToM = 0.01;

    double klToKKal = 0.001;

    int convertToKm(int steps) {
        double stepLengthInMeters = step * smToM; // шаг в метрах
        double totalDistanceInMeters = steps * stepLengthInMeters; // дистанция в метрах
        double totalDistanceInKm = totalDistanceInMeters / 1000; // дистанция в км
        return (int) totalDistanceInKm;
    }

    int convertStepsToKilocalories(int steps) {
        double calorieInKCalories = kilo * klToKKal; // калории в килокалории
        double calorieInSteps = calorieInKCalories * steps;
        return (int) calorieInSteps;
    }
}
