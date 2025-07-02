import java.util.Scanner;

import entity.Car;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Приветствуем на гонке «24 часа Ле-Мана»!");

        for (int i = 0; i < 3; i++) {

            String name = "";
            int speed = 0;

            //Проверка введённого названия машины
            while (name.isBlank()) {
                System.out.printf("Введите название машины №%d:%n", i+1);
                name = scanner.nextLine();
                if(name.isBlank()){
                    System.out.println("Пустое название");
                }
            }

            //Проверка введённой скорости
            while (speed <= 0 || speed > 250) {

                System.out.printf("Введите скорость машины №%d:%n", i + 1);
                try {
                    speed = Integer.parseInt(scanner.nextLine());
                } catch (Exception e) {
                    speed = 0;
                }
                if (speed <= 0 || speed > 250)
                    System.out.println("Неправильная скорость");
            }

            //Ввод расстояния и запись победителя
            Race.chooseWinner(new Car(name,speed));
        }

        //Объявление победителя
        Race.declareWinner();

    }
}