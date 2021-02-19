package offline.pdf.book.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.List;

import offline.pdf.book.R;
import offline.pdf.book.adapter.CustomAdapter;
import offline.pdf.book.model.Chapter;
import offline.pdf.book.model.Topics;

public class MainActivity extends AppCompatActivity {

    ExpandableListView expandableListView;
    CustomAdapter customAdapter;
    List<Chapter> chapterList;
    List<Topics> topicsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        expandableListView = (ExpandableListView) findViewById(R.id.expandedListView);

        addData();
    }

    private void sendData() {
        customAdapter = new CustomAdapter(chapterList , MainActivity.this);
        expandableListView.setAdapter(customAdapter);
    }

    private void addData() {
        //single time
        chapterList = new ArrayList<>();
        topicsList = new ArrayList<>();


        //chapter 1
        topicsList.add( new Topics("Topic 1" , ""));
        topicsList.add( new Topics("Topic 2" , ""));
        topicsList.add( new Topics("Topic 3" , ""));
        topicsList.add( new Topics("Topic 4" , ""));
        chapterList.add(new Chapter("",topicsList));

        //chapter 2
        topicsList = new ArrayList<>();
        topicsList.add( new Topics("Topic 1" , ""));
        topicsList.add( new Topics("Topic 2" , ""));
        topicsList.add( new Topics("Topic 3" , ""));
        topicsList.add( new Topics("Topic 4" , ""));
        chapterList.add(new Chapter("",topicsList));

        //chapter 3
        topicsList = new ArrayList<>();
        topicsList.add( new Topics("Topic 1" , ""));
        topicsList.add( new Topics("Topic 2" , ""));
        topicsList.add( new Topics("Topic 3" , ""));
        topicsList.add( new Topics("Topic 4" , ""));
        chapterList.add(new Chapter("",topicsList));
        sendData();
    }
}
