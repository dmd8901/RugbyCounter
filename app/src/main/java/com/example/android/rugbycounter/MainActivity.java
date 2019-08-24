package com.example.android.rugbycounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamLeft = (0);
    int scoreTeamRight = (0);

    /**Saves current score*/
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt("newScoreLeft", scoreTeamLeft);
        outState.putInt("newScoreRight", scoreTeamRight);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**Loads old Score if the old score isn't zero*/
        if (savedInstanceState != null) {
            scoreTeamLeft= savedInstanceState.getInt("newScoreLeft");
            scoreTeamRight = savedInstanceState.getInt("newScoreRight");
            displayForScoreTeamLeft(scoreTeamLeft);
            displayForScoreTeamRight(scoreTeamRight);
        }
    }

    /**
     * Team Sharks buttons
     *
     */
    /*
    This method is called when the TryPlusFive button is clicked this adds 5
     */
   public void TryPlusFiveRight (View view){
       scoreTeamRight = scoreTeamRight +5;
       displayForScoreTeamRight(scoreTeamRight);
   }


    /*
    This method is called when the ConversionPlusTwoLeft button is clicked this adds 2
     */
    public void ConversionPlusTwoRight (View view){
       scoreTeamRight = scoreTeamRight +2;
        displayForScoreTeamRight(scoreTeamRight);
    }
    /*
    This method is called when the DropGoalPlusThreeLeft button is clicked this adds 3
     */
    public void DropGoalPlusThreeRight (View view){
        scoreTeamRight = scoreTeamRight +3;
        displayForScoreTeamRight(scoreTeamRight);
    }

    /**
     *
     * Team M0nkeyZ Buttons
     */
        /*
    This method is called when the TryPlusFive button is clicked this adds 5
     */
    public void TryPlusFiveLeft (View view){
        scoreTeamLeft = scoreTeamLeft +5;
        displayForScoreTeamLeft(scoreTeamLeft);
    }


    /*
    This method is called when the ConversionPlusTwoLeft button is clicked this adds 2
     */
    public void ConversionPlusTwoLeft (View view){
        scoreTeamLeft = scoreTeamLeft +2;
        displayForScoreTeamLeft(scoreTeamLeft);
    }
    /*
    This method is called when the DropGoalPlusThreeLeft button is clicked this adds 3
     */
    public void DropGoalPlusThreeLeft (View view){
        scoreTeamLeft = scoreTeamLeft +3;
        displayForScoreTeamLeft(scoreTeamLeft);
    }
   /*
   This method will reset the score back to ZERO when clicked
    */
    public void ResetToZero (View view){
        scoreTeamLeft = 0;
        scoreTeamRight =0;
        displayForScoreTeamLeft(scoreTeamLeft);
        displayForScoreTeamRight(scoreTeamRight);
    }
    /*
    This method display whatever is given for scoreTeamLeft
     */
    public void displayForScoreTeamLeft (int score){
        TextView scoreView = (TextView) findViewById(R.id.score_number_left);
        scoreView.setText (String.valueOf(score));
    }
    /*
    This method display whatever is given for scoreTeamRight
     */

    public void displayForScoreTeamRight (int score){
        TextView scoreView = (TextView) findViewById(R.id.score_number_right);
        scoreView.setText (String.valueOf(score));
    }
}
