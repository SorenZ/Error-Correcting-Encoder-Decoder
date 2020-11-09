import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LocalDate date = LocalDate.parse(scanner.nextLine());
        int offset = scanner.nextInt();
        int dayOfYear = offset + date.getDayOfYear();

        System.out.println(date);

        while (true) {
            if (dayOfYear > date.lengthOfYear()) {
                break;
            }
            LocalDate newDate = LocalDate.ofYearDay(date.getYear(), dayOfYear);
            System.out.println(newDate);
            dayOfYear += offset;


        }
    }
}