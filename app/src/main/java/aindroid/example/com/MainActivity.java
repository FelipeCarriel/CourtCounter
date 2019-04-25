package aindroid.example.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0;
    int scoreB = 0;

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

    public void buttonA3(View v){
        scoreA+=3;
        displayForTeamA(scoreA);
    }

    public void buttonA2(View v){
        scoreA+=2;
        displayForTeamA(scoreA);
    }

    public void buttonA1(View v){
        scoreA+=1;
        displayForTeamA(scoreA);
    }


    public void buttonB1(View view) {
        scoreB+=1;
        displayForTeamB(scoreB);
    }

    private void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void buttonB2(View view) {
        scoreB+=2;
        displayForTeamB(scoreB);
    }

    public void buttonB3(View view) {
        scoreB+=3;
        displayForTeamB(scoreB);
    }

    public void reset(View view) {
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
}
