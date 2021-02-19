package offline.pdf.book.model;

public class Topics {
    String topicName;
    String fileName;

    public Topics(String topicName, String fileName) {
        this.topicName = topicName;
        this.fileName = fileName;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
