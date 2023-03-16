package com.improve10x.test2recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class DeliveryAdpater extends RecyclerView.Adapter<DeliveryViewHolderRv> {
    DeliveryItems[] delivery;
    public DeliveryAdpater(DeliveryItems[] deliveryItems){
        delivery = deliveryItems;
    }
    @NonNull
    @Override
    public DeliveryViewHolderRv onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.fooddeliveryitems,parent,false);
        DeliveryViewHolderRv holderRv = new DeliveryViewHolderRv(view);
        return holderRv;
    }

    @Override
    public void onBindViewHolder(@NonNull DeliveryViewHolderRv holder, int position) {
        DeliveryItems food = delivery[position];
        holder.itemNameTxt.setText(food.item);
        holder.subItemTxt.setText(food.subItems);
        holder.servingTxt.setText(food.serving);
        holder.estTxt.setText(food.estWeight);
        holder.numTxt.setText(food.number);
        Picasso.get().load(food.foodImage).into(holder.foodImageIv);

    }

    @Override
    public int getItemCount() {
        return delivery.length;
    }
}
