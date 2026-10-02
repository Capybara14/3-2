import java.util.Scanner;

public class Main {

    record InputData(double a, double h, int n) {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InputData data = readInput(scanner);

        try {
            System.out.printf("Результат вычисления: %.6f", calculateData(data));
        } catch (Exception e) {
            System.out.println("Введено отрицательное число.");
        }
    }

    static InputData readInput(Scanner scanner) {
        System.out.print("Введите a, h, n: ");
        double a = scanner.nextDouble();
        double h = scanner.nextDouble();
        int n = scanner.nextInt();
        if (a > 0 && h > 0 && n > 0) {
            return new InputData(a, h, n);
        }
        return null;
    }

    static double calculateData(InputData data) {
        double sum = 0.0;
        for (int i = 0; i <= data.n; i++) {
            sum += func(data.a + i * data.h);
        }
        return sum;
    }

    static double func(double x) {
        return (x * x + 1) * Math.cos(x);
    }
}