import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.println("Введите операцию: ");
        char operation = scanner.next().charAt(0);

        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();

        scanner.close();
        System.out.println(valueCalc(num1, num2, operation));

    }


        public static String valueCalc(int number1, int number2, char operation) {

            switch (operation) {

                case '+':
                    return "Результат: " + (number1 + number2);
                case '-':
                    return "Результат: " + (number1 - number2);
                case '*':
                    return "Результат: " + (number1 * number2);
                case '/':
                    if (number2 != 0) {
                        return "Результат: " + number1 / number2;
                    } else {
                        return "Ошибка: деление на ноль невозможно.";
                    }

                default:
                    return "Неверно введена операция.";
        }
    }
}

