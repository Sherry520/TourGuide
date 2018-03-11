package com.example.gyh.tourguide;

public class Information {
    private int mImageResourceId;
    private String mJianjie;
    private String mWorkTime;
    private String mRestaurant;

    public Information(int imageresourceId,String jianjie,String worktime,String restaurant){
        mImageResourceId = imageresourceId;
        mJianjie = jianjie;
        mWorkTime = worktime;
        mRestaurant = restaurant;
    }
    public int getImageResourceId(){
        return mImageResourceId;
    }
    public String getJianjie(){
        return mJianjie;
    }
    public String getWorkTime(){
        return mWorkTime;
    }
    public String getRestaurant(){
        return mRestaurant;
    }
}
