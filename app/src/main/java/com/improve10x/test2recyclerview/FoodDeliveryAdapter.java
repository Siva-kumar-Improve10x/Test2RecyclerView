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
        View view = inflater.inflate(R.layout.fooditems,parent,false);
        FoodRv foodRv = new FoodRv(view);
        return foodRv;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodRv holder, int position) {
        Fooditems fooditems = items[position];
        holder.deliveryStatusTxt.setText(fooditems.deliveryStatus);
        holder.DeliveryTimeTxt.setText(fooditems.DeliveryTime);
        holder.ratingTxt.setText(fooditems.rating);
        holder.userNameTxt.setText(fooditems.userName);
        holder.locationTxt.setText(fooditems.location);
        Picasso.get().load(fooditems.food).into(holder.foodIv);


    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
