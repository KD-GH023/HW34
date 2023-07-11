import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class task4 {
    public static void main(String[] args) {
        // Задание 1: Умножение двух чисел
        Deque<Integer> num1 = new LinkedList<>();
        num1.add(2);
        num1.add(3);
        num1.add(4);

        Deque<Integer> num2 = new LinkedList<>();
        num2.add(5);
        num2.add(6);
        num2.add(7);

        Deque<Integer> product = multiplyNumbers(num1, num2);
        System.out.println("Произведение двух чисел: " + product);

        // Задание 2: Сложение двух чисел
        Deque<Integer> num3 = new LinkedList<>();
        num3.add(1);
        num3.add(2);
        num3.add(3);

        Deque<Integer> num4 = new LinkedList<>();
        num4.add(-4);
        num4.add(-5);
        num4.add(-6);

        Deque<Integer> sum = addNumbers(num3, num4);
        System.out.println("Сумма двух чисел: " + sum);

        // Задание 3: Реализация стека с помощью массива
        StackArray stack = new StackArray();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Размер стека: " + stack.size());
        System.out.println("Стек пустой? " + stack.empty());
        System.out.println("Верхний элемент стека: " + stack.peek());

        stack.pop();
        System.out.println("Размер стека после удаления элемента: " + stack.size());
    }

    public static Deque<Integer> multiplyNumbers(Deque<Integer> num1, Deque<Integer> num2) {
        int carry = 0;
        Deque<Integer> result = new LinkedList<>();

        while (!num1.isEmpty() || !num2.isEmpty()) {
            int digit1 = num1.isEmpty() ? 0 : num1.removeFirst();
            int digit2 = num2.isEmpty() ? 0 : num2.removeFirst();

            int product = digit1 * digit2 + carry;
            carry = product / 10;
            result.addLast(product % 10);
        }

        if (carry > 0) {
            result.addLast(carry);
        }

        return result;
    }

    public static Deque<Integer> addNumbers(Deque<Integer> num1, Deque<Integer> num2) {
        int carry = 0;
        Deque<Integer> result = new LinkedList<>();

        while (!num1.isEmpty() || !num2.isEmpty()) {
            int digit1 = num1.isEmpty() ? 0 : num1.removeFirst();
            int digit2 = num2.isEmpty() ? 0 : num2.removeFirst();

            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            result.addLast(sum % 10);
        }

        if (carry > 0) {
            result.addLast(carry);
        }

        return result;
    }
}

class StackArray {
    private int[] stack;
    private int top;

    public StackArray() {
        stack = new int[100];
        top = -1;
    }

    public int size() {
        return top + 1;
    }

    public boolean empty() {
        return top == -1;
    }

    public void push(int element) {
        stack[++top] = element;
    }

    public int peek() {
        if (empty()) {
            throw new IllegalStateException("Стек пустой");
        }
        return stack[top];
    }

    public int pop() {
        if (empty()) {
            throw new IllegalStateException("Стек пустой");
        }
        return stack[top--];
    }
}