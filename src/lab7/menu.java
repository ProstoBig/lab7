package lab7;

import java.util.Scanner;

/**
 * Представляє меню для вибору музичних інструментів.
 */

public class menu {

    /**
     * Метод main - виконує програму для вибору музичних інструментів.
     * @param args Аргументи командного рядка.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Оберіть інструмент(1,2,3)");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("1");
                    MusicalInstrument Guitar = new Guitar();
                    Guitar.play();
                    break;
                case 2:
                    System.out.println("2");
                    MusicalInstrument trumpet = new Trumpet();
                    trumpet.play();
                    break;
                case 3:
                    System.out.println("Вихід");
                    System.exit(0);
                default:
                    System.out.println("Неправильний вибір");
            }
        }
    }
}