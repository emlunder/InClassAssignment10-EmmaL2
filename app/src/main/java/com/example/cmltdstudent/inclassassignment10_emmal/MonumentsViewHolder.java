package com.example.cmltdstudent.inclassassignment10_emmal;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by cmltdstudent on 4/10/17.
 */

public class MonumentsViewHolder extends RecyclerView.ViewHolder{

    private CardView cardView;
    private TextView monumentNameView;
    private TextView monumentInfoView;
    private ImageView monumentPhotoView;
    private Context context;

    public MonumentsViewHolder(View itemView, Context context) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.card_view);
        monumentNameView = (TextView) itemView.findViewById(R.id.monument_name);
        monumentInfoView = (TextView) itemView.findViewById(R.id.monument_info);
        monumentPhotoView = (ImageView) itemView.findViewById(R.id.monument_photo);
        this.context = context;
    }

    public void bind(final Monuments monuments) {
        monumentNameView.setText(monuments.name);
        monumentInfoView.setText(monuments.info);
        monumentPhotoView.setImageResource(monuments.photoId);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //When you click on the card view the name will come up
                Intent i = new Intent(context, MonumentsInfo.class);
                i.putExtra(Keys.MONUMENTS, monuments);
                context.startActivity(i);
                Toast.makeText(context, monumentNameView.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
