package com.improve10x.test2recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class DeliveryProfileActivity extends AppCompatActivity {
    RecyclerView soupsRv;
    DeliveryItems[] deliveryItems;
    DeliveryAdpater adpater;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_profile);
        initView();
        addDummyData();
        setUpAdapter();
        connectAdapter();
    }

    private void connectAdapter() {
        soupsRv.setLayoutManager(new LinearLayoutManager(this));
        soupsRv.setAdapter(adpater);
    }

    private void setUpAdapter() {
        adpater = new DeliveryAdpater(deliveryItems);
    }

    private void addDummyData() {
        deliveryItems = new DeliveryItems[3];
        DeliveryItems items = new DeliveryItems();
        items.foodImage = "https://i.pinimg.com/736x/67/e7/ff/67e7ff9859d6c9df0c30b897bf901e1d.jpg";
        items.item = "Chicken Soup";
        items.subItems = "Chicken, vegetables, butter, tiny pasta, green beans, carrots,...";
        items.serving = "2";
        items.estWeight = "345gr";
        items.number = "8.00$";
        deliveryItems[0] = items;

        DeliveryItems items1 = new DeliveryItems();
        items1.foodImage = "https://i.pinimg.com/736x/67/e7/ff/67e7ff9859d6c9df0c30b897bf901e1d.jpg";
        items1.item = "Chicken Soup";
        items1.subItems = "Chicken, vegetables, butter, tiny pasta, green beans, carrots,...";
        items1.serving = "2";
        items1.estWeight = "345gr";
        items1.number = "8.00$";
        deliveryItems[1] = items1;

        DeliveryItems items2 = new DeliveryItems();
        items2.foodImage = "https://i.pinimg.com/736x/67/e7/ff/67e7ff9859d6c9df0c30b897bf901e1d.jpg";
        items2.item = "Chicken Soup";
        items2.subItems = "Chicken, vegetables, butter, tiny pasta, green beans, carrots,...";
        items2.serving = "2";
        items2.estWeight = "345gr";
        items2.number = "8.00$";
        deliveryItems[2] = items2;


    }

    private void initView() {
        soupsRv = findViewById(R.id.soups_rv);
    }
}