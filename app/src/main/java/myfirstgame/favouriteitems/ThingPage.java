package myfirstgame.favouriteitems;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ThingPage extends AppCompatActivity {


    TextView rank;
    TextView thing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thing_page);

        rank = findViewById(R.id.rankingView);
        thing = findViewById(R.id.thingyView);

        Intent i = getIntent();
        Bundle extras = i.getExtras();
        Integer ranking = extras.getInt("rank");
        String thinged = extras.getString("thing");

        rank.setText(ranking.toString());
        thing.setText(thinged);

    }
}
