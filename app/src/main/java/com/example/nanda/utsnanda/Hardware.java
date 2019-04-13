package com.example.nanda.utsnanda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.nanda.utsnanda.Adapter.AdapterItem;

import java.util.ArrayList;
import java.util.List;

public class Hardware extends AppCompatActivity {

    private RecyclerView list_item;
    private android.support.v7.widget.LinearLayoutManager LinearLayoutManager;
    private List<ItemObject> itemObjects;
    private AdapterItem adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hardware);


        /*casting variable*/
        list_item = (RecyclerView)findViewById(R.id.lst_item);

        /*memasukkan layout ini ke recyclerView*/
        LinearLayoutManager = new LinearLayoutManager(this);
        list_item.setLayoutManager(LinearLayoutManager);


        itemObjects = new ArrayList<>();
        itemObjects.add(new ItemObject("Perawatan full service", "Rp.150000",R.drawable.service1));
        itemObjects.add(new ItemObject("Ganti Keyboard", "Rp.250000",R.drawable.keyb));
        itemObjects.add(new ItemObject("Ganti LCD", "Rp.500000",R.drawable.lcd));
        itemObjects.add(new ItemObject("Upgrade RAM DDR3 4GB", "Rp.325000",R.drawable.ddr34));
        itemObjects.add(new ItemObject("Upgrade RAM DDR3 8GB", "Rp.575000",R.drawable.ram2));
        itemObjects.add(new ItemObject("Upgrade RAM DDR3L 4GB", "Rp.450000",R.drawable.ram2));
        itemObjects.add(new ItemObject("Upgrade RAM DDR3L 8GB", "Rp.625000",R.drawable.ddr34));
        itemObjects.add(new ItemObject("Upgrade RAM DDR4 4GB", "Rp.525000",R.drawable.ram2));
        itemObjects.add(new ItemObject("Upgrade RAM DDR4 8GB", "Rp.910000",R.drawable.ram2));
        itemObjects.add(new ItemObject("Upgrade SSD 120", "Rp.350000",R.drawable.ssd));
        itemObjects.add(new ItemObject("Upgrade SSD 240", "Rp.605000",R.drawable.ssd));
        itemObjects.add(new ItemObject("Upgrade SSD 512", "Rp.1325000",R.drawable.ssd));
        itemObjects.add(new ItemObject("Upgrade SSD 1TB", "Rp.3525000",R.drawable.ssd));
        itemObjects.add(new ItemObject("Upgrade hardisk 240", "Rp.375000",R.drawable.hdd));
        itemObjects.add(new ItemObject("Upgrade hardisk 320", "Rp.530000",R.drawable.hdd));
        itemObjects.add(new ItemObject("Upgrade hardisk 512", "Rp.68000",R.drawable.hdd));
        itemObjects.add(new ItemObject("Upgrade hardisk 1TB", "Rp.910000",R.drawable.hdd));
        /*membuat adapter*/
        adapter = new AdapterItem(getApplicationContext(),itemObjects);
        /*masukkan ke recyclerview*/
        list_item.setAdapter(adapter);

    }

    public  void detail (View view) {
        Intent r = new Intent(Hardware.this, Detail.class);
        startActivity(r);
    }
}
