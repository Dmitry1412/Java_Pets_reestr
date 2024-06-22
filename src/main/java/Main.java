import Animals.Animals;
import Animals.PetsCommands;
import Animals.Dogs;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Introduction();
//Animals dog1 = new Dogs(1, "Rex", 5, 8, 2019, null);
//        System.out.println(dog1);
//
        Scanner scanner = new Scanner(System.in);
        System.out.println("Для добавления нового питомца, необходимо заполнить анкету.\n");
        System.out.println("Укажите тип питомца:\n" +
                "Dogs - 1\n" +
                "Cats - 2\n" +
                "Hamsters - 3\n" +
                "Hourses - 4\n" +
                "Donkeys - 5\n" +
                "Camels - 6\n" +
                "Для отмены - 0");
        int typePet = scanner.nextInt();
        if (typePet == 1){
            Dogs d = d.createAnimal();
        }
    }


    public static void Introduction(){
        System.out.println("Добро пожаловать в приют животных");
        System.out.println("в программе реализован следующий функционал:");
        System.out.println("1. Добавить новое животное \n" +
                "2. Внести изменения в основную информацию о животном \n" +
                "3. Увидеть список команд, которым обучено животное \n" +
                "4. Обучить животное новой команде");
        System.out.println("Для продолжения нажмите любую клавишу");
        System.out.println(">>>");
        String pressToContinue;
        Scanner scanner = new Scanner(System.in);
        pressToContinue = scanner.next();
        if (pressToContinue != null) System.out.println("Ok");
        else System.out.println("False");
    }
}
