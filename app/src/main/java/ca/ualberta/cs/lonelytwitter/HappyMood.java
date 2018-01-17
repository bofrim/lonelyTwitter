package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by bradofrim on 2018-01-16.
 */

public class HappyMood extends Mood {

    HappyMood() {
        super();
    }

    HappyMood(Date date) {
        super(date);
    }

    @Override
    public String getMood() {
        return "Happy";
    }
}
