package com.example.project6;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class show extends Fragment {
    TextView infoView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup rootView= (ViewGroup) inflater.inflate(R.layout.fragment_show, container, false);
        infoView = rootView.findViewById(R.id.infoView);
        return rootView;
    }

    public void information_1(EditText name, EditText age, EditText birth){
        infoView.setText("이름: "+name.getText().toString()+"\n나이: "+age.getText().toString()+"\n생년월일: "+birth.getText().toString());

    }

}







