import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value = new Random().nextInt(100);
        String answer = "";
        while (true) {
            int attempt = new Scanner(System.in).nextInt();
            if (value < attempt) {
                System.out.println("Загаданное число меньше!");
            } else if (value > attempt) {
                System.out.println("Загаданное число больше!");
            } else {
                System.out.println("Все верно!!");
                break;
            }
            //ветка front-end
        }
    }
}
