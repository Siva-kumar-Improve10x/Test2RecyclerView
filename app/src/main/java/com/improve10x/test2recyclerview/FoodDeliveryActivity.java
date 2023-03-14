package com.improve10x.test2recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class FoodDeliveryActivity extends AppCompatActivity {
    public Food_items[] food_items;
    RecyclerView foodItemsRv;
    FoodDeliveryAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_delivery);
        initViews();
        addData();
        setUpAdapter();
        connectAdapter();

    }

    private void connectAdapter() {
        foodItemsRv.setLayoutManager(new LinearLayoutManager(this));
        foodItemsRv.setAdapter(adapter);
    }

    private void setUpAdapter() {
        adapter = new FoodDeliveryAdapter(food_items);
    }

    private void addData() {
        food_items = new Food_items[4];
        Food_items items = new Food_items();
        items.deliveryStatus = "DELIVERY ON TUESDAY 01";
        items.userName = "B's Balkans H...";
        items.image = "";
        items.location = "ARABIC,INTERNATIONAL";
        items.DeliveryTime = "USUALLY REPLIES ";
        items.rating = "4.8";
        items.minGreen = "12 Min";
        food_items[0] = items;

        Food_items items1 = new Food_items();
        items1.deliveryStatus = "DELIVERY ON MONDAY 31";
        items1.image = "";
        items1.userName = "Syriana";
        items1.location = "SYRIAN ARABIC";
        items1.DeliveryTime = "USUALLY ARPLES WITHIN ";
        items1.rating = "4.3";
        items1.minGreen = "23 Min";
        food_items[1] = items1;

        Food_items items2 = new Food_items();
        items2.deliveryStatus = "DELIVERY ON TUESDAY 01";
        items2.image = "";
        items2.userName = "B's Balkans H...";
        items2.location = "ARABIC INTERNATIONAL";
        items2.DeliveryTime = "USUALLY REPLES WITHIN 12min";
        items2.rating = "4.8";
        items2.minGreen = "12 Min";
        food_items[2] = items2;

    }

    private void initViews() {
        foodItemsRv = findViewById(R.id.food_item_rv);
    }
}