package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    public void Love(View view){
        scoreA = scoreA + 0;
        displayForTeamA(scoreA);
    }

    public void point1(View view){
        scoreA = scoreA + 1;
        displayForTeamA(scoreA);
    }

    public void point2(View view){
        scoreA = scoreA + 2;
        displayForTeamA(scoreA);
    }

    public void point3(View view){
        scoreA = scoreA + 3;
        displayForTeamA(scoreA);
    }

    public void point4(View view){
        scoreA = scoreA + 4;
        displayForTeamA(scoreA);
    }

    public void bLove(View view){
        scoreB = scoreB + 0;
        displayForTeamB(scoreB);
    }

    public void bPoint1(View view){
        scoreB = scoreB + 1;
        displayForTeamB(scoreB);
    }

    public void bPoint2(View view){
        scoreB = scoreB + 2;
        displayForTeamB(scoreB);
    }

    public void bPoint3(View view){
        scoreB = scoreB + 3;
        displayForTeamB(scoreB);
    }

    public void bPoint4(View view){
        scoreB = scoreB + 4;
        displayForTeamB(scoreB);
    }

    public void reset(View view){
        int reset = 0;
        scoreA = reset;
        scoreB = reset;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
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
}
