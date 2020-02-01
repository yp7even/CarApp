package com.example.carapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;


public class Pokeadapter extends RecyclerView.Adapter<Pokeadapter.ViewHolder>{

    private ArrayList<carModel> carArray;
    private Context c;
    private View.OnClickListener pokelistner;


    public Pokeadapter(ArrayList<carModel> carArray) {
        this.carArray = carArray;
    }

    public void setOnItemClickListner(View.OnClickListener itemClickListner)
    {
        pokelistner = itemClickListner;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycleitem,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return carArray.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView poke_img;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            poke_img = itemView.findViewById(R.id.poke_image);

            itemView.setTag(this);
            itemView.setOnClickListener(pokelistner);
        }
    }

}
