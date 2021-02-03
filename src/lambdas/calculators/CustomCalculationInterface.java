package lambdas.calculators;
import java.util.List;
@FunctionalInterface
public interface CustomCalculationInterface {
    Double execute(List<Double> scores);
}
