package com.example.srhr_client;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.srhr_client.adapter.QuesAnsAdapter;
import com.example.srhr_client.model.QuesAns;

import java.util.ArrayList;
import java.util.List;

public class safesex extends Fragment {

    View rootView;
    RecyclerView recyclerView;
    QuesAnsAdapter quesAnsAdapter;
    List<QuesAns> quesAnsList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.activity_safesex, container, false);
        recyclerView = rootView.findViewById(R.id.textView17);

        quesAnsList = new ArrayList<>();

        quesAnsList.add(new QuesAns(getString(R.string.ques1Safe), getString(R.string.ans1Safe), "Q1. "));
        quesAnsList.add(new QuesAns(getString(R.string.ques2Safe), getString(R.string.ans2Safe), "Q2. "));
        quesAnsList.add(new QuesAns(getString(R.string.ques3Safe), getString(R.string.ans3Safe), "Q3. "));
        quesAnsList.add(new QuesAns(getString(R.string.ques4Safe), getString(R.string.ans4Safe), "Q4. "));
        quesAnsList.add(new QuesAns(getString(R.string.ques5Safe), getString(R.string.ans5Safe), "Q5. "));
        quesAnsList.add(new QuesAns(getString(R.string.ques6Safe), getString(R.string.ans6Safe), "Q6. "));
        quesAnsList.add(new QuesAns(getString(R.string.historySafe), getString(R.string.ansHistorySafe), " "));

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        quesAnsAdapter = new QuesAnsAdapter(quesAnsList);
        recyclerView.setAdapter(quesAnsAdapter);

        return rootView;
    }
}