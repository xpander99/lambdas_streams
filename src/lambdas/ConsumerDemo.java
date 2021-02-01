/*
This approach will use anonymous classes.
 */
package lambdas;

import java.util.function.Consumer;

public class ConsumerDemo {


    public static void main(String[] args) {
        Consumer consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.println("Printing: " + i);
            }
        };
        consumer.accept(10);
    }
}
