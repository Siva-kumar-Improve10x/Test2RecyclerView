package com.improve10x.test2recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class FoodDeliveryAdapter extends RecyclerView.Adapter<FoodRv> {
    public Fooditems[] items;
    public  FoodDeliveryAdapter(Fooditems[] foodItems){
        items = foodItems;
    }
    @NonNull
    @Override
    public FoodRv onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.relative_pratice,parent,false);
        FoodRv foodRv = new FoodRv(view);
        return foodRv;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodRv holder, int position) {
        Fooditems fooditems = items[position];
        Picasso.get().load(fooditems.foodUrl).into(holder.foodPicIv);
        holder.deliveryStatusTxt.setText(fooditems.deliveryStatus);
        Picasso.get().load(fooditems.userUrl).into(holder.userUrlIv);
        holder.userNameTxt.setText(fooditems.userName);
        holder.userlocationTxt.setText(fooditems.userLocation);
        holder.DeliveryTimeTxt.setText(fooditems.DeliveryTime);
        holder.ratingTxt.setText(fooditems.rating);



    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
