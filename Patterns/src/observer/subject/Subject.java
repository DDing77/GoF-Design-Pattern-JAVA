package observer.subject;

import observer.observer.Observer;

public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver(String newsflash);
}
