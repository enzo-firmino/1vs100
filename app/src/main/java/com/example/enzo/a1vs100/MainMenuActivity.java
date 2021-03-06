package com.example.enzo.a1vs100;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        Button playButton = findViewById(R.id.playButton);

        playButton.setOnClickListener(v -> {
            Intent myIntent = new Intent(MainMenuActivity.this, QuestionsActivity.class);
            startActivity(myIntent);
        });
    }
}
