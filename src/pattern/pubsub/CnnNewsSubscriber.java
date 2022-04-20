package pattern.pubsub;

public class CnnNewsSubscriber implements NewsSubscriber{
    @Override
    public void notifyNews(News news) {
        System.out.println("Shock content from CNN: ");
        System.out.println(news.getHeadline());
        System.out.println(news.getContent());
    }
}
