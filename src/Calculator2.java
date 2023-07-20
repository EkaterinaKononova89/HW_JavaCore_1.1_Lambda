import java.util.function.*;

public class Calculator2 {

    static Supplier<Calculator2> instance = Calculator2::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    //BinaryOperator<Integer> devide = (x, y) -> x / y;

    BinaryOperator<Integer> divideNewInt = (x, y) -> {
        if (y == 0) {
            return x > 0 ? Integer.MAX_VALUE : Integer.MAX_VALUE * -1;
        } else {
            return x / y;
        }
    };

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;
}
