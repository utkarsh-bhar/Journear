package com.journear.app.core.entities;



import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class NearbyDevices implements Parcelable {
        private int id;
        private String source;
        private String destination;
        private String travelTime;
        private String user_rating;
        User user1 = new User();
        public NearbyDevices(){

        }
        public NearbyDevices(String source,String destination, String travelTime, String user_rating){
            this.source = source;
            this.destination = destination;
            this.travelTime = travelTime;
            this.user_rating = user_rating;
        }

      public NearbyDevices(String source,String destination, String travelTime){
            this.source = source;
            this.destination = destination;
            this.travelTime = travelTime;

        }

        public NearbyDevices(int id, String source, String destination, String travelTime, String user_rating){
            this.id = id;
            this.source = source;
            this.destination = destination;
            this.travelTime = travelTime;
            this.user_rating = user_rating;

        }


    protected NearbyDevices(Parcel in) {

        source = in.readString();
        destination = in.readString();
        travelTime = in.readString();

    }

    public static final Creator<NearbyDevices> CREATOR = new Creator<NearbyDevices>() {
        @Override
        public NearbyDevices createFromParcel(Parcel in) {
            return new NearbyDevices(in);
        }

        @Override
        public NearbyDevices[] newArray(int size) {
            return new NearbyDevices[size];
        }
    };

    public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getDestination() {
            return destination;
        }

        public void setDestination(String destination) {
            this.destination = destination;
        }

        public String getTravelTime() {
            return travelTime;
        }

        public void setTravelTime(String travelTime) {
            this.travelTime = travelTime;
        }

        public String getUser_rating() {
            return user_rating;
        }

        public void setUser_rating(String user_rating) {
            this.user_rating = user_rating;
        }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public String toString() {
        return "NearbyDevices{" +
                "id=" + id +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", travelTime='" + travelTime + '\'' +
                ", user_rating='" + user_rating + '\'' +
                ", user1=" + user1 +
                '}';
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(source);
        dest.writeString(destination);
        dest.writeString(travelTime);

    }
}