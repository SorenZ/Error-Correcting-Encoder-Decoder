import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LocalTime time = LocalTime.parse(scanner.nextLine());

        System.out.println(time.format(DateTimeFormatter.ofPattern("HH:mm")));
    }
}