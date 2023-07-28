public class Converter {

    int step = 75;
    int kilo = 50;

    int convertToKm(int steps) {
        double stepLengthInMeters = step * 0.01; // шаг в метрах
        double totalDistanceInMeters = steps * stepLengthInMeters; // дистанция в метрах
        double totalDistanceInKm = totalDistanceInMeters / 1000; // дистанция в км
        return (int) totalDistanceInKm;
    }

    int convertStepsToKilocalories(int steps) {
        double calorieInKCalories = kilo * 0.001; // калории в килокалории
        double calorieInSteps = calorieInKCalories * steps;
        return (int) calorieInSteps;
    }
}
