import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите ваши данные: ");
        String data_user = sc.nextLine();
        System.out.println(data_user);
        System.out.println("Добро пожаловать в игру Морской бой!" + "\n====================================");
        System.out.println("1. Новая игра" + "\n2. Правила" + "\n3. Таблица рекордов" + "\n4. Выйти из игры");

        String choice = sc.nextLine();
        switch (choice) {
            case "1":
                System.out.println("Вы выбрали новую игру.");
                break;
            case "2":
                System.out.println("Правила игры: ...");
                break;
            case "3":
                System.out.println("Таблица рекордов: ...");
                break;
            case "4":
                System.out.println("Выход из игры. До свидания!");
                break;
            default:
                System.out.println("Неверный выбор. Пожалуйста, выберите снова.");
        }
    }
}