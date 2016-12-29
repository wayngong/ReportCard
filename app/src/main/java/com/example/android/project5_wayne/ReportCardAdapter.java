package com.example.android.project5_wayne;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by gongkai on 2016/12/28.
 */

public class ReportCardAdapter extends ArrayAdapter<ReportCard> {

    // constructor
    public ReportCardAdapter(Activity content, ArrayList<ReportCard> reportCards){
        super(content, 0, reportCards);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // get object located at this position
        ReportCard reportCard = getItem(position);

        // set Subject Name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.subject_name);
        try{nameTextView.setText(reportCard.getSubjectName());}
        catch(Exception e){e.printStackTrace();}

        // set Subject ReportCard
        TextView scoreTextView = (TextView) listItemView.findViewById(R.id.subject_score);
        try{scoreTextView.setText(String.valueOf(reportCard.getSubjectScore()));}
        catch (Exception e){e.printStackTrace();}

        return listItemView;
    }
}
