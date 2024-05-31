package com.example.hw4m3

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw4m3.databinding.ItemContinentBinding;

import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ViewHolder> {
    private ArrayList<String> continentList;
    private com.example.hw4m3.OnClick onClick;

    public ContinentAdapter(ArrayList<String> continentList, com.example.hw4m3.OnClick onClick) {
        this.continentList = continentList;
        this.onClick = onClick;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemContinentBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(continentList.get(position));
        holder.itemView.setOnClickListener(v -> onClick.click(position));
    }

    @Override
    public int getItemCount() {
        return continentList.size();
    }
}

class ViewHolder extends RecyclerView.ViewHolder {
    private ItemContinentBinding binding;

    public ViewHolder(@NonNull ItemContinentBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void onBind(String continent) {
        binding.tvContinent.setText(continent);
    }
}