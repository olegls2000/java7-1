package bte.pattern.pubsub;


import java.util.List;

//Publisher
public class NewsSourceAgency {

    private List<NewsSubscriber> newsSubscribers;

    public NewsSourceAgency(List<NewsSubscriber> newsSubscribers) {
        this.newsSubscribers = newsSubscribers;
    }

    public void publish(News news) {
        for (NewsSubscriber subscriber : newsSubscribers) {
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
