/*
    This code will create two anonymous classes.
    If we look at line 26 we see how a typical lambda expression works.
    A function has 4 things, namely: name, body, parameters list, return type.
    The lambda function gets rid of name and the return type.
    When we use the lambda expression, the compiler does not swallow the lambda expression
    and replace it with the creation of an anonymous class, instead it uses the invokedynamic functionality.
    In short terms, the invokedynamic constructs the anonymous class at runtime!
 */
public class InvokeDynamic {
    public static void main(String[] args){
        Thread th;
        th = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Test");
            }
        });
        th = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Test");
            }
        });
        // Lambda expression
        //th = new Thread(() -> System.out.println("Test"));
        //th = new Thread(() -> System.out.println("Test"));
        th.start();
    }
}
