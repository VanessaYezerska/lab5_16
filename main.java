import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int a = (int) (Math.random()*41-20);
        System.out.println("Випадкове натуральне число на проміжку [-20;20]: " + a);

    }
}
class Task2{
    public static void main(String[] args) {
        double a = 3;
        double b = 4;


        double c = Math.sqrt(a * a + b * b);//теорема піфагора

        double s = 0.5 * a * b;//площа


        double p = a + b + c;//периметр

        System.out.println("Площа прямокутного трикутника: " + s);
        System.out.println("Периметр прямокутного трикутника: " + p);
    }
}
class Task3 {
    public static void main(String[] args) {
        int randomNum = (int) (Math.random() * 101);
        System.out.println("Рандомно згенероване число: " + randomNum);
        String num = Integer.toString(randomNum);
        System.out.println("Кількість цифр у згенерованому числі: " + num.length());
    }
}