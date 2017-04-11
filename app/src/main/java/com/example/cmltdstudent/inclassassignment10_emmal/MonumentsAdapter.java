package com.example.cmltdstudent.inclassassignment10_emmal;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by cmltdstudent on 4/10/17.
 */

public class MonumentsAdapter extends RecyclerView.Adapter<MonumentsViewHolder> {

    private List<Monuments> monuments;
    private Context context;

    public MonumentsAdapter(List<Monuments> monuments, Context context) {
        this.monuments = monuments;
        this.context = context;
    }

    @Override
    public MonumentsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //how do we create it - with a card view
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_monuments, parent, false);
        return new MonumentsViewHolder(view, context);
    }

    //What happens when a new item loads up and an old item gets recycled
    @Override
    public void onBindViewHolder(MonumentsViewHolder holder, int position) {
        Monuments m = monuments.get(position);
        holder.bind(m);
    }

    //determines how big your recyclerview will be
    @Override
    public int getItemCount() {
        return monuments.size();
    }
}
