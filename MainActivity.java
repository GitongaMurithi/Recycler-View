package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);

        ArrayList<Model>arrayList=new ArrayList<>();
        arrayList.add(new Model(R.drawable.bottle3));
        arrayList.add(new Model(R.drawable.bottle4));
        arrayList.add(new Model(R.drawable.packedwater));
        arrayList.add(new Model(R.drawable.bottle5));
        arrayList.add(new Model(R.drawable.bottle6));
        arrayList.add(new Model(R.drawable.waterbottle2));
        arrayList.add(new Model(R.drawable.bottle3));
        arrayList.add(new Model(R.drawable.packedwater));
        arrayList.add(new Model(R.drawable.waterbottle2));
        arrayList.add(new Model(R.drawable.bottle3));

        Adapter adapter=new Adapter();
        adapter.setArrayList(arrayList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));





    }
}