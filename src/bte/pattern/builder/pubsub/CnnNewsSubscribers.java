package bte.pattern.builder.pubsub;

public class CnnNewsSubscribers implements NewsSubscriber{
    @Override
    public void notifyNews(News news) {
        System.out.println("Shock news: ");
        System.out.println(news.getContent());
        System.out.println(news.getHeadLine());
    }
}
