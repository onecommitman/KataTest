package KataTest;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String calculate = scanner.nextLine();
        System.out.println(calc(calculate));
    }

    public static String calc(String input) {
        List<String> list = Arrays.asList(input.split(" "));
        String firstNumber = null;
        String operation = null;
        String secondNumber = null;
        String res = null;
        firstNumber = list.get(0);
        operation = list.get(1);
        secondNumber = list.get(2);

        //Проверка количества аргументов в выражении
        if (list.size() > 3 || list.size() < 3) {
            throw new IllegalArgumentException("Количество аргументов должно быть равно 2!");
        }

        RomanCalculator calculator = new RomanCalculator();

        /**
         * Если числа арабские, то сразу производится вычисление,
         * если нет, то римские числа конвертируются в арабские, а затем вычисление,
         * иначе - исключение.
         */
        if ((isDigit(firstNumber)) && (isDigit(secondNumber))) {
            res = calculator.calculate(firstNumber, secondNumber, operation, false);
        } else if (!(isDigit(firstNumber)) && !(isDigit(secondNumber))) {
            res = calculator.calculate(calculator.romanToNumber(firstNumber), calculator.romanToNumber(secondNumber), operation, true);
        } else throw new IllegalArgumentException("Неверный формат ввода!");
        return res;
    }

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
