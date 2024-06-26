package firstHomeWork.task1;

public class Answer {
    public static void arrayOutOfBoundsException() {
        // Напишите свое решение ниже
        throw new ArrayIndexOutOfBoundsException();
    }

    public static void divisionByZero() {
        throw new ArithmeticException();// Напишите свое решение ниже

    }

    public static void numberFormatException() {
        throw new NumberFormatException();  // Напишите свое решение ниже

    }
}

 class Printer {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}
