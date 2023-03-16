package com.improve10x.test2recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DeliveryViewHolderRv extends RecyclerView.ViewHolder {
    public ImageView foodImageIv;
    public TextView itemNameTxt;
    public TextView subItemTxt;
    public TextView servingTxt;
    public TextView estTxt;
    public TextView numTxt;
    public DeliveryViewHolderRv(@NonNull View itemView) {
        super(itemView);
        foodImageIv = itemView.findViewById(R.id.foodIimage_iv);
        itemNameTxt = itemView.findViewById(R.id.itemname_txt);
        subItemTxt = itemView.findViewById(R.id.subitem_txt);
        servingTxt = itemView.findViewById(R.id.serving_txt);
        estTxt = itemView.findViewById(R.id.est_txt);
        numTxt = itemView.findViewById(R.id.num_txt);
    }
}
