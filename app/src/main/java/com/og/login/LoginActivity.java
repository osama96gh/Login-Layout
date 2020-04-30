package com.og.login;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class LoginActivity extends AppCompatActivity {

    ProgressBar continueProgress;
    CardView continueCard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        continueCard = findViewById(R.id.continue_cv);
        continueProgress = findViewById(R.id.continue_pb);
    }

    void showCard() {
        continueCard.setVisibility(View.VISIBLE);
        continueProgress.setVisibility(View.GONE);
    }

    void showProgress() {
        continueCard.setVisibility(View.GONE);
        continueProgress.setVisibility(View.VISIBLE);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                showCard();
            }
        }, 1000);
    }

    public void goNext(View view) {
        if (continueCard.getVisibility() == View.VISIBLE) {
            showProgress();
        } else {
            showCard();
        }
    }


    public void goPrivacyPolicy(View view) {
    }
}
