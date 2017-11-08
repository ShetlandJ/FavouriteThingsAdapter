package myfirstgame.favouriteitems;

import android.media.Image;

/**
 * Created by James on 07/11/2017.
 */

public class Thing {

    private Integer ranking;
    private String thing;
    private Image pic;

    public Thing(Integer ranking, String thing) {
        this.ranking = ranking;
        this.thing = thing;
    }

    public Integer getRanking() {
        return ranking;
    }

    public String getThing() {
        return thing;
    }

    public Image getPic() {
        return pic;
    }
}

