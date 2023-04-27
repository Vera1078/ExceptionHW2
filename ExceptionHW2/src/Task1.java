// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
// вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        setNumber();
    }

    public static void setNumber() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дробное число: ");
        String num = scanner.nextLine();

        try {
            float number = Float.parseFloat(num);
            System.out.println("Вы ввели: " + number);

        } catch (NumberFormatException e){
            System.out.println("Вы ввели НЕ дробное число!");
            setNumber();
        }
        scanner.close();
    }
}
