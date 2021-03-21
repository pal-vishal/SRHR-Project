package com.example.srhr_client.model;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.akexorcist.localizationactivity.ui.LocalizationActivity;
import com.example.srhr_client.MainActivity;
import com.example.srhr_client.R;

public class LanguageActivity extends LocalizationActivity {

    Button hindiButton , englishButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language2);

        hindiButton = findViewById(R.id.hindiButon);
        englishButton = findViewById(R.id.englishButton);

        hindiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                setLanguage("hi", "In");
                Intent intent = new Intent(LanguageActivity.this,MainActivity.class);
                startActivity(intent);

            }
        });



        englishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                setLanguage("en", "US");
                Intent intent = new Intent(LanguageActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });


    }
}