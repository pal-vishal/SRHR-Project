package com.example.srhr_client;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.barteksc.pdfviewer.PDFView;

public class Rape extends Fragment {

    View rootView;
    PDFView pdfView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      rootView = inflater.inflate(R.layout.activity_rape,container,false);
      pdfView = rootView.findViewById(R.id.pdf_rape);
      pdfView.fromAsset("rape")
              .enableSwipe(true)
              .swipeHorizontal(true)
              .enableDoubletap(true)
              .defaultPage(0)
              .enableAnnotationRendering(false)
              .password(null) // incase your pdf has a password you can set it here
              .scrollHandle(null)
              .enableAntialiasing(true)
              .spacing(0)
              .load();
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