import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputs = input.split(" ");

        LocalDateTime datetime = LocalDateTime.parse(inputs[0]);
        int days = Integer.parseInt(inputs[1]);
        int hours = Integer.parseInt(inputs[2]);

        System.out.print(
                datetime.plusDays(days)
                .minusHours(hours)
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))
                        +"T"+
                        datetime.plusDays(days)
                                .minusHours(hours)
                                .format(DateTimeFormatter.ofPattern("HH:mm")
                ));


    }
}