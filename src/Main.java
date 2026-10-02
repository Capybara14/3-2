import java.util.Scanner;

public class Main {

    record InputData(double a, double h, int n) {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InputData data = readInput(scanner);

        System.out.printf("%.6f", calculateData(data));
    }

    static InputData readInput(Scanner scanner) {
        System.out.print("Введите a, h, n: ");
        return new InputData(scanner.nextDouble(), scanner.nextDouble(), scanner.nextInt());
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