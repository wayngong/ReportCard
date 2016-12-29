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
    public ReportCardAdapter(Activity content, ArrayList<ReportCard> reportCards) {
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

        // set Course No
        TextView noTextView = (TextView) listItemView.findViewById(R.id.course_no);
        try {
            noTextView.setText(reportCard.getCourseNo());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // set Course Name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.course_name);
        try {
            nameTextView.setText(reportCard.getCourseName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // set Course Score
        TextView scoreTextView = (TextView) listItemView.findViewById(R.id.course_score);
        try {
            scoreTextView.setText("Score "+String.valueOf(reportCard.getCourseScore()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // set Course Ranking
        TextView rankingTextView = (TextView) listItemView.findViewById(R.id.course_ranking);
        try {
            rankingTextView.setText("Rank " + String.valueOf(reportCard.getCourseRanking()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listItemView;
    }
}
