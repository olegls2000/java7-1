package bte.pattern.pubsub;

public class DelfiNewsSubscriber implements NewsSubscriber {
    @Override
    public void notifyNews(News news) {
        System.out.println("Uudis Delfist: ");
        System.out.println(news.getHeadline());
        System.out.println(news.getContent());
    }
}