import entity.Car;

public class Race {

    private static int maxDistance = 0;
    private static String winner = "";

    //Проверка расстояний и запись победителя. Если рекорд не побит победитель не меняется

    public static void chooseWinner(Car car) {

        int currentDistance = car.getSpeed() * 24;

        if (maxDistance < currentDistance) {
            maxDistance = currentDistance;
            winner = car.getName();
        }
    }

    //Объявление победителя
    public static void declareWinner() {
        System.out.println("Самая быстрая машина: " + winner);
    }
}
