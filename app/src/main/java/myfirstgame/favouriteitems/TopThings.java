package myfirstgame.favouriteitems;

import java.util.ArrayList;

/**
 * Created by James on 07/11/2017.
 */

public class TopThings {

    private ArrayList<Thing> list;

    public TopThings() {
        list = new ArrayList<>();
        list.add(new Thing(1, "My Guitar"));
        list.add(new Thing(2, "Phone"));
        list.add(new Thing(3, "Mac"));
        list.add(new Thing(4, "PS4"));
        list.add(new Thing(5, "Flat? I guess"));
        list.add(new Thing(6, "Better not put wife"));
        list.add(new Thing(7, "Headphones"));
        list.add(new Thing(8, "Generic item"));
        list.add(new Thing(9, "My imagination sucks"));
        list.add(new Thing(10, "I don't actually own that much"));
        list.add(new Thing(11, "Minimalism"));
        list.add(new Thing(12, "FTW"));

    }

    public ArrayList<Thing> getList() {
        return new ArrayList<>(list);
    }

}