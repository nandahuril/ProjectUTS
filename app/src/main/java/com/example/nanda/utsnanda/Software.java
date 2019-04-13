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

public class Software extends AppCompatActivity {

    private RecyclerView list_item;
    private android.support.v7.widget.LinearLayoutManager LinearLayoutManager;
    private List<ItemObject> itemObjects;
    private AdapterItem adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_software);

        /*casting variable*/
        list_item = (RecyclerView)findViewById(R.id.lst_item);

        /*memasukkan layout ini ke recyclerView*/
        LinearLayoutManager = new LinearLayoutManager(this);
        list_item.setLayoutManager(LinearLayoutManager);


        itemObjects = new ArrayList<>();
        itemObjects.add(new ItemObject("Instal ulang Windows 7", "Rp.50000",R.drawable.win7));
        itemObjects.add(new ItemObject("Instal ulang Windows 10", "Rp.50000",R.drawable.windwos10));
        itemObjects.add(new ItemObject("Instal ulang Linux", "Rp.50000",R.drawable.linuxx));
        itemObjects.add(new ItemObject("Instalasi Game", "Rp.25000",R.drawable.game));
        itemObjects.add(new ItemObject("Instalasi Software", "Rp.20000",R.drawable.sotfware));

        /*membuat adapter*/
        adapter = new AdapterItem(getApplicationContext(),itemObjects);
        /*masukkan ke recyclerview*/
        list_item.setAdapter(adapter);
    }

    public  void detail (View view) {
        Intent r = new Intent(Software.this, Detail.class);
        startActivity(r);
    }
}
