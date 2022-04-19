package bte.pattern.pubsub;

public class CnnNewsSubscriber implements NewsSubscriber {
    @Override
    public void notifyNews(News news) {
        System.out.println("Shock news from CNN: ");
        System.out.println(news.getHeadLine());
        System.out.println(news.getContent());

    }
}
