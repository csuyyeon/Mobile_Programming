package com.example.project6;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class information extends Fragment {

    public static interface infoCallback {
        public void information_1(EditText name, EditText age, EditText birth);
    }

    EditText name, age, birth;

    public infoCallback callback;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        if (context instanceof infoCallback) {
            callback = (infoCallback) context;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_information, container, false);
        Button button1 = rootView.findViewById(R.id.button);
        name = rootView.findViewById(R.id.name);
        age = rootView.findViewById(R.id.age);
        birth = rootView.findViewById(R.id.birth);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (callback != null) {
                    callback.information_1(name, age, birth);
                }
            }
        });
        return rootView;
    }
}