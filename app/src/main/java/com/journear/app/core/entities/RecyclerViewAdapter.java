package com.journear.app.core.entities;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;

import com.journear.app.R;

import java.util.List;

public class RecyclerViewAdapter extends Adapter<RecyclerViewAdapter.ViewHolder> {

   private Context context;
   private List<NearbyDevices> devicesList;
    public RecyclerViewAdapter(Context context, List<NearbyDevices> devicesList) {
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.nearby_devices,parent, false);

        return new ViewHolder(view,context);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
            NearbyDevices devices = devicesList.get(position);
            holder.source.setText(devices.getSource());
            holder.source.setText(devices.getDestination());
            holder.source.setText(devices.getTravelTime());
    }

    @Override
    public int getItemCount() {
        return devicesList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView source;
        public TextView destination;
        public TextView travelTime;
        public TextView user_rating;
        public Button findSource;
        public Button findRoute;
        public Button edit;
        public Button delete;
        public int id;
        public ViewHolder(@NonNull View devicesList , Context ctx) {
            super(devicesList);
            context = ctx;
            source = devicesList.findViewById(R.id.source);
            destination = devicesList.findViewById(R.id.destination);
            travelTime = devicesList.findViewById(R.id.travelTime);




        }
    }
}
