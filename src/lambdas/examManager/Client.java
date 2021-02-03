/*
A simpler solution to this problem will be to use lambdas.
We can get rid of AverageScoreCalculatorImpl, HighestScoreCalculatorImpl
 */
package lambdas.examManager;

import lambdas.calculators.AverageScoreCalculatorImpl;
import lambdas.calculators.CustomCalculationInterface;
import lambdas.calculators.HighestScoreCalculatorImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        CustomCalculationInterface lambdaAverage = scores -> {
            Double average = 0d;
            for(Double nextScore : scores){
                average += nextScore;
            }
            return average / scores.size();
        };
        CustomCalculationInterface lambdaHighest = scores -> {
            Double highest = 0d;
            for(Double nextScore : scores){
                highest = Math.max(highest, nextScore);
            }
            return highest;
        };
        ExamManager examManager = new ExamManager();
        System.out.println("Average score: " + examManager.customCalculation(lambdaAverage));
        System.out.println("Highest score: " + examManager.customCalculation(lambdaHighest));
    }
}
