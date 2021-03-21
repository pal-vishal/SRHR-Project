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
import com.github.barteksc.pdfviewer.PDFView;

import java.util.ArrayList;
import java.util.List;

public class Rape extends Fragment {

    View rootView;
    //PDFView pdfView;
    RecyclerView recyclerView;
    QuesAnsAdapter quesAnsAdapter;
    List<QuesAns> quesAnsList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.activity_rape, container, false);
        recyclerView = rootView.findViewById(R.id.rapeRecyclerView);

        quesAnsList = new ArrayList<>();

        quesAnsList.add(new QuesAns(getString(R.string.ques1Rape),getString(R.string.ans1Rape), "Q1. "));
    // quesAnsList.add(new QuesAns(getString(R.string.ques2Rape), getString(R.string.ans2Rape), "Q2. "));
        quesAnsList.add(new QuesAns(getString(R.string.ques3Rape), getString(R.string.ans3Rape), "Q2. "));

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        quesAnsAdapter = new QuesAnsAdapter(quesAnsList);
        recyclerView.setAdapter(quesAnsAdapter);

        return rootView;
    }

    /*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rape);
    }

     */
}