package com.mzdhr.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int mScoreTeamA = 0;
    int mScoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeForTeamA(View v){
        mScoreTeamA = mScoreTeamA + 3;
        displayForTeamA(mScoreTeamA);
    }

    public void addTwoForTeamA(View v){
        mScoreTeamA = mScoreTeamA + 2;
        displayForTeamA(mScoreTeamA);
    }

    public void addOneForTeamA(View v){
        mScoreTeamA = mScoreTeamA + 1;
        displayForTeamA(mScoreTeamA);
    }

    public void addThreeForTeamB(View v){
        mScoreTeamB = mScoreTeamB + 3;
        displayForTeamB(mScoreTeamB);
    }

    public void addTwoForTeamB(View v){
        mScoreTeamB = mScoreTeamB + 2;
        displayForTeamB(mScoreTeamB);
    }

    public void addOneForTeamB(View v){
        mScoreTeamB = mScoreTeamB + 1;
        displayForTeamB(mScoreTeamB);
    }

    public void resetScore(View v){
        mScoreTeamA = 0;
        mScoreTeamB = 0;
        displayForTeamA(mScoreTeamA);
        displayForTeamB(mScoreTeamB);
    }
}
