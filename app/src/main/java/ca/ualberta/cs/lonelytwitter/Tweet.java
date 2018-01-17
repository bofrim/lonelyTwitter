package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by bradofrim on 2018-01-16.
 */

public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;
    private ArrayList <Mood> moods;

    Tweet(String message) {
        this.message = message;
        this.date = new Date();
        moods = new ArrayList<Mood>();
    }

    Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
        moods = new ArrayList<Mood>();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if(message.length() < 280) {
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void addMood(Mood mood) {
        this.moods.add(mood);
    }

    public abstract Boolean isImportant();
}
