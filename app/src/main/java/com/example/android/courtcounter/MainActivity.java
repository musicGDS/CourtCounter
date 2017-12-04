package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final int THREE_POINTS = 3;
    final int TWO_POINTS = 2;
    final int FREE_THROW = 1;
    public int scoreTeamA = 0;
    public int scoreTeamB = 0;


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

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeTeamA(View view) {
        scoreTeamA += THREE_POINTS;
        displayForTeamA(scoreTeamA);
    }

    public void AddTwoTeamA(View view) {
        scoreTeamA += TWO_POINTS;
        displayForTeamA(scoreTeamA);
    }

    public void AddOneTeamA(View view) {
        scoreTeamA += FREE_THROW;
        displayForTeamA(scoreTeamA);
    }

    public void addThreeTeamB(View view) {
        scoreTeamB += THREE_POINTS;
        displayForTeamB(scoreTeamB);
    }

    public void AddTwoTeamB(View view) {
        scoreTeamB += TWO_POINTS;
        displayForTeamB(scoreTeamB);
    }

    public void AddOneTeamB(View view) {
        scoreTeamB += FREE_THROW;
        displayForTeamB(scoreTeamB);
    }

    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
