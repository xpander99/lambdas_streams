/*
The traditional way.
 */
package lambdas;

import java.util.function.Predicate;

public class PredicateDemo implements Predicate<Integer> {

    @Override
    public boolean test(Integer i) {
        return i % 2 == 0;
    }

    public static void main(String[] args){
        PredicateDemo predicateDemo = new PredicateDemo();
        System.out.println(predicateDemo.test(20));
    }
}
