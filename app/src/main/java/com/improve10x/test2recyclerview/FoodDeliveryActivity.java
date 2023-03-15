package com.improve10x.test2recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class FoodDeliveryActivity extends AppCompatActivity {
    public Fooditems[] foodItems;
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
        adapter = new FoodDeliveryAdapter(foodItems);
    }

    private void addData() {
        foodItems = new Fooditems[3];
        Fooditems items = new Fooditems();
        items.deliveryStatus = "DELIVERY ON TUESDAY 01";
        items.userName = "B's Balkans H...";
        items.food = "https://b.zmtcdn.com/data/pictures/chains/5/19721465/d9de2792f8b74bda5d9d55ba3201ed9e.jpg?fit=around|771.75:416.25&crop=771.75:416.25;*,*";
        items.location = "ARABIC,INTERNATIONAL";
        items.DeliveryTime = "USUALLY REPLIES ";
        items.rating = "4.8";
        items.minGreen = "12 Min";
        foodItems[0] = items;

        Fooditems items1 = new Fooditems();
        items1.deliveryStatus = "DELIVERY ON MONDAY 31";
        items1.food = "https://b.zmtcdn.com/data/pictures/chains/5/19721465/d9de2792f8b74bda5d9d55ba3201ed9e.jpg?fit=around|771.75:416.25&crop=771.75:416.25;*,*";
        items1.userName = "Syriana";
        items1.location = "SYRIAN ARABIC";
        items1.DeliveryTime = "USUALLY ARPLES WITHIN ";
        items1.rating = "4.3";
        items1.minGreen = "23 Min";
        foodItems[1] = items1;

        Fooditems items2 = new Fooditems();
        items2.deliveryStatus = "DELIVERY ON TUESDAY 01";
        items2.food = "https://b.zmtcdn.com/data/pictures/chains/5/19721465/d9de2792f8b74bda5d9d55ba3201ed9e.jpg?fit=around|771.75:416.25&crop=771.75:416.25;*,*";
        items2.userName = "B's Balkans H...";
        items2.location = "ARABIC INTERNATIONAL";
        items2.DeliveryTime = "USUALLY REPLES WITHIN 12min";
        items2.rating = "4.8";
        items2.minGreen = "12 Min";
        foodItems[2] = items2;

    }

    private void initViews() {
        foodItemsRv = findViewById(R.id.food_item_rv);
    }
}