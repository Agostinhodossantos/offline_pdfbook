package offline.pdf.book.model;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
    String chapterName;
    List<Topics> topicsList = new ArrayList<>();

    public Chapter(String chapterName, List<Topics> topicsList) {
        this.chapterName = chapterName;
        this.topicsList = topicsList;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public List<Topics> getTopicsList() {
        return topicsList;
    }

    public void setTopicsList(List<Topics> topicsList) {
        this.topicsList = topicsList;
    }
}
