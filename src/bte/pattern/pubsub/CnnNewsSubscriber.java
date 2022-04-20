package bte.pattern.pubsub;

import static bte.util.Print.print;

public class CnnNewsSubscriber implements NewsSubscriber {
    @Override
    public void notifyNews(News news) {
        System.out.println("Shok ews from CNN: ");
        System.out.println(news.getHeadline());
        System.out.println(news.getContent());
    }
}