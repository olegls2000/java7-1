package pattern.pubsub;

public class DelfiNewsSubscriber implements NewsSubscriber {
    @Override
    public void notifyNews(News news) {
        System.out.println("DELFI uudised: ");
        System.out.println(news.getHeadline());
        System.out.println(news.getContent());
    }
}
