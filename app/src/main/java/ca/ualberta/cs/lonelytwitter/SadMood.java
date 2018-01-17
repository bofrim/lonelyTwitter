package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by bradofrim on 2018-01-16.
 */

public class SadMood extends Mood {
    SadMood() {
        super();
    }

    SadMood(Date date) {
        super(date);
    }

    @Override
    public String printMood() {
        return "Sad";
    }
}
