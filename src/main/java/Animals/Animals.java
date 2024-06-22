package Animals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Animals {
    int id, bYear, bMonth, bDay;
    String name, type_animal;
    public boolean isPet;
    ArrayList<String> commands = new ArrayList<>();
    LocalDate birthday;

    List<Animals> animalsList = new ArrayList<>();

    public Animals(int id, String name, int bDay, int bMonth, int bYear, boolean isPet,
                   String type_animal, ArrayList<String> commands) {
        this.id = id;
        this.isPet = isPet;
        this.name = name;
        this.type_animal = type_animal;
        this.birthday = LocalDate.of(bYear,bMonth,bDay);
        this.commands = commands;
    }

    @Override
    public String toString() {
        return ("id: "+ id + " "+ type_animal + " " + name + " Дата рождения: " + birthday);
    }
    public int getId() {
        return id;
    }

    public boolean isPet() {
        return isPet;
    }

    public String getType_animal() {
        return type_animal;
    }
    public void createAnimal(){
        Scanner scanner = new Scanner(System.in);
        int idAnimal, typeAnimal;
        int[] bitrhdayAnimal = new int[3];
        ArrayList<String> commands = new ArrayList<>();
        String nameAnimal;
        System.out.println("Для добавления нового питомца, необходимо заполнить анкету.\n");
        System.out.println("Укажите тип питомца:\n" +
                "Dogs - 1\n" +
                "Cats - 2\n" +
                "Hamsters - 3\n" +
                "Hourses - 4\n" +
                "Donkeys - 5\n" +
                "Camels - 6\n" +
                "Для отмены - 0");
        System.out.println(">>> ");
        typeAnimal = scanner.nextInt();
        switch (typeAnimal){
            case(1):
                idAnimal = setID(animalsList);
                nameAnimal = setName();
                bitrhdayAnimal = setBirthday();
                Animals dog = new Dogs(idAnimal,nameAnimal,bitrhdayAnimal[0],bitrhdayAnimal[1],bitrhdayAnimal[2],commands);
                animalsList.add(dog);
                break;
            case(2):
                idAnimal = setID(animalsList);
                nameAnimal = setName();
                bitrhdayAnimal = setBirthday();
                Animals cat = new Cats(idAnimal,nameAnimal,bitrhdayAnimal[0],bitrhdayAnimal[1],bitrhdayAnimal[2],commands);
                animalsList.add(cat);
                break;
            case(3):
                idAnimal = setID(animalsList);
                nameAnimal = setName();
                bitrhdayAnimal = setBirthday();
                Animals hamster = new Hamsters(idAnimal,nameAnimal,bitrhdayAnimal[0],bitrhdayAnimal[1],bitrhdayAnimal[2],commands);
                animalsList.add(hamster);
                break;
            case(4):
                idAnimal = setID(animalsList);
                nameAnimal = setName();
                bitrhdayAnimal = setBirthday();
                Animals hourse = new Hourses(idAnimal,nameAnimal,bitrhdayAnimal[0],bitrhdayAnimal[1],bitrhdayAnimal[2],commands);
                animalsList.add(hourse);
                break;
            case(5):
                idAnimal = setID(animalsList);
                nameAnimal = setName();
                bitrhdayAnimal = setBirthday();
                Animals donkey = new Donkeys(idAnimal,nameAnimal,bitrhdayAnimal[0],bitrhdayAnimal[1],bitrhdayAnimal[2],commands);
                animalsList.add(donkey);
                break;
            case(6):
                idAnimal = setID(animalsList);
                nameAnimal = setName();
                bitrhdayAnimal = setBirthday();
                Animals camel = new Camels(idAnimal,nameAnimal,bitrhdayAnimal[0],bitrhdayAnimal[1],bitrhdayAnimal[2],commands);
                animalsList.add(camel);
                break;
        }
    }
    protected String setName(){
        String result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя питомца: ");
        System.out.println(">>> ");
        result = scanner.next();
        return result;
    }
    protected int[] setBirthday(){
        int[] result = new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату рождения питомца в формате DD-MM-YYYY");
        System.out.println("Введите Day");
        System.out.println(">>> ");
        result[0] = scanner.nextInt();
        System.out.println("Введите MM");
        System.out.println(">>> ");
        result[1] = scanner.nextInt();
        System.out.println("Введите YYYY");
        System.out.println(">>> ");
        result[2] = scanner.nextInt();
        return result;
    }

    protected int setID(List<Animals> list){
        int result = 0;
        if (list.isEmpty()){
            return 1;
        } else {
            return result++;
        }
    }
}
