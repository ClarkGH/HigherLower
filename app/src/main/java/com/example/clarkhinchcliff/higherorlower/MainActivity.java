package com.example.clarkhinchcliff.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;
    String message = "";

    public void checkGuess(View view) {
        EditText guessedNumber = (EditText) findViewById(R.id.numberTextField);
        String guessedNumberString = guessedNumber.getText().toString();
        int guessedNumberInt = Integer.parseInt(guessedNumberString);

        if (guessedNumberInt == randomNumber) {
            message = "Perfect, you got it!";
        } else if (guessedNumberInt > randomNumber) {
            message = "A little too high";
        } else if (guessedNumberInt < randomNumber) {
            message = "Too low";
        } else {
            message = "Please enter a number";
        }
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Random randomGenerator = new Random();

        randomNumber = randomGenerator.nextInt(21);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
