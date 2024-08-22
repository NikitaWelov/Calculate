import java.util.Scanner;

class Main {
    static String calculator(String input) {
        String[] parts = input.split(" ");
        if (parts.length != 3) {
            return "throws Exception";
        }
        try {
            int num1 = Integer.parseInt(parts[0]);
            int num2 = Integer.parseInt(parts[2]);
            char x = parts[1].charAt(0);
            int res;
            if (num1 < 1 || num1 > 10 || num2 < 1 || num2 > 10) {
                return "throws Exception";
            }
            switch (x) {
                case '+':
                    res = num1 + num2;
                    break;
                case '-':
                    res = num1 - num2;
                    break;
                case '*':
                    res = num1 * num2;
                    break;
                case '/':
                    res = num1 / num2;
                    break;
                default:
                    return "throws Exception";
            }
            return String.valueOf(res);
        } catch (NumberFormatException e) {
            return "throws Exception";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        System.out.println(calculator(input));
    }
}