import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {

        //Task1
        System.out.println("Задача 1");
        int year = 1021;
        checkVysokosniyGod(year);

        //Task 2
        System.out.println("Задача 2");
        int clientOS = 0;
        int clientDeviceYear = 2024;
        downloadApp(clientOS, clientDeviceYear);

//        Task 3
        System.out.println("Задача 3");
        int deliveryDistance = 80;
        int deliveryDays = deliveryTime(deliveryDistance);
        if (deliveryDays == 0) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: " + deliveryDays);
        }
    }


    //      method for Task1
    public static void checkVysokosniyGod(int year) {
        if (year > 1584 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    //      method for Task2
    public static void downloadApp(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0) {
            if (clientDeviceYear == currentYear) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear == currentYear) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }

    //          method for Task3
    public static int deliveryTime(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            return 2;
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            return 3;
        } else {
            return 0;
        }
    }

}
