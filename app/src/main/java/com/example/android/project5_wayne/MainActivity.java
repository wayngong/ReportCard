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
        reportCards.add(new ReportCard("C0101","English Junior Level", 90, 1, 20));
        reportCards.add(new ReportCard("C0102","Physics Senior Level", 80, 4, 20));
        reportCards.add(new ReportCard("C0103","Maths Junior Level", 90, 2, 20));

        ReportCardAdapter mReportCardAdapter = new ReportCardAdapter(this, reportCards);

        ListView listView = (ListView) findViewById(R.id.listView_scores);
        listView.setAdapter(mReportCardAdapter);
    }
}
