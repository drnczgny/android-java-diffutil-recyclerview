package com.example.adrian.android_java_diffutil;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvList;
    private Button btnSort;
    private Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvList = (RecyclerView) findViewById(R.id.rvList);
        btnSort = (Button) findViewById(R.id.btnSort);
        btnReset = (Button) findViewById(R.id.btnReset);

        final List<Person> defaultPersonList = DataProvider.getDefaultPersonList();
        final PersonAdapter personAdapter = new PersonAdapter(defaultPersonList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        rvList.setLayoutManager(mLayoutManager);
        rvList.setItemAnimator(new DefaultItemAnimator());
        rvList.setAdapter(personAdapter);

        btnSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<Person> newList = DataProvider.getNewPersonList();
                personAdapter.updateList((ArrayList<Person>) newList);
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<Person> defaultList = DataProvider.getDefaultPersonList();
                personAdapter.updateList((ArrayList<Person>) defaultList);
            }
        });
    }
}
