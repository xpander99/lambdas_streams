package lambdas.calculators;

import java.util.List;

public class AverageScoreCalculatorImpl implements CustomCalculationInterface {

    @Override
    public Double execute(List<Double> scores) {
        Double sum = 0d;
        for (Double nextScore : scores) {
            sum += nextScore;
        }
        return sum / scores.size();
    }
}
