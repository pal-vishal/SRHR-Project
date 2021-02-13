package com.example.srhr_client;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class FaqChoices extends AppCompatActivity {
    private RecyclerView rv;
    FaqAdapter faqAdapter;
    List<String>categories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq_choices);
        rv = findViewById(R.id.rv_faq);
        categories = new ArrayList<>();
        rv.setLayoutManager(new LinearLayoutManager(this));
        faqAdapter = new FaqAdapter();
        rv.setAdapter(faqAdapter);

        categories.add("ABORTION");
        categories.add("PCPNDT");
        categories.add("RAPE");
        categories.add("SAFE SEX & STD");
        categories.add("PUBERTY");
    }
}