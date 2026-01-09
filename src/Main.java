import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Address, Integer> costPerAddress = new HashMap<>();

        costPerAddress.put(new Address("Russia", "Moscow"), 1500);
        costPerAddress.put(new Address("USA", "Denver"), 4000);
        costPerAddress.put(new Address("China", "Beijing"), 500);
        costPerAddress.put(new Address("Georgia", "Tbilisi"), 2500);
        costPerAddress.put(new Address("Poland", "Warsaw"), 2600);

        Scanner scanner = new Scanner(System.in);
        int cachePrice = 0;

        while (true) {
            System.out.println("Заполнение нового заказа.");
            System.out.println("Введите страну: ");
            String country = scanner.next();
            System.out.println("Введите город: ");
            String city = scanner.next();
            System.out.println("Введите вес (кг): ");
            String strWeight = scanner.next();
            int weight = Integer.parseInt(strWeight);

            try {
                int price = costPerAddress.get(new Address(country, city));
                int totalPrice = weight * price;
                cachePrice += totalPrice;
                System.out.println("Стоимость доставки составит: " + totalPrice + " руб.");
                System.out.println("Общая стоимость всех доставок: " + cachePrice + " руб.");

            } catch (Exception e) {
                System.out.println("Доставки по этому адресу нет");
            }
        }
    }
}