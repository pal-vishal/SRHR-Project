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

public class LastScreen extends Fragment implements RecyclerViewClick {
    private RecyclerView rv_list;
    LSAdapter lsAdapter;
    List<ButtonNames>options;

    View rootView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.activity_last_screen,container,false);
        rv_list = rootView.findViewById(R.id.rv_list);
        options = new ArrayList<>();
        rv_list.setLayoutManager(new LinearLayoutManager(getContext()));
        lsAdapter = new LSAdapter(options,this);
        rv_list.setAdapter(lsAdapter);


        options.add(new ButtonNames("About Us"));
        options.add(new ButtonNames("Videos"));
        options.add(new ButtonNames("Contact Us"));
        options.add(new ButtonNames("Invite Friends"));
        options.add(new ButtonNames("Privacy Policy"));



        /*
        options.add("ABORTION");
        options.add("PCPNDT");
        options.add("RAPE");
        options.add("SAFE SEX & STD");
        options.add("PUBERTY");

         */
        return rootView;
    }


    @Override
    public void onItemClick(int position) {
         NavController navController = Navigation.findNavController(getActivity(), R.id.fragment);
         if (position==2){
             navController.navigate(R.id.action_lastScreen_to_faqChoices3);
         }

    }
}