package com.example.srhr_client;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class LastScreen extends AppCompatActivity {
    private RecyclerView rv_list;
    LSAdapter lsAdapter;
    List<String>options;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last_screen);

        rv_list = findViewById(R.id.rv_list);
        options = new ArrayList<>();
        rv_list.setLayoutManager(new LinearLayoutManager(this));
        lsAdapter = new LSAdapter(options);
        rv_list.setAdapter(lsAdapter);

        options.add("About Us");
        options.add("Videos");
        options.add("Your Learning");
        options.add("Contact Us");
        options.add("Invite Friends");
        options.add("Privacy Policy");

    }
}