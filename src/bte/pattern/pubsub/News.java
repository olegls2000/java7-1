package bte.pattern.pubsub;

public class News {
    private String headLine;
    private  String content;

    public News(String headLine, String content) {
        this.headLine = headLine;
        this.content = content;
    }

    public String getHeadLine() {
        return headLine;
    }

    public String getContent() {
        return content;
    }
}
