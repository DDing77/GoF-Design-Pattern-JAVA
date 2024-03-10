package observer;

import observer.observer.Subscriber;
import observer.subject.News;
import observer.subject.Subject;

public class TalkRoomTest {

    public static void main(String[] args) {

        Subject news = new News();

        Subscriber subscriber1 = new Subscriber(news, 1L);
        Subscriber subscriber3 = new Subscriber(news, 3L);
        Subscriber subscriber2 = new Subscriber(news, 2L);

        news.notifyObserver("This is Breaking News!!!");
    }
}
