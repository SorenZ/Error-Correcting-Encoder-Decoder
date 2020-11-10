import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dates = scanner.nextLine().split(" ");

        LocalDate x = LocalDate.parse(dates[0]);
        LocalDate m = LocalDate.parse(dates[1]);
        LocalDate n = LocalDate.parse(dates[2]);

        if (x.isAfter(m) && x.isBefore(n)) {
            System.out.print(true);
            return;
        }

        if (x.isAfter(n) && x.isBefore(m)) {
            System.out.print(true);
            return;
        }

        System.out.print(false);
    }
}