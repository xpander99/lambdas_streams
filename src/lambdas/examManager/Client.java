/*
We achieved a structure that permits us to pass functionality to other class.
However, this is not an elegant solution, because we need to create all the classes and wrap the functionality.
 */
package lambdas.examManager;

import lambdas.calculators.AverageScoreCalculatorImpl;
import lambdas.calculators.CustomCalculationInterface;
import lambdas.calculators.HighestScoreCalculatorImpl;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        ExamManager examManager = new ExamManager();
        System.out.println("Average score: " + examManager.customCalculation(new AverageScoreCalculatorImpl()));
        System.out.println("Highest score: " + examManager.customCalculation(new HighestScoreCalculatorImpl()));
    }
}
