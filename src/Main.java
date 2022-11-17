public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();
        System.out.println("Задача 2");
        int clientOS1 = 0;
        int clientDeviceYear = 2002;

        if (clientDeviceYear >= 2015) {
            if (clientOS1 == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
            if (clientOS1 == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
            System.out.println("Приложение работает корректно");
        } else {
            if (clientOS1 == 0) {
                System.out.println("Установите облегчённую версию приложения для iOS по ссылке");
            }
            if (clientOS1 == 1) {
                System.out.println("Установите облегчённую версию приложения для Android по ссылке");
            }
        }
        System.out.println();
        System.out.println("Задача 3");
        int year = 2020;
        boolean dividesByFour = (year % 4) == 0;
        boolean dividesByHundred = (year % 100) == 0;
        boolean dividesByFourHundred = (year % 400) == 0;
        if ((dividesByFour && !dividesByHundred) || dividesByFourHundred) {
            System.out.println("Год " + year + " високосный");
        } else {
            System.out.println("Год " + year + " НЕ високосный");
        }
        System.out.println();
        System.out.println("Задача 4");
        int deliveryDistance =30;
        int deliveryTime = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (deliveryTime + 1));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (deliveryTime + 2));
        }
        System.out.println();
        System.out.println("Задача 5");
        int monthNumber = 5;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует!");
        }
    }
}