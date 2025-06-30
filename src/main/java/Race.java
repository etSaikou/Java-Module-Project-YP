import entity.Car;

public class Race {

    private static int maxDistance = 0;
    private static String winner = "";

    //Сверка рекордов и запись нового победителя

     public static void chooseWinner(Car car) {

        int currentDistance = car.speed()*24;

        if (maxDistance < currentDistance) {
            maxDistance = currentDistance;
            winner = car.name();
        }

    }
    //Объявление победителя
    public static void declareWinner() {
        System.out.println("Самая быстрая машина: " + winner);
    }

}
