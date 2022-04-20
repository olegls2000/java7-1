package bte.pattern.builder.pubsub;

public class ErrNewsSubscribers implements NewsSubscriber{
    @Override
    public void notifyNews(News news) {
        System.out.println("Breaking news: ");
        System.out.println(news.getContent());
        System.out.println(news.getHeadLine());
    }
}
