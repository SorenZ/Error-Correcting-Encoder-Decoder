import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();
        int dayOfYear = scanner.nextInt();

        LocalDate date = LocalDate.ofYearDay(year, dayOfYear);

        for (int i = 1; i <= 12; i++) {
            if (date.getDayOfMonth() == LocalDate.of(year,i, 1).lengthOfMonth()) {
                System.out.println(true);
                return;
            }

        }

        System.out.println(false);


    }
}