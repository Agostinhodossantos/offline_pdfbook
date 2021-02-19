package offline.pdf.book.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;

import java.util.List;

import offline.pdf.book.R;
import offline.pdf.book.model.Chapter;

public class CustomAdapter extends BaseExpandableListAdapter {

    List<Chapter> chapterList;
    Context context;




    //parent size count
    @Override
    public int getGroupCount() {
        return chapterList.size();
    }

    @Override
    public int getChildrenCount(int i) {
        return chapterList.get(i).getTopicsList().size();
    }

    //position set
    @Override
    public Object getGroup(int i) {
        return chapterList.get(i);
    }

    @Override
    public Object getChild(int i, int i1) {
        return chapterList.get(i).getTopicsList().get(i1);
    }

    //id
    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int i, int i1) {
        return i1;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {

        view = LayoutInflater.from(context).inflate(R.layout.chapter_item , viewGroup , false);


        return view;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {

        view = LayoutInflater.from(context).inflate(R.layout.topic_item , viewGroup , false);

        return view;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return true;
    }
}
