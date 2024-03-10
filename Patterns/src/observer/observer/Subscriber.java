package observer.observer;

import observer.display.Display;
import observer.subject.Subject;

import java.util.ArrayList;
import java.util.List;

public class Subscriber implements Observer, Display {

    private Subject subject;
    private List<String> breakingNews;
    private Long id;

    public Subscriber(Subject subject, Long id) {
        this.subject = subject;
        subject.registerObserver(this);
        breakingNews = new ArrayList<>();
        this.id = id;
    }

    @Override
    public void alarm(String message) {
        breakingNews.add(message);
        display(message);
    }

    @Override
    public void display(String message) {
        System.out.println("[My id] : " + id + " , Received Message : " + message);
    }
}
