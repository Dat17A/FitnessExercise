package patterns;

import java.util.ArrayList;

public class Observable {

    private ArrayList<Observer> subscribers =
            new ArrayList<>();

    public void subscribe(Observer o) {
        subscribers.add(o);
    }

    public void notifyMe(String video) {
        System.out.println(video + " was added");
        for(Observer obs : subscribers) {
            obs.notified(video);
        }
    }
    public void postVideo(String video) {
        notifyMe(video);
    }
}
