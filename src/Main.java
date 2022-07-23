public class Main {
    public static void main(String[] args) {

        SalesManager day1 = new SalesManager(new int[]{35, 38, 36, 40, 39, 45, 43});

        System.out.println("Среднее количество проданных позиций в течение дня " + day1.average() + " шт");

        System.out.println("Максимальное количество проданных позиций в течение дня " + day1.max() + " шт");
    }
}