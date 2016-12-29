package com.tldn1.recyclerviewgridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    GridLayoutManager grid;
    ArrayList<FoodModel>arrayList= new ArrayList<>();
    String[] foodName = {"Pizza","Spaghette","Hot Dog","Salad","Sushi","Soup","Ham","Hamburger","Apple"};
    //Sry because of same images i just dont wanted to waste my time on adding images u will anyway add your own
    int[] foodImages = {R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        grid = new GridLayoutManager(this,3);
        recyclerView.setLayoutManager(grid);
        recyclerView.setHasFixedSize(true);
        for(int i=0;i<foodName.length;i++){
            FoodModel model = new FoodModel(foodName[i],foodImages[i]);
            arrayList.add(model);
        }
        adapter = new RecyclerAdapter(arrayList);
        recyclerView.setAdapter(adapter);

    }
}
