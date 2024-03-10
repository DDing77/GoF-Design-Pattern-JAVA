package observer.subject;

import observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class News implements Subject {

    private List<Observer> observers;
    private String newsflash;

    public News() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver(String newsflash) {
        for (Observer observer : observers) {
            observer.alarm(newsflash);
        }
    }

    public void pushNewsflash(String newsflash) {
        setNewsflash(newsflash);
        notifyObserver(newsflash);
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    public String getNewsflash() {
        return newsflash;
    }

    public void setNewsflash(String newsflash) {
        this.newsflash = newsflash;
    }
}
