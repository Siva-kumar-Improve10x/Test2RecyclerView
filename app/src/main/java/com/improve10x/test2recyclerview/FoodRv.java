package com.improve10x.test2recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FoodRv extends RecyclerView.ViewHolder {
    public ImageView userUrlIv;
    public TextView deliveryStatusTxt;
    public TextView userNameTxt;
    public TextView userlocationTxt;
    public TextView DeliveryTimeTxt;
    public TextView ratingTxt;
    public ImageView foodPicIv;

    public FoodRv(@NonNull View itemView) {
        super(itemView);
        deliveryStatusTxt = itemView.findViewById(R.id.deliverystatus_txt);
        userNameTxt = itemView.findViewById(R.id.user_txt);
        userlocationTxt = itemView.findViewById(R.id.userlocation_txt);
        DeliveryTimeTxt = itemView.findViewById(R.id.deliverytime_txt);
        ratingTxt = itemView.findViewById(R.id.rating_txt);
        foodPicIv = itemView.findViewById(R.id.biriyani_iv);
        userUrlIv = itemView.findViewById(R.id.user_iv);
    }
}
