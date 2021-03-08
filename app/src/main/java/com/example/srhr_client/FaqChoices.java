package com.example.srhr_client;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;



import java.util.ArrayList;
import java.util.List;

public class FaqChoices extends Fragment implements RecyclerViewClick {
    private RecyclerView rv;
    FaqAdapter faqAdapter;
    List<String> categories;
    View rootView;
    private NavController navController;
    private Toolbar toolbar;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.activity_faq_choices, container, false);
        rv = rootView.findViewById(R.id.rv_faq);
        toolbar = rootView.findViewById(R.id.main_toolbar);

        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Select Category");


        categories = new ArrayList<>();
        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        faqAdapter = new FaqAdapter(categories, this);
        rv.setAdapter(faqAdapter);

        categories.add("PUBERTY");
        categories.add("MENSTRUATION");
        categories.add("SAFE SEX & STD");
        categories.add("RAPE");
        categories.add("PCPNDT");
        categories.add("FAQ");


        navController = Navigation.findNavController(getActivity(), R.id.fragment);

        setHasOptionsMenu(true);
        return rootView;
    }


    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.options_menu, menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.aboutUs:
                navController.navigate(R.id.action_faqChoices3_to_aboutUs);
                return true;
            case R.id.contactUs:
                navController.navigate(R.id.action_faqChoices3_to_contactUs);
                return true;
            case R.id.inviteFriend:
                navController.navigate(R.id.action_faqChoices3_to_inviteFriend);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemClick(int position) {
        navController = Navigation.findNavController(getActivity(), R.id.fragment);
        switch (position) {
            case 0:
                navController.navigate(R.id.action_faqChoices3_to_puberty);
                break;
            case 1:
              //  navController.navigate(R.id.action_faqChoices3_to_menstruation);
              //  break;
            case 2:
                navController.navigate(R.id.action_faqChoices3_to_safesex);
                break;
            case 3:
                navController.navigate(R.id.action_faqChoices3_to_rape);
                break;
            case 4:
                navController.navigate(R.id.action_faqChoices3_to_PCNPDT);
                break;
            case 5:
                navController.navigate(R.id.action_faqChoices3_to_abortion);
                break;
            case 6:
                navController.navigate(R.id.action_faqChoices3_to_appFaq);
                break;

        }
    }
}