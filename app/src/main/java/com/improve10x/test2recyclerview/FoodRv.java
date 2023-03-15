package com.improve10x.test2recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FoodRv extends RecyclerView.ViewHolder {
    public TextView deliveryStatusTxt;
    public TextView userNameTxt;
    public TextView locationTxt;
    public TextView DeliveryTimeTxt;
    public TextView ratingTxt;
    public ImageView foodIv;

    public FoodRv(@NonNull View itemView) {
        super(itemView);
        deliveryStatusTxt = itemView.findViewById(R.id.deliveryStatus_txt);
        userNameTxt = itemView.findViewById(R.id.userName_txt);
        locationTxt = itemView.findViewById(R.id.location_txt);
        DeliveryTimeTxt = itemView.findViewById(R.id.minGreen_txt);
        ratingTxt = itemView.findViewById(R.id.rating_txt);
        foodIv = itemView.findViewById(R.id.food_iv);
    }
}
