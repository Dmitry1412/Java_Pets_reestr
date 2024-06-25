package Animals;

import java.util.Arrays;

public enum PetsCommands {
    Сидеть, Лежать, Лапу, Голос, Место, Взять, Но, Стоять;
//    private String command;
//
//    PetsCommands(String command) {
//        this.command = command;
//    }
//    public String getCommand() {return command;}
    public String getcommand(int n){
        return Arrays.stream(PetsCommands.values()).toList().get(n-1).toString();
    }
}
