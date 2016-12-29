package com.example.android.project5_wayne;

/**
 * Created by gongkai on 2016/12/28.
 * one ReportCard refer to one score in one subject
 * score is an integer between 1 and 100
 */

public class ReportCard {
    private String mSubjectName;
    private int mSubjectScore;

    public ReportCard(String name, int score){
        mSubjectName = name;
        if( score > -1 && score < 101 ) mSubjectScore = score;
    }

    // default constructor
    public ReportCard(){
        mSubjectName = "Subject Name";
        mSubjectScore = 0;
    }

    // Set Subject Name for ReportCard
    public void setSubjectName(String name){mSubjectName = name;}

    // get Subject Name for ReportCard
    public String getSubjectName(){return mSubjectName;}

    // Set Subject ReportCard for ReportCard
    public void setSubjectScore(int score){mSubjectScore = score;}

    // get Subject ReportCard for ReportCard
    public int getSubjectScore(){return mSubjectScore;}
}
