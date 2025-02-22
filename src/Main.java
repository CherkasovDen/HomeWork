//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Task1
        System.out.println("Задача 1");
        int[] salary = {3000, 1000, 5000, 9000, 7650};
        int sum = 0;
        for (int s : salary) {
            sum = sum + s;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        //Task2
        System.out.println("Задача 2");
        int[] spend = {100, 211, 303, 505, 8};
        int maxSpend = spend[1];
        int minSpend = spend[1];
        for (int i = 0; i < spend.length; i++) {
            if (spend[i] > maxSpend) {
                maxSpend = spend[i];
            }
            if (spend[i] < minSpend) {
                minSpend = spend[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minSpend + " рублей. Максимальная сумма трат за неделю составила " + maxSpend + " рублей");
        //Task3
        System.out.println("Задача 3");
        double spendByMonth = 0;
        for (double k : spend) {
            spendByMonth = spendByMonth + k;
        }
        double spendForWeek = (spendByMonth / 4);
        System.out.println(spendForWeek);
        //Task4
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
