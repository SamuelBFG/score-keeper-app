package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;
    int foulsA = 0;
    int foulsB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayScoreA(scoreA);
        displayScoreB(scoreB);
        displayFoulsA(foulsA);
        displayFoulsB(foulsB);
    }

    //Displays @param score on TextView team_a_score.
    public void displayScoreA(int score) {
        TextView scoreA = (TextView) findViewById(R.id.team_a_score);
        scoreA.setText(String.valueOf(score));
    }

    //Displays @param score on TextView team_b_score.
    public void displayScoreB(int score) {
        TextView scoreB = (TextView) findViewById(R.id.team_b_score);
        scoreB.setText(String.valueOf(score));
    }

    //Displays @param fouls on TextView team_a_fouls.
    public void displayFoulsA(int fouls) {
        TextView foulsA = (TextView) findViewById(R.id.team_a_fouls);
        foulsA.setText(String.valueOf(fouls));
    }

    //Displays @param fouls on TextView team_b_fouls.
    public void displayFoulsB(int fouls) {
        TextView foulsB = (TextView) findViewById(R.id.team_b_fouls);
        foulsB.setText(String.valueOf(fouls));
    }

    //Increments score A
    public void incrementScoreA(View view){
        scoreA++;
        displayScoreA(scoreA);
    }

    //Increments score B
    public void incrementScoreB(View view){
        scoreB++;
        displayScoreB(scoreB);
    }

    //Increments fouls A
    public void incrementFoulsA(View view){
        foulsA++;
        displayFoulsA(foulsA);
    }

    //Increments fouls B
    public void incrementFoulsB(View view){
        foulsB++;
        displayFoulsB(foulsB);
    }

}
