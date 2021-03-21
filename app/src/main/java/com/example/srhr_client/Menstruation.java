package com.example.srhr_client;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.srhr_client.adapter.QuesAnsAdapter;
import com.example.srhr_client.model.QuesAns;

import java.util.ArrayList;
import java.util.List;


public class Menstruation extends Fragment {
    View rootView;
    //PDFView pdfView;
    RecyclerView recyclerView;
    QuesAnsAdapter quesAnsAdapter;
    List<QuesAns> quesAnsList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_menstruation, container, false);
        recyclerView = rootView.findViewById(R.id.rv_mens);
        quesAnsList = new ArrayList<>();

        quesAnsList.add(new QuesAns(getString(R.string.ques1Mens),getString(R.string.ans1Mens),"Q1"));

        quesAnsList.add(new QuesAns(getString(R.string.ques2Mens),getString(R.string.ans2Mens),"Q2"));

        quesAnsList.add(new QuesAns(getString(R.string.ques3Mens),getString(R.string.ans3Mens),"Q3"));


        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        quesAnsAdapter = new QuesAnsAdapter(quesAnsList);
        recyclerView.setAdapter(quesAnsAdapter);


        return rootView;
    }
}