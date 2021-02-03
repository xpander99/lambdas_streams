package lambdas.calculators;

import java.util.List;

public class HighestScoreCalculatorImpl implements CustomCalculationInterface {
    @Override
    public Double execute(List<Double> scores) {
        Double highest = 0d;
        for (Double nextScore : scores) {
            highest = Math.max(nextScore, highest);
        }
        return highest;
    }
}
