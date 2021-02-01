/*
The traditional approach without using anonymous classes or lambdas.
 */
package lambdas;

import java.util.function.Consumer;

public class ConsumerDemo implements Consumer<Integer> {
    @Override
    public void accept(Integer i) {
        System.out.println("Printing: " + i);
    }

    public static void main(String[] args) {
        ConsumerDemo consumerDemo = new ConsumerDemo();
        consumerDemo.accept(10);
    }
}
