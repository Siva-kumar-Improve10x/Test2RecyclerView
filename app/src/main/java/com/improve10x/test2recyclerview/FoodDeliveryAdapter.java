package com.improve10x.test2recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class FoodDeliveryAdapter extends RecyclerView.Adapter<FoodRv> {
    public Food_items[] items;
    public  FoodDeliveryAdapter(Food_items[] food_items){
        items = food_items;
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
        Food_items food_items = items[position];
        holder.deliveryStatus.setText(food_items.deliveryStatus);
        holder.DeliveryTime.setText(food_items.DeliveryTime);
        holder.rating.setText(food_items.rating);
        holder.userName.setText(food_items.userName);
        holder.location.setText(food_items.location);
        Picasso.get().load(food_items.food).into(holder.food);


    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
