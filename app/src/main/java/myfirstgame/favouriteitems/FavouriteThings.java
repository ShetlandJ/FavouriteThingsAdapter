package myfirstgame.favouriteitems;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class FavouriteThings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.things_list);

        TopThings topThings = new TopThings();
        ArrayList<Thing> thingList = topThings.getList();

        TopThingsAdapter thingAdapter = new TopThingsAdapter(this, thingList);
        ListView listView = findViewById(R.id.thing_list);
        listView.setAdapter(thingAdapter);

    }


    public void getThing(View listItem){
        Thing thing = (Thing) listItem.getTag();
        Intent i = new Intent(this, ThingPage.class);
        i.putExtra("rank", thing.getRanking()).toString();
        i.putExtra("thing", thing.getThing());
        startActivity(i);
    }

    public int countMyArrayList(ArrayList<Integer> myList){
        int counter = 0;
        for (int number : myList) {
            counter++;
        }
        return counter;
    }

//    def countMyList(myList) {
//        myList.sum();
//    }

}
