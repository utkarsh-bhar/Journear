package com.journear.app.core.entities;


import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.journear.app.R;

import java.util.ArrayList;
import java.util.List;

public class JourneyViewActivity extends AppCompatActivity {

    private static final String TAG = "ListActivity";
    private RecyclerView recyclerView;
    private RecyclerViewAdapter recyclerViewAdapter;
    private List<NearbyDevices> devicesList;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        devicesList = new ArrayList<NearbyDevices>();
        NearbyDevices dev = new NearbyDevices("Trinity College Dublin" , "Dublin Spire" , "8hours", "4.5");

        devicesList.add(dev);
        //TODO Nikhil Sujit
        // devicesList = some source for the data.

        for (NearbyDevices devices : devicesList) {

            Log.d(TAG, "onCreate: " + devices.getSource());

        }

        recyclerViewAdapter = new RecyclerViewAdapter(this, devicesList);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerViewAdapter.notifyDataSetChanged();



    }

}
