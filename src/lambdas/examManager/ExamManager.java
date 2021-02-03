package lambdas.examManager;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Function;

public class ExamManager {
    private List<Double> scores;

    public ExamManager() {
        this.scores = new ArrayList();
        this.scores.add(10.0);
        this.scores.add(11.3);
        this.scores.add(12.5);
        this.scores.add(9.3);
        this.scores.add(8.7);

    }

    public Double customCalculation(Function<List<Double>,Double> customCalculation){
        return customCalculation.apply(this.scores);
    }
}
