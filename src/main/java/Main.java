import Animals.Animals;
import Animals.PetsCommands;
import Animals.Dogs;
import Controller.CtrlFunc;
import java.sql.*;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        String url = "jdbc:mysql://localhost:3306/human_friends";
        String user = "root";
        String password = "qqasew";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM animals");

            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name_animal"));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }

        //CtrlFunc.showPets();
        //Introduction();
//        Animals.createAnimal();
//        Animals.setAnimalData();
//
////
////        Animals.createAnimal();
////        Animals.setAnimalData();
////
//        CtrlFunc.showPets();
//        System.out.println(Animals.animalsList.get(0).printCommands());

//        CtrlFunc.showCommands();
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

