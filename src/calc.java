mport java.util.Scanner;

public class calc{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        try {
            String[] parts = input.split(" ");
            if (parts.length != 3) {
                throw new IllegalArgumentException("Не соответствут требованиям задачи");
            }
            int num1 = Integer.parseInt(parts[0]);
            int num2 = Integer.parseInt(parts[2]);

            if ((num1 < 1 || num1 > 10) || (num2 < 1 || num2 > 10)) {
                throw new IllegalArgumentException("Не соответствут требованиям задачи");
            }
            int result;
            switch (parts[1]) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
                default:
                    throw new IllegalArgumentException("Не соответствут требованиям задачи");
            }
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.err.println("Ошибка: "+ e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка: "+ e.getMessage());
        }
    }
}
