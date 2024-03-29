package secondHomeWork.task1;

class IsFloat {
    public static float isFloat(String input) {
// Введите свое решение ниже
        float f= Float.NaN;

        try {
           f= Float.parseFloat(input);
        } catch (NumberFormatException e) {
        throw new NumberFormatException("Your input is not a float number. Please, try again");
        }

        return f;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
class Printer {
    public static void main(String[] args) {
        String input;

// При отправке кода на Выполнение, вы можете варьировать эти параметры
        if (args.length == 0) {
            input = "3.1asd"; // По умолчанию используем "3.14", если аргумент не передан
        }
        else {
            input = args[0];
        }

        float result = IsFloat.isFloat(input);
        System.out.println(result);
    }
}