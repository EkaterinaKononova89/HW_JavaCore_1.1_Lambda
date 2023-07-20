public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        //int c = calc.devide.apply(a, b); // делитель b равен 0, невозможно выполнить данное действие
        //calc.println.accept(c);
        double c1 = calc.divideNewDouble.apply((double) a, (double) b);

        calc.println.accept(c1); // заменила в классе калькуляора в методе Consumer интежер на дабл

        Calculator2 calc2 = Calculator2.instance.get();

        int a2 = calc2.plus.apply(1, 2);
        int b2 = calc2.minus.apply(1, 1);
        int c2 = calc2.divideNewInt.apply(a2, b2);

        calc2.println.accept(c2);
    }
}