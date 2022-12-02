import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value = new Random().nextInt(1000);
        String answer = "";
        while (true) {
            int attempt = new Scanner(System.in).nextInt();
            if (value < attempt) {
                System.out.println("Задуманное число меньше!");
            } else if (value > attempt) {
                System.out.println("Задуманное число больше!");
            } else {
                System.out.println("Все верно!!");
                break;
            }

            //ветка back-end

        }
    }
}
