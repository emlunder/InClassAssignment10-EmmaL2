package com.example.cmltdstudent.inclassassignment10_emmal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Monuments> monuments;
    private MonumentsAdapter monumentsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialData();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        monumentsAdapter = new MonumentsAdapter(monuments, this);
        recyclerView.setAdapter(monumentsAdapter);
    }

    public void addRandomMonument(View view) {
        //populate and increase the list
        monuments.add(getRandomMonument());
        //important line: data has grown and the adapter needs to be told to refresh
        monumentsAdapter.notifyDataSetChanged();
    }

    //3 items to begin with
    private void initialData() {
        monuments = new ArrayList<>();
        monuments.add(new Monuments("Colosseum", "70", R.drawable.colosseum));
        monuments.add(new Monuments("Taj Mahal", "1632", R.drawable.tajmahal));
        monuments.add(new Monuments("Gateway Arch", "1965", R.drawable.gatewayarch));
    }

    private Monuments getRandomMonument() {
        //Xi gave the numbers to random of his initial items so when random goes, the number
        //selected will assign that item
        int num = (int) (Math.random() * 3);
        if (num == 0)
            return new Monuments("Colosseum", "70", R.drawable.colosseum);
        else if (num == 1)
            return new Monuments("Taj Mahal", "1632", R.drawable.tajmahal);
        else
            return new Monuments("Gateway Arch", "1965", R.drawable.gatewayarch);
    }
    }

