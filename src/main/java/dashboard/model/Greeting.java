package dashboard.model;

public class Greeting {

    private String content;

    private String topic;

    public Greeting() {
    }

    public Greeting(String content, String topic) {
        this.content = content;
        this.topic = topic;
    }

    public String getContent() {
        return content;
    }

    public String getTopic() {
        return topic;
    }

}
