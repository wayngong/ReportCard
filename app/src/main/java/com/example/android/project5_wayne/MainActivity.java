package com.example.android.project5_wayne;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ReportCard> reportCards = new ArrayList<ReportCard>();
        reportCards.add(new ReportCard("English", 90));
        reportCards.add(new ReportCard("Maths", 100));
        reportCards.add(new ReportCard("Physics", 95));

        ReportCardAdapter mReportCardAdapter = new ReportCardAdapter(this, reportCards);

        ListView listView = (ListView) findViewById(R.id.listView_scores);
        listView.setAdapter(mReportCardAdapter);
    }
}
