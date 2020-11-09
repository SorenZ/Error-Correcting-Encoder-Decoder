import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//.useLocale();
        double first = scanner.nextDouble();
        double second = scanner.nextDouble();

        System.out.println(first / second);

    }
}