package com.example.srhr_client;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class FaqChoices extends Fragment implements RecyclerViewClick {
    private RecyclerView rv;
    FaqAdapter faqAdapter;
    List<String>categories;
    View rootView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       rootView = inflater.inflate(R.layout.activity_faq_choices,container,false);
        rv = rootView.findViewById(R.id.rv_faq);
        categories = new ArrayList<>();
        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        faqAdapter = new FaqAdapter(categories,this);
        rv.setAdapter(faqAdapter);

        categories.add("ABORTION");
        categories.add("PCPNDT");
        categories.add("RAPE");
        categories.add("SAFE SEX & STD");
        categories.add("PUBERTY");
       return rootView;
    }



    @Override
    public void onItemClick(int position) {
        NavController navController = Navigation.findNavController(getActivity(), R.id.fragment);
        switch(position){
            case 2:
                navController.navigate(R.id.action_faqChoices3_to_rape);
                break;
            case 4:
                navController.navigate(R.id.action_faqChoices3_to_puberty);
                break;

        }
    }
}