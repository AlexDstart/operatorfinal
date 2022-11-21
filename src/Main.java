public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int clientOS = 0;
        int clientDeviceYear = 2016;
        if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println(" Установите облегченную версию Android по ссылке ");

            } else {
                System.out.println(" Установите обычную версию приложения для Android по ссылке ");
            }
        }
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println(" Установите облегченную версию IOS по ссылке ");

            } else {
                System.out.println(" Установите обычную версию приложения для IOS по ссылке ");
            }
        }
    }
}

