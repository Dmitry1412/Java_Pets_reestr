package Controller;

import Animals.Animals;
import Animals.PetsCommands;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static Animals.Animals.animalsList;
import static java.lang.Integer.parseInt;

public class CtrlFunc {
    /**
     * Выводит список питомцев
     */
    public static void showPets() {
        System.out.println("Список питомцев: ");
        animalsList.forEach(System.out::println);
    }

    /**
     * Выводит список всех команд
     */
    public static void showCommands() {
        System.out.println("Доступные команды: ");
//        Arrays.stream(PetsCommands.values()).toList().forEach(n -> System.out.println(n.toString()));
        int i =1;
        for (PetsCommands e: PetsCommands.values()) {
            System.out.printf("%d %s%n",i, e.toString());
            i++;
        }
    }

    public static ArrayList<Animals> findAnimal() {
        Scanner scanner = new Scanner(System.in);
        int userNum;
        ArrayList<Animals> res = new ArrayList<>();
        System.out.println("Для того чтобы найти питомца выберите критерий поиска:\n" +
                "1 - Поиск по ID\n" +
                "2 - Поиск по имени\n" +
                "0 - Для возврата в предыдущее меню");
        System.out.println(">>> ");
        userNum = scanner.nextInt();
        if (userNum == 1) {
            int idAnimal;
            System.out.println("Введите ID питомца\n" +
                    ">>> ");
            idAnimal = scanner.nextInt();
            for (Animals an : animalsList) {
                if (an.getId() == idAnimal) {
                    res.add(an);
                }
            }
        } else if (userNum == 2) {
            String nameAnimal;
            System.out.println("Введите имя питомца\n" +
                    ">>> ");
            nameAnimal = scanner.next();
            for (Animals an: animalsList) {
                if (an.getName().contains(nameAnimal)){
                    res.add(an);
                }
            }
        } else {
            return res;
        }
        return res;
    }
    public static Integer valueOf(String s) throws NumberFormatException { return parseInt(s); }
}
