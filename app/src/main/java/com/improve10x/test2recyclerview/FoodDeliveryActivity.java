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
        items.userUrl = "";
        items.deliveryStatus = " TUESDAY 01";
        items.userName = "B's Balkans H...";
        items.foodUrl = "https://b.zmtcdn.com/data/pictures/chains/5/19721465/d9de2792f8b74bda5d9d55ba3201ed9e.jpg?fit=around|771.75:416.25&crop=771.75:416.25;*,*";
        items.userLocation = "ARABIC,INTERNATIONAL";
        items.DeliveryTime = "12min";
        items.rating = "4.8";
        foodItems[0] = items;

        Fooditems items1 = new Fooditems();
        items1.userUrl = "";
        items1.deliveryStatus = " MONDAY 31";
        items1.foodUrl = "https://b.zmtcdn.com/data/pictures/chains/5/19721465/d9de2792f8b74bda5d9d55ba3201ed9e.jpg?fit=around|771.75:416.25&crop=771.75:416.25;*,*";
        items1.userName = "Syriana";
        items1.userLocation = "SYRIAN ARABIC";
        items1.DeliveryTime = "23 Min";
        items1.rating = "4.3";
        foodItems[1] = items1;

        Fooditems items2 = new Fooditems();
        items2.userUrl = "";
        items2.deliveryStatus = " TUESDAY 01";
        items2.foodUrl = "https://b.zmtcdn.com/data/pictures/chains/5/19721465/d9de2792f8b74bda5d9d55ba3201ed9e.jpg?fit=around|771.75:416.25&crop=771.75:416.25;*,*";
        items2.userName = "B's Balkans H...";
        items2.userLocation = "ARABIC INTERNATIONAL";
        items2.DeliveryTime = "12min";
        items2.rating = "4.8";
        foodItems[2] = items2;

    }

    private void initViews() {
        foodItemsRv = findViewById(R.id.food_item_rv);
    }
}