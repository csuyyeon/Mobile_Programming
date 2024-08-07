package com.example.project6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements information.infoCallback{

    information information;
    show show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_launcher);
        setTitle("과제6_20190636최수연");

        FragmentManager manager = getSupportFragmentManager();
        information = (information) manager.findFragmentById(R.id.information);
        show = (show) manager.findFragmentById(R.id.show);

    }
        public void information_1(EditText name, EditText age, EditText birth)
        {
            show.information_1(name,age,birth);
        }


}