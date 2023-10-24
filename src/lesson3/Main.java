package lesson3;


import java.util.Scanner;

public class Main {
    public static final String RED = "красный";
    public static final String GREEN = "зелёный";
    public static final String YELLOW = "желтый";
    public static final String BLUE = "синий";

    public static void main(String[] args) {

        printColor(RED);

//        ifExample();

    }

    private static void printColor(String color) {
        switch (color) {
            case RED -> System.out.println("красный");
            case GREEN -> System.out.println("зелёный");
            case YELLOW -> System.out.println("жёлтый");
            case BLUE -> System.out.println("синий");
            default -> System.out.println("Ни один из цветов не подошёл!");
        }

    }

    private static void ifExample() {
        System.out.println("Введите ваш возраст");
        System.out.print("Ввод: ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age >= 18) {
            if (age > 90) {
                System.out.println("Зачем вы сюда пришли?");
            } else {
                System.out.println("Добро пожаловать");
            }
        } else if (age >= 16) {
            System.out.println("Ну ладно, проходите");
        } else if (age >= 90) {
            System.out.println("ывавыап");
        } else {
            System.out.println("Доступ ограничен");
        }
    }
}
