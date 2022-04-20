package pattern.pubsub;

public class ErrNewsSubscriber implements  NewsSubscriber{
    @Override
    public void notifyNews(News news) {
        System.out.println("Breaking news from ERR: ");
        System.out.println(news.getHeadline());
        System.out.println(news.getContent());
    }
}
