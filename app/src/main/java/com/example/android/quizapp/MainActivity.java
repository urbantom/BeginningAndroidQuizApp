package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    QuizQA quizQA = new QuizQA();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ScrollView scrollview = ((ScrollView) findViewById(R.id.parent));
        scrollview.postDelayed(new Runnable() {
            @Override
            public void run() {
                scrollview.smoothScrollTo(0,0);
            }
        },100);
    }

    public void onG1Q1RadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.radio_g1q1a1:
                if (checked)
                    quizQA.putAnswer(1, 1, "A");
                //Log.v("QuizApp.G1Q1",getResources().getString(R.string.g1q1a1) + " is " + quizQA.checkAnswer(1, 1, "A"));
                break;
            case R.id.radio_g1q1a2:
                if (checked)
                    quizQA.putAnswer(1, 1, "B");
                //Log.v("QuizApp.G1Q1",getResources().getString(R.string.g1q1a2) + " is " + quizQA.checkAnswer(1, 1, "B"));
                break;
            case R.id.radio_g1q1a3:
                if (checked)
                    quizQA.putAnswer(1, 1, "C");
                //Log.v("QuizApp.G1Q1",getResources().getString(R.string.g1q1a3) + " is " + quizQA.checkAnswer(1, 1, "C"));
                break;
            case R.id.radio_g1q1a4:
                if (checked)
                    quizQA.putAnswer(1, 1, "D");
                //Log.v("QuizApp.G1Q1",getResources().getString(R.string.g1q1a4) + " is " + quizQA.checkAnswer(1, 1, "D"));
                break;
        }
    }

    public void onG1Q2RadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.radio_g1q2a1:
                if (checked)
                    quizQA.putAnswer(1, 2, "A");
                //Log.v("QuizApp.G1Q2",getResources().getString(R.string.g1q2a1) + " is " + quizQA.checkAnswer(1, 2, "A"));
                break;
            case R.id.radio_g1q2a2:
                if (checked)
                    quizQA.putAnswer(1, 2, "B");
                //Log.v("QuizApp.G1Q2",getResources().getString(R.string.g1q2a1) + " is " + quizQA.checkAnswer(1, 2, "B"));
                break;
            case R.id.radio_g1q2a3:
                if (checked)
                    quizQA.putAnswer(1, 2, "C");
                //Log.v("QuizApp.G1Q2",getResources().getString(R.string.g1q2a3) + " is " + quizQA.checkAnswer(1, 2, "C"));
                break;
            case R.id.radio_g1q2a4:
                if (checked)
                    quizQA.putAnswer(1, 2, "D");
                //Log.v("QuizApp.G1Q2",getResources().getString(R.string.g1q2a4) + " is " + quizQA.checkAnswer(1, 2, "D"));
                break;

        }
    }

    public void onG2Q1CheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch(view.getId()) {
            case R.id.checkbox_g2q1a1:
                if (checked)
                    quizQA.putAnswer(2, 1, "A");
                else
                    quizQA.delAnswer(2, 1, "A");
                //Log.v("QuizApp.G2Q1",getResources().getString(R.string.g2q1a1) + " is " + quizQA.checkAnswer(2, 1, "A"));
                break;
            case R.id.checkbox_g2q1a2:
                if (checked)
                    quizQA.putAnswer(2, 1, "B");

                else
                    quizQA.delAnswer(2, 1, "B");
                //Log.v("QuizApp.G2Q1",getResources().getString(R.string.g2q1a2) + " is " + quizQA.checkAnswer(2, 1, "B"));
                break;
            case R.id.checkbox_g2q1a3:
                if (checked)
                    quizQA.putAnswer(2, 1, "C");
                else
                    quizQA.delAnswer(2, 1, "C");
                //Log.v("QuizApp.G2Q1",getResources().getString(R.string.g2q1a3) + " is " + quizQA.checkAnswer(2, 1, "C"));
                break;
            case R.id.checkbox_g2q1a4:
                if (checked)
                    quizQA.putAnswer(2, 1, "D");
                else
                    quizQA.delAnswer(2, 1, "D");
                //Log.v("QuizApp.G2Q1",getResources().getString(R.string.g2q1a4) + " is " + quizQA.checkAnswer(2, 1, "D"));
                break;
        }
    }

    public void onG2Q2RadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.radio_g2q2a1:
                if (checked)
                    quizQA.putAnswer(2, 2, "A");
                //Log.v("QuizApp.G2Q2",getResources().getString(R.string.g2q2a1) + " is " + quizQA.checkAnswer(2, 2, "A"));
                break;
            case R.id.radio_g2q2a2:
                if (checked)
                    quizQA.putAnswer(2, 2, "B");
                //Log.v("QuizApp.G2Q2",getResources().getString(R.string.g2q2a2) + " is " + quizQA.checkAnswer(2, 2, "B"));
                break;
            case R.id.radio_g2q2a3:
                if (checked)
                    quizQA.putAnswer(2, 2, "C");
                //Log.v("QuizApp.G2Q2",getResources().getString(R.string.g2q2a3) + " is " + quizQA.checkAnswer(2, 2, "C"));
                break;
            case R.id.radio_g2q2a4:
                if (checked)
                    quizQA.putAnswer(2, 2, "D");
                //Log.v("QuizApp.G2Q2",getResources().getString(R.string.g2q2a4) + " is " + quizQA.checkAnswer(2, 2, "D"));
                break;
        }
    }

    public void onG3Q1CheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch(view.getId()) {
            case R.id.checkbox_g3q1a1:
                if (checked)
                    quizQA.putAnswer(3, 1, "A");
                else
                    quizQA.delAnswer(3, 1, "A");
                //Log.v("QuizApp.G3Q1",getResources().getString(R.string.g3q1a1) + " is " + quizQA.checkAnswer(3, 1, "A"));
                break;
            case R.id.checkbox_g3q1a2:
                if (checked)
                    quizQA.putAnswer(3, 1, "B");

                else
                    quizQA.delAnswer(3, 1, "B");
                //Log.v("QuizApp.G3Q1",getResources().getString(R.string.g3q1a2) + " is " + quizQA.checkAnswer(3, 1, "B"));
                break;
            case R.id.checkbox_g3q1a3:
                if (checked)
                    quizQA.putAnswer(3, 1, "C");
                else
                    quizQA.delAnswer(3, 1, "C");
                //Log.v("QuizApp.G3Q1",getResources().getString(R.string.g3q1a3) + " is " + quizQA.checkAnswer(3, 1, "C"));
                break;
            case R.id.checkbox_g3q1a4:
                if (checked)
                    quizQA.putAnswer(3, 1, "D");
                else
                    quizQA.delAnswer(3, 1, "D");
                //Log.v("QuizApp.G3Q1",getResources().getString(R.string.g3q1a4) + " is " + quizQA.checkAnswer(3, 1, "D"));
                break;
        }
    }

    public void onG3Q2CheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch(view.getId()) {
            case R.id.checkbox_g3q2a1:
                if (checked)
                    quizQA.putAnswer(3, 2, "A");
                else
                    quizQA.delAnswer(3, 2, "A");
                //Log.v("QuizApp.G3Q2",getResources().getString(R.string.g3q2a1) + " is " + quizQA.checkAnswer(3, 2, "A"));
                break;
            case R.id.checkbox_g3q2a2:
                if (checked)
                    quizQA.putAnswer(3, 2, "B");

                else
                    quizQA.delAnswer(3, 2, "B");
                //Log.v("QuizApp.G3Q2",getResources().getString(R.string.g3q2a2) + " is " + quizQA.checkAnswer(3, 2, "B"));
                break;
            case R.id.checkbox_g3q2a3:
                if (checked)
                    quizQA.putAnswer(3, 2, "C");
                else
                    quizQA.delAnswer(3, 2, "C");
                //Log.v("QuizApp.G3Q2",getResources().getString(R.string.g3q2a3) + " is " + quizQA.checkAnswer(3, 2, "C"));
                break;
            case R.id.checkbox_g3q2a4:
                if (checked)
                    quizQA.putAnswer(3, 2, "D");
                else
                    quizQA.delAnswer(3, 2, "D");
                //Log.v("QuizApp.G3Q2",getResources().getString(R.string.g3q2a4) + " is " + quizQA.checkAnswer(3, 2, "D"));
                break;
        }
    }

    public void onCheckAndSubmit(View view) {

        EditText g1q3aEditText = (EditText) findViewById(R.id.g1q3a);
        quizQA.putAnswer(1, 3, g1q3aEditText.getText().toString());

        EditText g2q3aEditText = (EditText) findViewById(R.id.g2q3a);
        quizQA.putAnswer(2, 3, g2q3aEditText.getText().toString());

        EditText g3q3aEditText = (EditText) findViewById(R.id.g3q3a);
        quizQA.putAnswer(3, 3, g3q3aEditText.getText().toString());

        if (quizQA.checkQuiz()) Toast.makeText(this, "Awesome!!!", Toast.LENGTH_SHORT).show();
        else Toast.makeText(this, "Bad news !!!", Toast.LENGTH_SHORT).show();
    }
}