package az.stepit.lambdas.arithmetic;


public class ArithmeticOperationsDemo {
    public static void main(String[] args) {

        ArithmeticOperations adding = (a, b) -> a + b;
        ArithmeticOperations subtract = (a, b) -> a - b;
        ArithmeticOperations multiply = (a, b) -> a * b;
        ArithmeticOperations divide = (a, b) -> a / b;
        ArithmeticOperations custom = (a, b) -> {
          a = a +10;
          b = b - 2;
          return (a+b) * 10;
        };

        int addingResult = adding.compute(25,5);
        int subtractResult = subtract.compute(25,5);
        int multiplyResult = multiply.compute(25,5);
        int divideResult = divide.compute(25,5);
        int customResult = custom.compute(25,5);

        System.out.println(addingResult);
        System.out.println(subtractResult);
        System.out.println(multiplyResult);
        System.out.println(divideResult);
        System.out.println(customResult);

    }
}
