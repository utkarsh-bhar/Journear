package com.journear.app;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.journear.app.R;
import com.journear.app.core.entities.NearbyDevices;
import com.journear.app.core.entities.RecyclerViewAdapter;
import com.journear.app.p2p.WiFiServiceDiscoveryActivity;

import java.util.ArrayList;
import java.util.List;

public class JourneyViewActivity extends AppCompatActivity {

    private static final String TAG = "ListActivity";
    private RecyclerView recyclerView;
    private RecyclerViewAdapter recyclerViewAdapter;
    private List<NearbyDevices> devicesList;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        Intent intent = getIntent();
        NearbyDevices nd = intent.getParcelableExtra("EXTRA");
//                Bundle args = intent.getBundleExtra("BUNDLE");
//        ArrayList<NearbyDevices> devicesList1 = (ArrayList<NearbyDevices>) intent.getSerializableExtra("ARRAYLIST");

//        JourneyViewActivity.this.startActivity(new Intent(this, WiFiServiceDiscoveryActivity.class));
//        Handler handler = new Handler();
//
//        handler.postDelayed(new Runnable() {
//            public void run() {
//                finish();
//            }
//        }, 5000);
////        (new Handler()).postDelayed(this::yourMethod, 5000);

//        Intent intent = getIntent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        devicesList = new ArrayList<>();

        NearbyDevices dev = new NearbyDevices("Trinity College Dublin" , "Dublin Spire" , "8hours", "4.5");
        NearbyDevices dev2 = new NearbyDevices("Ram Bhature Wala" , "Karol Bagh" , "8hours", "4.5");
//        NearbyDevices dev3 = new NearbyDevices(nd.getSource() , nd.getDestination() , nd.getTravelTime());
//        devicesList.add(dev);
//        devicesList.add(dev2);
//        devicesList.add(dev3);

        //TODO Sujit
        // devicesList = some source for the data.
        List<NearbyDevices> devices =  WiFiServiceDiscoveryActivity.getDevicesList();
        for (NearbyDevices device:
                devices) {
            devicesList.add(device);
        }

//        for (NearbyDevices device : devicesList) {
//
//            Log.d(TAG, "onCreate: " + device.getSource());
//
//        }

        recyclerViewAdapter = new RecyclerViewAdapter(this, devicesList);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerViewAdapter.notifyDataSetChanged();
    }
}
