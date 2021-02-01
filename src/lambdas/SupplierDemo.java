/*
This approach is using the traditional way.
 */
package lambdas;

import java.util.function.Supplier;

public class SupplierDemo implements Supplier<Integer> {
    @Override
    public Integer get() {
        return 1;
    }

    public static void main(String[] args) {
        SupplierDemo supplierDemo = new SupplierDemo();
        System.out.println(supplierDemo.get());
    }
}
