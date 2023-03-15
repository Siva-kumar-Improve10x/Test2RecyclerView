package com.improve10x.test2recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class DeliveryProfileActivity extends AppCompatActivity {
    RecyclerView soupsRv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_profile);
        initView();
    }

    private void initView() {
        soupsRv = findViewById(R.id.soups_rv);
    }
}