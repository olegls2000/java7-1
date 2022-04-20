package bte.pattern.builder.pubsub;

import java.util.List;

public class NewsSourceAgency {
    private List<NewsSubscriber> newsSubscribers;
    public NewsSourceAgency(List<NewsSubscriber> newsSubscribers){
        this.newsSubscribers = newsSubscribers;
    }
public void publicNews(News news){
    for (NewsSubscriber subscriber : newsSubscribers){
      subscriber.notifyNews(news);
    }
}
    public void addNewSubscriber(NewsSubscriber subscriber) {
        newsSubscribers.add(subscriber);
    }

    public void removeSubscriber(int subscriberIndex) {
        newsSubscribers.remove(subscriberIndex);
    }
}
