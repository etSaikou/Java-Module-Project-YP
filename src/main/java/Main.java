import java.util.Scanner;

import entity.Car;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Приветствуем на гонке «24 часа Ле-Мана»!");

        for (int i = 0; i < 3; i++) {

            System.out.printf("Введите название машины №%d:%n", i+1);

            String name = scanner.nextLine();

            System.out.printf("Введите скорость машины №%d:%n", i+1);

            int speed;
            //Проверка введённой скорости
            try {
               speed = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                speed = 0;
            }

            while(speed <= 0 || speed > 250) {
                System.out.printf("Неправильная скорость%nВведите скорость машины №%d:%n", i+1);
                try {
                    speed = Integer.parseInt(scanner.nextLine());
                } catch (Exception e) {
                    speed = 0;
                }
            }

            //Сверка рекордов и запись нового победителя
            Race.chooseWinner(new Car(name,speed));
        }
        //Объявление победителя
        Race.declareWinner();

    }
}