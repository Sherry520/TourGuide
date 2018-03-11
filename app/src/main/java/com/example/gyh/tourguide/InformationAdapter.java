package com.example.gyh.tourguide;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by gyh on 2016/10/16.
 */

public class InformationAdapter extends ArrayAdapter<Information> {
    public InformationAdapter(Context context, ArrayList<Information> informations) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, informations);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_information, parent, false);
        }

        Information currentInformation = getItem(position);

        ImageView imageView = (ImageView)listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentInformation.getImageResourceId());

        TextView jianjie = (TextView)listItemView.findViewById(R.id.jianjieTextView);
        jianjie.setText(currentInformation.getJianjie());

        TextView workTime = (TextView)listItemView.findViewById(R.id.workTimeTextView);
        workTime.setText(currentInformation.getWorkTime());

        TextView restaurant = (TextView)listItemView.findViewById(R.id.restaurantTextView);
        restaurant.setText(currentInformation.getRestaurant());

        return listItemView;
    }
}
