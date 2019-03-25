import java.util.Random;
import java.util.Scanner;

public class igra1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            Random rand = new Random();
            int x = rand.nextInt(10);
            int i=0;
            while (i<=3){
                if (i!=3) {
                    System.out.println("Введите число от 0 до 9:");
                    int a = scanner.nextInt();
                    if (a == x) {
                        System.out.println("Вы отгадали!");
                       break;
                    } else if (a < x) {
                        System.out.println("Загаданное число больше!");
                        i = i + 1;
                    } else {
                        System.out.println("Загаданное число меньше!");
                        i = i + 1;
                    }
                }
                else {
                    System.out.println("Вы проиграли!");
                    break;
                }
            }
            System.out.println("Повторить игру еще раз? Введите число 1-да/0-нет");
            int b = scanner.nextInt();
            if (b == 1) {
                i = 0;
            } else {
                break;
            }
        }
        while (true);
    }
                }
