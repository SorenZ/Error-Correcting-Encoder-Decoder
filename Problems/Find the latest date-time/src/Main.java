import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDateTime dateTime = LocalDateTime.MIN;

        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < count; i++) {
            String inputDate = scanner.nextLine();
            LocalDateTime inputDateTime = LocalDateTime.parse(inputDate);
            if (inputDateTime.isAfter(dateTime)) {
                dateTime = inputDateTime;
            }

        }

        System.out.print(dateTime);
    }
}