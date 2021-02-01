/*
The approach using lambda.
 */
package lambdas;

import java.util.function.Predicate;

public class PredicateDemo {


    public static void main(String[] args) {
        Predicate<Integer> predicate = (t) -> t % 2 == 0;
        System.out.println(predicate.test(10));

    }
}
