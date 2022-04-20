package pattern.pubsub;

import java.util.List;

public class NewSourceAgency {
    private List<NewsSubscriber> newsSubscriber;

    public NewSourceAgency(List<NewsSubscriber> newsSubscriber) {
        this.newsSubscriber = newsSubscriber;
    }

    public void publish(News news) {
        for (NewsSubscriber subscr: newsSubscriber) {
            subscr.notifyNews(news);
        }
    }

    public void addNewSubscriber(NewsSubscriber subscriber) {
        newsSubscriber.add(subscriber);
    }
    public void removeSubscriber(int subscriberIndex) {
        newsSubscriber.remove(subscriberIndex);
    }
}
