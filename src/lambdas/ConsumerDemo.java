/*
This approach will use lambda expression.
This will not generate an anonymous class in the out/production folder.
 */
package lambdas;

import java.util.function.Consumer;

public class ConsumerDemo {


    public static void main(String[] args) {
        Consumer<Integer> consumer = (i) -> System.out.println("Printing: " + i);
        consumer.accept(10);
    }
}
