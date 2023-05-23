import java.util.Random;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int spr = 2;

        System.out.println("Гра лотерея! Відгадайте послідовність трьох чисел з проміжку [1; 3].");


        int randomNum1 = random.nextInt(3) + 1;
        int randomNum2 = random.nextInt(3) + 1;
        int randomNum3 = random.nextInt(3) + 1;

        while (spr > 0) {
            System.out.print("Введіть послідовність трьох чисел (через пробіл): ");
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();
            int n3 = scanner.nextInt();

            if (n1 == randomNum1 && n2 == randomNum2 && n3 == randomNum3) {
                System.out.println("Вітаємо! Ви відгадали правильну послідовність чисел.");
                return;
            } else {
                System.out.println("Невірна послідовність чисел. Спробуйте ще раз.");
                spr--;
            }
        }

        System.out.println("Ви не відгадали правильну послідовність чисел. Гра завершена.");
    }
}

