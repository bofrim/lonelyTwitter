package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by bradofrim on 2018-01-16.
 */

public abstract class Mood {
    private Date date;

    Mood() {
        this.date = new Date();
    }

    Mood(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    abstract public String getMood();
}
