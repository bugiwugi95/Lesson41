package task6;

import java.util.Scanner;

public class Task1 {
    //Реализуйте метод equals для класса FileInformation. Покажите, работает?
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        String name = arr[0];
        String massage = arr[1];
        FileInformation fileInformation = new FileInformation(name,massage);
        builder.insert(0,"Экземпля класса FileInformation создан:\n");
        builder.append(fileInformation);
        String str1 = builder.toString();
        System.out.println(str1);

    }
}