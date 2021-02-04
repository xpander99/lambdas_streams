/*
A simpler solution to this problem will be to use lambdas.
We can get rid of CustomCalculationInterface too, because we can use a predefined
functional interface in java, namely Function which takes an input of type T and returns and output
of type R.
 */
package lambdas.examManager;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Client {
    public static void main(String[] args) {
        Function<List<Double>, Double> lambdaAverage = scores -> {
            Double average = 0d;
            for (Double nextScore : scores) {
                average += nextScore;
            }
            return average / scores.size();
        };
        Function<List<Double>, Double> lambdaHighest = scores -> {
            Double highest = 0d;
            for (Double nextScore : scores) {
                highest = Math.max(highest, nextScore);
            }
            return highest;
        };

        ExamManager examManager = new ExamManager();
        System.out.println("Average score: " + examManager.customCalculation(lambdaAverage));
        System.out.println("Highest score: " + examManager.customCalculation(lambdaHighest));
        System.out.println("The first score: " + examManager.customCalculation((scores) -> scores.get(0)));
    }
}
