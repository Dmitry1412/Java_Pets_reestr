import Animals.Animals;
import Animals.PetsCommands;
import Animals.Dogs;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Introduction();
//        Animals.createAnimal();
//        Animals.setAnimalData();
    }

public static void Control(){
        int quit = 1;
while(quit != 0){

}
    System.out.println("Работа программы завершена");
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
