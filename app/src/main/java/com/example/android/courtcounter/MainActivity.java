package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.mipmap.ic_launcher);
    }
    public void addOneForTheTeamA(View v){
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }
    public void addOneForTheTeamB(View v){
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }
    public void addTwoForTheTeamA(View v){
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }
    public void addTwoForTheTeamB(View v){
        scoreTeamB +=2;
        displayForTeamB(scoreTeamB);
    }
    public void addTreeForTheTeamA(View v){
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }
    public void addTreeForTheTeamB(View v){
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }
    public void resetScoreView(View v){
        scoreTeamB = 0;
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
