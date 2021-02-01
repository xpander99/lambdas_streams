/*
The approach using anonymous classes.
 */
package lambdas;

import java.util.function.Predicate;

public class PredicateDemo {


    public static void main(String[] args) {
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        };
        System.out.println(predicate.test(10));

    }
}
