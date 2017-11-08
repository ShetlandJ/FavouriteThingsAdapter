package myfirstgame.favouriteitems;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by James on 07/11/2017.
 */

public class TopThingsAdapter extends ArrayAdapter<Thing> {

    public TopThingsAdapter(Context context, ArrayList<Thing> things) {
        super(context, 0, things);
    }

    public View getView(int position, View listItemView, ViewGroup parent){
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.thing_item, parent, false);
        }
        Thing currentThing = getItem(position);

        TextView ranking = listItemView.findViewById(R.id.rankView);
        ranking.setText(currentThing.getRanking().toString());

        TextView title = listItemView.findViewById(R.id.thingView);
        title.setText(currentThing.getThing());

        listItemView.setTag(currentThing);

        return listItemView;
    }



}
