import bte.pattern.pubsub.News;
import bte.pattern.pubsub.NewsSubscriber;

public class DelfiNewsSubscriber implements NewsSubscriber {
    @Override
    public void notifyNews(News news) {
        System.out.println("Uudis Delfist: ");
        System.out.println(news.getHeadline());
        System.out.println(news.getContent());
    }
}