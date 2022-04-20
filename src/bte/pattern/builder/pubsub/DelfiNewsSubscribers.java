package bte.pattern.builder.pubsub;

public class DelfiNewsSubscribers implements NewsSubscriber{
    @Override
    public void notifyNews(News news) {
        System.out.println("Uudis Delfists: ");
        System.out.println(news.getContent());
        System.out.println(news.getHeadLine());
    }
}
