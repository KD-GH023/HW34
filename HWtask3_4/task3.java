import java.util.ArrayList;
import java.util.List;

public class task3 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(12);
        numbers.add(3);

        // Удаление четных чисел
        numbers.removeIf(n -> n % 2 == 0);

        // Поиск минимального значения
        int min = Integer.MAX_VALUE;
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }

        // Поиск максимального значения
        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        // Вычисление среднего значения
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = sum / numbers.size();

        System.out.println("Исходный список: " + numbers);
        System.out.println("Список после удаления четных чисел: " + numbers);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + average);
    }
}