import Animals.Animals;
import Animals.PetsCommands;
import Animals.Dogs;
import Controller.CtrlFunc;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String a,b;
        a = "qwerty";
        b = "qwe";
        if (a.contains(b)) System.out.println(1);
            else System.out.println(0);

        //CtrlFunc.showPets();
        //Introduction();
//        Animals.createAnimal();
//        Animals.setAnimalData();
//        Animals.showPets();
//        //showCommands();
    }

public static void Control(){
        int quit = 1;
while(quit != 0){

}
    System.out.println("Работа программы завершена");
}
    public static void introduction(){
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

