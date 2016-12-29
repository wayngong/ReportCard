package com.example.android.project5_wayne;

import static android.R.attr.level;
import static android.R.attr.name;

/**
 * Created by gongkai on 2016/12/28.
 * one ReportCard refer to one score in one course
 * score is an integer between 1 and 100
 */

public class ReportCard {
    private String mCourseNo;
    private String mCourseName;
    private int mCourseScore;
    private String mRanking;

    public ReportCard(String courseNo, String name, int score, int rank, int totalAmount){
        mCourseNo = courseNo;
        mCourseName = name;
        if( score > -1 && score < 101 ) mCourseScore = score;
        mRanking = (String.valueOf(rank) + "/" + String.valueOf(totalAmount));
    }

    // default constructor
    public ReportCard(){
        mCourseNo = "C0123";
        mCourseName = "Maths Junior Level";
        mCourseScore = 0;
        mRanking = "30/30";
    }

    // Set Subject Name for ReportCard
    public void setCourseName(String name){mCourseName = name;}

    // get Subject Name for ReportCard
    public String getCourseName(){return mCourseName;}

    // Set Course No for ReportCard
    public void setCourseNo(String courseNO) {mCourseNo = courseNO;}

    // get Course No for ReportCard
    public String getCourseNo(){return mCourseNo;}

    // Set Course Score for ReportCard
    public void setCourseScore(int score){mCourseScore = score;}

    // get Course Score for ReportCard
    public int getCourseScore(){return mCourseScore;}

    // Set Course Ranking for ReportCard
    public void setCourseRanking(int rank, int totalAmount){mRanking = (String.valueOf(rank) + "/" + String.valueOf(totalAmount));}

    // get Course Score for ReportCard
    public String getCourseRanking(){return mRanking;}

    @Override
    public String toString() {
        return "ReportCard{" +
                "CourseNo='" + mCourseNo + '\'' +
                ", CourseName='" + mCourseName + '\'' +
                ", CourseScore=" + mCourseScore +
                ", Ranking='" + mRanking + '\'' +
                '}';
    }
}
