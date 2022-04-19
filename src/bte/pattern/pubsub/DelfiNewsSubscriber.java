package bte.pattern.pubsub;

public class DelfiNewsSubscriber implements NewsSubscriber {
    @Override
    public void notifyNews(News news) {
        System.out.println("Uudis DELFIst: ");
        System.out.println(news.getHeadLine());
        System.out.println(news.getContent());
    }
}
