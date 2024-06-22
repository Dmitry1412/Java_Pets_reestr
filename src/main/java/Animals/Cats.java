package Animals;

import java.util.ArrayList;

public class Cats extends Pets{
    public Cats(int id, String name, int bDay, int bMonth, int bYear, ArrayList<String> commands) {
        super(id, name, bDay, bMonth, bYear, "Cats", commands);
    }
}
