package com.improve10x.test2recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FoodRv extends RecyclerView.ViewHolder {
    public TextView deliveryStatus;
    public TextView userName;
    public TextView location;
    public TextView DeliveryTime;
    public TextView rating;
    public ImageView food;

    public FoodRv(@NonNull View itemView) {
        super(itemView);
        deliveryStatus = itemView.findViewById(R.id.deliveryStatus_txt);
        userName = itemView.findViewById(R.id.userName_txt);
        location = itemView.findViewById(R.id.location_txt);
        DeliveryTime = itemView.findViewById(R.id.minGreen_txt);
        rating = itemView.findViewById(R.id.rating_txt);
        food = itemView.findViewById(R.id.food_iv);
    }
}
